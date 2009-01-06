using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * Section 5.3.9.4 The joining of two or more simulation entities is communicated by this PDU. COMPLETE
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
[XmlInclude(typeof(Relationship))]
[XmlInclude(typeof(Vector3Float))]
[XmlInclude(typeof(NamedLocation))]
[XmlInclude(typeof(EntityType))]
public class IsPartOfPdu : EntityManagementFamilyPdu
{
   /** ID of entity originating PDU */
   protected EntityID  _orginatingEntityID = new EntityID(); 

   /** ID of entity receiving PDU */
   protected EntityID  _receivingEntityID = new EntityID(); 

   /** relationship of joined parts */
   protected Relationship  _relationship = new Relationship(); 

   /** location of part; centroid of part in host's coordinate system. x=range, y=bearing, z=0 */
   protected Vector3Float  _partLocation = new Vector3Float(); 

   /** named location */
   protected NamedLocation  _namedLocationID = new NamedLocation(); 

   /** entity type */
   protected EntityType  _partEntityType = new EntityType(); 


/** Constructor */
 public IsPartOfPdu()
 {
    PduType = (byte)36;
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = base.getMarshalledSize();
   marshalSize = marshalSize + _orginatingEntityID.getMarshalledSize();  // _orginatingEntityID
   marshalSize = marshalSize + _receivingEntityID.getMarshalledSize();  // _receivingEntityID
   marshalSize = marshalSize + _relationship.getMarshalledSize();  // _relationship
   marshalSize = marshalSize + _partLocation.getMarshalledSize();  // _partLocation
   marshalSize = marshalSize + _namedLocationID.getMarshalledSize();  // _namedLocationID
   marshalSize = marshalSize + _partEntityType.getMarshalledSize();  // _partEntityType

   return marshalSize;
}


public void setOrginatingEntityID(EntityID pOrginatingEntityID)
{ _orginatingEntityID = pOrginatingEntityID;
}

public EntityID getOrginatingEntityID()
{ return _orginatingEntityID; 
}

[XmlElement(Type= typeof(EntityID), ElementName="orginatingEntityID")]
public EntityID OrginatingEntityID
{
     get
{
          return _orginatingEntityID;
}
     set
{
          _orginatingEntityID = value;
}
}

public void setReceivingEntityID(EntityID pReceivingEntityID)
{ _receivingEntityID = pReceivingEntityID;
}

public EntityID getReceivingEntityID()
{ return _receivingEntityID; 
}

[XmlElement(Type= typeof(EntityID), ElementName="receivingEntityID")]
public EntityID ReceivingEntityID
{
     get
{
          return _receivingEntityID;
}
     set
{
          _receivingEntityID = value;
}
}

public void setRelationship(Relationship pRelationship)
{ _relationship = pRelationship;
}

public Relationship getRelationship()
{ return _relationship; 
}

[XmlElement(Type= typeof(Relationship), ElementName="relationship")]
public Relationship Relationship
{
     get
{
          return _relationship;
}
     set
{
          _relationship = value;
}
}

public void setPartLocation(Vector3Float pPartLocation)
{ _partLocation = pPartLocation;
}

public Vector3Float getPartLocation()
{ return _partLocation; 
}

[XmlElement(Type= typeof(Vector3Float), ElementName="partLocation")]
public Vector3Float PartLocation
{
     get
{
          return _partLocation;
}
     set
{
          _partLocation = value;
}
}

public void setNamedLocationID(NamedLocation pNamedLocationID)
{ _namedLocationID = pNamedLocationID;
}

public NamedLocation getNamedLocationID()
{ return _namedLocationID; 
}

[XmlElement(Type= typeof(NamedLocation), ElementName="namedLocationID")]
public NamedLocation NamedLocationID
{
     get
{
          return _namedLocationID;
}
     set
{
          _namedLocationID = value;
}
}

public void setPartEntityType(EntityType pPartEntityType)
{ _partEntityType = pPartEntityType;
}

public EntityType getPartEntityType()
{ return _partEntityType; 
}

[XmlElement(Type= typeof(EntityType), ElementName="partEntityType")]
public EntityType PartEntityType
{
     get
{
          return _partEntityType;
}
     set
{
          _partEntityType = value;
}
}


public void marshal(DataOutputStream dos)
{
    base.marshal(dos);
    try 
    {
       _orginatingEntityID.marshal(dos);
       _receivingEntityID.marshal(dos);
       _relationship.marshal(dos);
       _partLocation.marshal(dos);
       _namedLocationID.marshal(dos);
       _partEntityType.marshal(dos);
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
       _orginatingEntityID.unmarshal(dis);
       _receivingEntityID.unmarshal(dis);
       _relationship.unmarshal(dis);
       _partLocation.unmarshal(dis);
       _namedLocationID.unmarshal(dis);
       _partEntityType.unmarshal(dis);
    } // end try 
   catch(Exception e)
    { 
      Trace.WriteLine(e); 
      Trace.Flush();
    }
 } // end of unmarshal method 


public void reflection(StringBuilder sb)
{
    sb.Append("----- IsPartOfPdu-----"  + System.Environment.NewLine);
    base.reflection(sb);
    try 
    {
       sb.Append("=====_orginatingEntityID=====" + System.Environment.NewLine);
       _orginatingEntityID.reflection(sb);
       sb.Append("=====_receivingEntityID=====" + System.Environment.NewLine);
       _receivingEntityID.reflection(sb);
       sb.Append("=====_relationship=====" + System.Environment.NewLine);
       _relationship.reflection(sb);
       sb.Append("=====_partLocation=====" + System.Environment.NewLine);
       _partLocation.reflection(sb);
       sb.Append("=====_namedLocationID=====" + System.Environment.NewLine);
       _namedLocationID.reflection(sb);
       sb.Append("=====_partEntityType=====" + System.Environment.NewLine);
       _partEntityType.reflection(sb);
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
 public bool equals(IsPartOfPdu rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_orginatingEntityID.Equals( rhs._orginatingEntityID) )) ivarsEqual = false;
     if( ! (_receivingEntityID.Equals( rhs._receivingEntityID) )) ivarsEqual = false;
     if( ! (_relationship.Equals( rhs._relationship) )) ivarsEqual = false;
     if( ! (_partLocation.Equals( rhs._partLocation) )) ivarsEqual = false;
     if( ! (_namedLocationID.Equals( rhs._namedLocationID) )) ivarsEqual = false;
     if( ! (_partEntityType.Equals( rhs._partEntityType) )) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace
