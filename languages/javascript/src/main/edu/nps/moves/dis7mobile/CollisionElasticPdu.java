package edu.nps.moves.dis7mobile;

import java.util.*;
import java.io.*;
import edu.nps.moves.disenum.*;
import edu.nps.moves.disutil.*;


/**
 * Information about elastic collisions in a DIS exercise shall be communicated using a Collision-Elastic PDU. Section 7.2.4. COMPLETE
 *
 * Copyright (c) 2008-2010, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class CollisionElasticPdu extends EntityInformationFamilyPdu implements Serializable
{
   /** This field shall identify the entity that is issuing the PDU and shall be represented by an Entity Identifier record (see 6.2.28) */
   protected EntityID  issuingEntityID = new EntityID(); 

   /** This field shall identify the entity that has collided with the issuing entity. This field shall be a valid identifier of an entity or server capable of responding to the receipt of this Collision-Elastic PDU. This field shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  collidingEntityID = new EntityID(); 

   /** This field shall contain an identification generated by the issuing simulation application to associate related collision events. This field shall be represented by an Event Identifier record (see 6.2.34). */
   protected EventIdentifier  collisionEventID = new EventIdentifier(); 

   /** some padding */
   protected short  pad = (short)0;

   /** This field shall contain the velocity at the time the collision is detected at the point the collision is detected. The velocity shall be represented in world coordinates. This field shall be represented by the Linear Velocity Vector record [see 6.2.95 item c)] */
   protected Vector3Float  contactVelocity = new Vector3Float(); 

   /** This field shall contain the mass of the issuing entity and shall be represented by a 32-bit floating point number representing kilograms */
   protected float  mass;

   /** This field shall specify the location of the collision with respect to the entity with which the issuing entity collided. This field shall be represented by an Entity Coordinate Vector record [see 6.2.95 item a)]. */
   protected Vector3Float  locationOfImpact = new Vector3Float(); 

   /** These six records represent the six independent components of a positive semi-definite matrix formed by pre-multiplying and post-multiplying the tensor of inertia, by the anti-symmetric matrix generated by the moment arm, and shall be represented by 32-bit floating point numbers (see 5.3.4.4) */
   protected float  collisionIntermediateResultXX;

   /** tensor values */
   protected float  collisionIntermediateResultXY;

   /** tensor values */
   protected float  collisionIntermediateResultXZ;

   /** tensor values */
   protected float  collisionIntermediateResultYY;

   /** tensor values */
   protected float  collisionIntermediateResultYZ;

   /** tensor values */
   protected float  collisionIntermediateResultZZ;

   /** This record shall represent the normal vector to the surface at the point of collision detection. The surface normal shall be represented in world coordinates. This field shall be represented by an Entity Coordinate Vector record [see 6.2.95 item a)]. */
   protected Vector3Float  unitSurfaceNormal = new Vector3Float(); 

   /** This field shall represent the degree to which energy is conserved in a collision and shall be represented by a 32-bit floating point number. In addition, it represents a free parameter by which simulation application developers may tune their collision interactions. */
   protected float  coefficientOfRestitution;


/** Constructor */
 public CollisionElasticPdu()
 {
    setPduType( (short)66 );
    setProtocolFamily( (short)1 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + issuingEntityID.getMarshalledSize();  // issuingEntityID
   marshalSize = marshalSize + collidingEntityID.getMarshalledSize();  // collidingEntityID
   marshalSize = marshalSize + collisionEventID.getMarshalledSize();  // collisionEventID
   marshalSize = marshalSize + 2;  // pad
   marshalSize = marshalSize + contactVelocity.getMarshalledSize();  // contactVelocity
   marshalSize = marshalSize + 4;  // mass
   marshalSize = marshalSize + locationOfImpact.getMarshalledSize();  // locationOfImpact
   marshalSize = marshalSize + 4;  // collisionIntermediateResultXX
   marshalSize = marshalSize + 4;  // collisionIntermediateResultXY
   marshalSize = marshalSize + 4;  // collisionIntermediateResultXZ
   marshalSize = marshalSize + 4;  // collisionIntermediateResultYY
   marshalSize = marshalSize + 4;  // collisionIntermediateResultYZ
   marshalSize = marshalSize + 4;  // collisionIntermediateResultZZ
   marshalSize = marshalSize + unitSurfaceNormal.getMarshalledSize();  // unitSurfaceNormal
   marshalSize = marshalSize + 4;  // coefficientOfRestitution

   return marshalSize;
}


public void setIssuingEntityID(EntityID pIssuingEntityID)
{ issuingEntityID = pIssuingEntityID;
}

public EntityID getIssuingEntityID()
{ return issuingEntityID; 
}

public void setCollidingEntityID(EntityID pCollidingEntityID)
{ collidingEntityID = pCollidingEntityID;
}

public EntityID getCollidingEntityID()
{ return collidingEntityID; 
}

public void setCollisionEventID(EventIdentifier pCollisionEventID)
{ collisionEventID = pCollisionEventID;
}

public EventIdentifier getCollisionEventID()
{ return collisionEventID; 
}

public void setPad(short pPad)
{ pad = pPad;
}

public short getPad()
{ return pad; 
}

public void setContactVelocity(Vector3Float pContactVelocity)
{ contactVelocity = pContactVelocity;
}

public Vector3Float getContactVelocity()
{ return contactVelocity; 
}

public void setMass(float pMass)
{ mass = pMass;
}

public float getMass()
{ return mass; 
}

public void setLocationOfImpact(Vector3Float pLocationOfImpact)
{ locationOfImpact = pLocationOfImpact;
}

public Vector3Float getLocationOfImpact()
{ return locationOfImpact; 
}

public void setCollisionIntermediateResultXX(float pCollisionIntermediateResultXX)
{ collisionIntermediateResultXX = pCollisionIntermediateResultXX;
}

public float getCollisionIntermediateResultXX()
{ return collisionIntermediateResultXX; 
}

public void setCollisionIntermediateResultXY(float pCollisionIntermediateResultXY)
{ collisionIntermediateResultXY = pCollisionIntermediateResultXY;
}

public float getCollisionIntermediateResultXY()
{ return collisionIntermediateResultXY; 
}

public void setCollisionIntermediateResultXZ(float pCollisionIntermediateResultXZ)
{ collisionIntermediateResultXZ = pCollisionIntermediateResultXZ;
}

public float getCollisionIntermediateResultXZ()
{ return collisionIntermediateResultXZ; 
}

public void setCollisionIntermediateResultYY(float pCollisionIntermediateResultYY)
{ collisionIntermediateResultYY = pCollisionIntermediateResultYY;
}

public float getCollisionIntermediateResultYY()
{ return collisionIntermediateResultYY; 
}

public void setCollisionIntermediateResultYZ(float pCollisionIntermediateResultYZ)
{ collisionIntermediateResultYZ = pCollisionIntermediateResultYZ;
}

public float getCollisionIntermediateResultYZ()
{ return collisionIntermediateResultYZ; 
}

public void setCollisionIntermediateResultZZ(float pCollisionIntermediateResultZZ)
{ collisionIntermediateResultZZ = pCollisionIntermediateResultZZ;
}

public float getCollisionIntermediateResultZZ()
{ return collisionIntermediateResultZZ; 
}

public void setUnitSurfaceNormal(Vector3Float pUnitSurfaceNormal)
{ unitSurfaceNormal = pUnitSurfaceNormal;
}

public Vector3Float getUnitSurfaceNormal()
{ return unitSurfaceNormal; 
}

public void setCoefficientOfRestitution(float pCoefficientOfRestitution)
{ coefficientOfRestitution = pCoefficientOfRestitution;
}

public float getCoefficientOfRestitution()
{ return coefficientOfRestitution; 
}


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       issuingEntityID.marshal(dos);
       collidingEntityID.marshal(dos);
       collisionEventID.marshal(dos);
       dos.writeShort( (short)pad);
       contactVelocity.marshal(dos);
       dos.writeFloat( (float)mass);
       locationOfImpact.marshal(dos);
       dos.writeFloat( (float)collisionIntermediateResultXX);
       dos.writeFloat( (float)collisionIntermediateResultXY);
       dos.writeFloat( (float)collisionIntermediateResultXZ);
       dos.writeFloat( (float)collisionIntermediateResultYY);
       dos.writeFloat( (float)collisionIntermediateResultYZ);
       dos.writeFloat( (float)collisionIntermediateResultZZ);
       unitSurfaceNormal.marshal(dos);
       dos.writeFloat( (float)coefficientOfRestitution);
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
       issuingEntityID.unmarshal(dis);
       collidingEntityID.unmarshal(dis);
       collisionEventID.unmarshal(dis);
       pad = dis.readShort();
       contactVelocity.unmarshal(dis);
       mass = dis.readFloat();
       locationOfImpact.unmarshal(dis);
       collisionIntermediateResultXX = dis.readFloat();
       collisionIntermediateResultXY = dis.readFloat();
       collisionIntermediateResultXZ = dis.readFloat();
       collisionIntermediateResultYY = dis.readFloat();
       collisionIntermediateResultYZ = dis.readFloat();
       collisionIntermediateResultZZ = dis.readFloat();
       unitSurfaceNormal.unmarshal(dis);
       coefficientOfRestitution = dis.readFloat();
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
       issuingEntityID.marshal(buff);
       collidingEntityID.marshal(buff);
       collisionEventID.marshal(buff);
       buff.putShort( (short)pad);
       contactVelocity.marshal(buff);
       buff.putFloat( (float)mass);
       locationOfImpact.marshal(buff);
       buff.putFloat( (float)collisionIntermediateResultXX);
       buff.putFloat( (float)collisionIntermediateResultXY);
       buff.putFloat( (float)collisionIntermediateResultXZ);
       buff.putFloat( (float)collisionIntermediateResultYY);
       buff.putFloat( (float)collisionIntermediateResultYZ);
       buff.putFloat( (float)collisionIntermediateResultZZ);
       unitSurfaceNormal.marshal(buff);
       buff.putFloat( (float)coefficientOfRestitution);
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

       issuingEntityID.unmarshal(buff);
       collidingEntityID.unmarshal(buff);
       collisionEventID.unmarshal(buff);
       pad = buff.getShort();
       contactVelocity.unmarshal(buff);
       mass = buff.getFloat();
       locationOfImpact.unmarshal(buff);
       collisionIntermediateResultXX = buff.getFloat();
       collisionIntermediateResultXY = buff.getFloat();
       collisionIntermediateResultXZ = buff.getFloat();
       collisionIntermediateResultYY = buff.getFloat();
       collisionIntermediateResultYZ = buff.getFloat();
       collisionIntermediateResultZZ = buff.getFloat();
       unitSurfaceNormal.unmarshal(buff);
       coefficientOfRestitution = buff.getFloat();
 } // end of unmarshal method 


 /*
  * The equals method doesn't always work--mostly it works only on classes that consist only of primitives. Be careful.
  */
@Override
 public boolean equals(Object obj)
 {

    if(this == obj){
      return true;
    }

    if(obj == null){
       return false;
    }

    if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

    if(!(obj instanceof CollisionElasticPdu))
        return false;

     final CollisionElasticPdu rhs = (CollisionElasticPdu)obj;

     if( ! (issuingEntityID.equals( rhs.issuingEntityID) )) ivarsEqual = false;
     if( ! (collidingEntityID.equals( rhs.collidingEntityID) )) ivarsEqual = false;
     if( ! (collisionEventID.equals( rhs.collisionEventID) )) ivarsEqual = false;
     if( ! (pad == rhs.pad)) ivarsEqual = false;
     if( ! (contactVelocity.equals( rhs.contactVelocity) )) ivarsEqual = false;
     if( ! (mass == rhs.mass)) ivarsEqual = false;
     if( ! (locationOfImpact.equals( rhs.locationOfImpact) )) ivarsEqual = false;
     if( ! (collisionIntermediateResultXX == rhs.collisionIntermediateResultXX)) ivarsEqual = false;
     if( ! (collisionIntermediateResultXY == rhs.collisionIntermediateResultXY)) ivarsEqual = false;
     if( ! (collisionIntermediateResultXZ == rhs.collisionIntermediateResultXZ)) ivarsEqual = false;
     if( ! (collisionIntermediateResultYY == rhs.collisionIntermediateResultYY)) ivarsEqual = false;
     if( ! (collisionIntermediateResultYZ == rhs.collisionIntermediateResultYZ)) ivarsEqual = false;
     if( ! (collisionIntermediateResultZZ == rhs.collisionIntermediateResultZZ)) ivarsEqual = false;
     if( ! (unitSurfaceNormal.equals( rhs.unitSurfaceNormal) )) ivarsEqual = false;
     if( ! (coefficientOfRestitution == rhs.coefficientOfRestitution)) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }
} // end of class
