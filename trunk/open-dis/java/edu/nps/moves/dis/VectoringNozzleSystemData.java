package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Data about a vectoring nozzle system
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class VectoringNozzleSystemData extends Object implements Serializable
{
   /** horizontal deflection angle */
   protected float  horizontalDeflectionAngle;

   /** vertical deflection angle */
   protected float  verticalDeflectionAngle;


/** Constructor */
 public VectoringNozzleSystemData()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 4;  // horizontalDeflectionAngle
   marshalSize = marshalSize + 4;  // verticalDeflectionAngle

   return marshalSize;
}


public void setHorizontalDeflectionAngle(float pHorizontalDeflectionAngle)
{ horizontalDeflectionAngle = pHorizontalDeflectionAngle;
}

@XmlAttribute
public float getHorizontalDeflectionAngle()
{ return horizontalDeflectionAngle; 
}

public void setVerticalDeflectionAngle(float pVerticalDeflectionAngle)
{ verticalDeflectionAngle = pVerticalDeflectionAngle;
}

@XmlAttribute
public float getVerticalDeflectionAngle()
{ return verticalDeflectionAngle; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeFloat( (float)horizontalDeflectionAngle);
       dos.writeFloat( (float)verticalDeflectionAngle);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       horizontalDeflectionAngle = dis.readFloat();
       verticalDeflectionAngle = dis.readFloat();
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
       buff.putFloat( (float)horizontalDeflectionAngle);
       buff.putFloat( (float)verticalDeflectionAngle);
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
       horizontalDeflectionAngle = buff.getFloat();
       verticalDeflectionAngle = buff.getFloat();
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(VectoringNozzleSystemData rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (horizontalDeflectionAngle == rhs.horizontalDeflectionAngle)) ivarsEqual = false;
     if( ! (verticalDeflectionAngle == rhs.verticalDeflectionAngle)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
