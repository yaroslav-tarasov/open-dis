using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * Sectioin 5.3.4.1. Information about someone firing something. COMPLETE
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 * Modified for use with C#:
 * Peter Smith (Naval Air Warfare Center - Training Systems Division)
 */
[Serializable]
[XmlRoot]
[XmlInclude(typeof(EntityID))]
[XmlInclude(typeof(EventID))]
[XmlInclude(typeof(Vector3Double))]
[XmlInclude(typeof(BurstDescriptor))]
[XmlInclude(typeof(Vector3Float))]
public class FirePdu : WarfareFamilyPdu
{
   /** ID of the munition that is being shot */
   protected EntityID  _munitionID = new EntityID(); 

   /** ID of event */
   protected EventID  _eventID = new EventID(); 

   protected uint  _fireMissionIndex;

   /** location of the firing event */
   protected Vector3Double  _locationInWorldCoordinates = new Vector3Double(); 

   /** Describes munitions used in the firing event */
   protected BurstDescriptor  _burstDescriptor = new BurstDescriptor(); 

   /** Velocity of the ammunition */
   protected Vector3Float  _velocity = new Vector3Float(); 

   /** range to the target */
   protected float  _range;


/** Constructor */
 public FirePdu()
 {
    PduType = (byte)2;
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = base.getMarshalledSize();
   marshalSize = marshalSize + _munitionID.getMarshalledSize();  // _munitionID
   marshalSize = marshalSize + _eventID.getMarshalledSize();  // _eventID
   marshalSize = marshalSize + 4;  // _fireMissionIndex
   marshalSize = marshalSize + _locationInWorldCoordinates.getMarshalledSize();  // _locationInWorldCoordinates
   marshalSize = marshalSize + _burstDescriptor.getMarshalledSize();  // _burstDescriptor
   marshalSize = marshalSize + _velocity.getMarshalledSize();  // _velocity
   marshalSize = marshalSize + 4;  // _range

   return marshalSize;
}


public void setMunitionID(EntityID pMunitionID)
{ _munitionID = pMunitionID;
}

public EntityID getMunitionID()
{ return _munitionID; 
}

[XmlElement(Type= typeof(EntityID), ElementName="munitionID")]
public EntityID MunitionID
{
     get
{
          return _munitionID;
}
     set
{
          _munitionID = value;
}
}

public void setEventID(EventID pEventID)
{ _eventID = pEventID;
}

public EventID getEventID()
{ return _eventID; 
}

[XmlElement(Type= typeof(EventID), ElementName="eventID")]
public EventID EventID
{
     get
{
          return _eventID;
}
     set
{
          _eventID = value;
}
}

public void setFireMissionIndex(uint pFireMissionIndex)
{ _fireMissionIndex = pFireMissionIndex;
}

[XmlElement(Type= typeof(uint), ElementName="fireMissionIndex")]
public uint FireMissionIndex
{
     get
{
          return _fireMissionIndex;
}
     set
{
          _fireMissionIndex = value;
}
}

public void setLocationInWorldCoordinates(Vector3Double pLocationInWorldCoordinates)
{ _locationInWorldCoordinates = pLocationInWorldCoordinates;
}

public Vector3Double getLocationInWorldCoordinates()
{ return _locationInWorldCoordinates; 
}

[XmlElement(Type= typeof(Vector3Double), ElementName="locationInWorldCoordinates")]
public Vector3Double LocationInWorldCoordinates
{
     get
{
          return _locationInWorldCoordinates;
}
     set
{
          _locationInWorldCoordinates = value;
}
}

public void setBurstDescriptor(BurstDescriptor pBurstDescriptor)
{ _burstDescriptor = pBurstDescriptor;
}

public BurstDescriptor getBurstDescriptor()
{ return _burstDescriptor; 
}

[XmlElement(Type= typeof(BurstDescriptor), ElementName="burstDescriptor")]
public BurstDescriptor BurstDescriptor
{
     get
{
          return _burstDescriptor;
}
     set
{
          _burstDescriptor = value;
}
}

public void setVelocity(Vector3Float pVelocity)
{ _velocity = pVelocity;
}

public Vector3Float getVelocity()
{ return _velocity; 
}

[XmlElement(Type= typeof(Vector3Float), ElementName="velocity")]
public Vector3Float Velocity
{
     get
{
          return _velocity;
}
     set
{
          _velocity = value;
}
}

public void setRange(float pRange)
{ _range = pRange;
}

[XmlElement(Type= typeof(float), ElementName="range")]
public float Range
{
     get
{
          return _range;
}
     set
{
          _range = value;
}
}


public void marshal(DataOutputStream dos)
{
    base.marshal(dos);
    try 
    {
       _munitionID.marshal(dos);
       _eventID.marshal(dos);
       dos.writeUint( (uint)_fireMissionIndex);
       _locationInWorldCoordinates.marshal(dos);
       _burstDescriptor.marshal(dos);
       _velocity.marshal(dos);
       dos.writeFloat( (float)_range);
    } // end try 
    catch(Exception e)
    { 
      Trace.WriteLine(e);
      Trace.Flush();
    }
} // end of marshal method

public void unmarshal(DataInputStream dis)
{
    base.unmarshal(dis);

    try 
    {
       _munitionID.unmarshal(dis);
       _eventID.unmarshal(dis);
       _fireMissionIndex = dis.readUint();
       _locationInWorldCoordinates.unmarshal(dis);
       _burstDescriptor.unmarshal(dis);
       _velocity.unmarshal(dis);
       _range = dis.readFloat();
    } // end try 
   catch(Exception e)
    { 
      Trace.WriteLine(e); 
      Trace.Flush();
    }
 } // end of unmarshal method 


public void reflection(StringBuilder sb)
{
    sb.Append("----- FirePdu-----"  + System.Environment.NewLine);
    base.reflection(sb);
    try 
    {
       sb.Append("=====_munitionID=====" + System.Environment.NewLine);
       _munitionID.reflection(sb);
       sb.Append("=====_eventID=====" + System.Environment.NewLine);
       _eventID.reflection(sb);
           sb.Append("uint\t _fireMissionIndex\t " + _fireMissionIndex.ToString() + System.Environment.NewLine);
       sb.Append("=====_locationInWorldCoordinates=====" + System.Environment.NewLine);
       _locationInWorldCoordinates.reflection(sb);
       sb.Append("=====_burstDescriptor=====" + System.Environment.NewLine);
       _burstDescriptor.reflection(sb);
       sb.Append("=====_velocity=====" + System.Environment.NewLine);
       _velocity.reflection(sb);
           sb.Append("float\t _range\t " + _range.ToString() + System.Environment.NewLine);
    } // end try 
    catch(Exception e)
    { 
      Trace.WriteLine(e);
      Trace.Flush();
}
    } // end of marshal method

 /**
  * The equals method doesn't always work--mostly it works only on on classes that consist only of primitives. Be careful.
  */
 public bool equals(FirePdu rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_munitionID.Equals( rhs._munitionID) )) ivarsEqual = false;
     if( ! (_eventID.Equals( rhs._eventID) )) ivarsEqual = false;
     if( ! (_fireMissionIndex == rhs._fireMissionIndex)) ivarsEqual = false;
     if( ! (_locationInWorldCoordinates.Equals( rhs._locationInWorldCoordinates) )) ivarsEqual = false;
     if( ! (_burstDescriptor.Equals( rhs._burstDescriptor) )) ivarsEqual = false;
     if( ! (_velocity.Equals( rhs._velocity) )) ivarsEqual = false;
     if( ! (_range == rhs._range)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace