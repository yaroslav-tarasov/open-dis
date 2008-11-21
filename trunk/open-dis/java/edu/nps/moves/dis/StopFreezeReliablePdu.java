package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.3.12.4: Stop freeze simulation, relaible. COMPLETE
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class StopFreezeReliablePdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** time in real world for this operation to happen */
   protected ClockTime  realWorldTime = new ClockTime(); 

   /** Reason for stopping/freezing simulation */
   protected short  reason;

   /** internal behvior of the simulation while frozen */
   protected short  frozenBehavior;

   /** reliablity level */
   protected short  requiredReliablityService;

   /** padding */
   protected short  pad1;

   /** Request ID */
   protected long  requestID;


/** Constructor */
 public StopFreezeReliablePdu()
 {
    setPduType( (short)54 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + realWorldTime.getMarshalledSize();  // realWorldTime
   marshalSize = marshalSize + 1;  // reason
   marshalSize = marshalSize + 1;  // frozenBehavior
   marshalSize = marshalSize + 1;  // requiredReliablityService
   marshalSize = marshalSize + 1;  // pad1
   marshalSize = marshalSize + 4;  // requestID

   return marshalSize;
}


public void setRealWorldTime(ClockTime pRealWorldTime)
{ realWorldTime = pRealWorldTime;
}

@XmlElement
public ClockTime getRealWorldTime()
{ return realWorldTime; 
}

public void setReason(short pReason)
{ reason = pReason;
}

@XmlAttribute
public short getReason()
{ return reason; 
}

public void setFrozenBehavior(short pFrozenBehavior)
{ frozenBehavior = pFrozenBehavior;
}

@XmlAttribute
public short getFrozenBehavior()
{ return frozenBehavior; 
}

public void setRequiredReliablityService(short pRequiredReliablityService)
{ requiredReliablityService = pRequiredReliablityService;
}

@XmlAttribute
public short getRequiredReliablityService()
{ return requiredReliablityService; 
}

public void setPad1(short pPad1)
{ pad1 = pPad1;
}

@XmlAttribute
public short getPad1()
{ return pad1; 
}

public void setRequestID(long pRequestID)
{ requestID = pRequestID;
}

@XmlAttribute
public long getRequestID()
{ return requestID; 
}


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       realWorldTime.marshal(dos);
       dos.writeByte( (byte)reason);
       dos.writeByte( (byte)frozenBehavior);
       dos.writeByte( (byte)requiredReliablityService);
       dos.writeByte( (byte)pad1);
       dos.writeInt( (int)requestID);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    super.unmarshal(dis);

    try 
    {
       realWorldTime.unmarshal(dis);
       reason = (short)dis.readUnsignedByte();
       frozenBehavior = (short)dis.readUnsignedByte();
       requiredReliablityService = (short)dis.readUnsignedByte();
       pad1 = (short)dis.readUnsignedByte();
       requestID = dis.readInt();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


/**
 * Packs a Pdu into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @since ??
 */
public void marshal(java.nio.ByteBuffer buff)
{
    super.marshal(buff);
       realWorldTime.marshal(buff);
       buff.put( (byte)reason);
       buff.put( (byte)frozenBehavior);
       buff.put( (byte)requiredReliablityService);
       buff.put( (byte)pad1);
       buff.putInt( (int)requestID);
    } // end of marshal method

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 * @since ??
 */
public void unmarshal(java.nio.ByteBuffer buff)
{
    super.unmarshal(buff);

       realWorldTime.unmarshal(buff);
       reason = (short)(buff.get() & 0xFF);
       frozenBehavior = (short)(buff.get() & 0xFF);
       requiredReliablityService = (short)(buff.get() & 0xFF);
       pad1 = (short)(buff.get() & 0xFF);
       requestID = buff.getInt();
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(StopFreezeReliablePdu rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (realWorldTime.equals( rhs.realWorldTime) )) ivarsEqual = false;
     if( ! (reason == rhs.reason)) ivarsEqual = false;
     if( ! (frozenBehavior == rhs.frozenBehavior)) ivarsEqual = false;
     if( ! (requiredReliablityService == rhs.requiredReliablityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
