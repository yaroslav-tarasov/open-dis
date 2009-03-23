using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * Section 5.2.17. Three floating point values representing an orientation, psi, theta, and phi, aka the euler angles, in radians
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
public class Orientation : Object
{
   protected float  _psi;

   protected float  _theta;

   protected float  _phi;


/** Constructor */
   ///<summary>
   ///Section 5.2.17. Three floating point values representing an orientation, psi, theta, and phi, aka the euler angles, in radians
   ///</summary>
 public Orientation()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 4;  // _psi
   marshalSize = marshalSize + 4;  // _theta
   marshalSize = marshalSize + 4;  // _phi

   return marshalSize;
}


public void setPsi(float pPsi)
{ _psi = pPsi;
}

[XmlElement(Type= typeof(float), ElementName="psi")]
public float Psi
{
     get
{
          return _psi;
}
     set
{
          _psi = value;
}
}

public void setTheta(float pTheta)
{ _theta = pTheta;
}

[XmlElement(Type= typeof(float), ElementName="theta")]
public float Theta
{
     get
{
          return _theta;
}
     set
{
          _theta = value;
}
}

public void setPhi(float pPhi)
{ _phi = pPhi;
}

[XmlElement(Type= typeof(float), ElementName="phi")]
public float Phi
{
     get
{
          return _phi;
}
     set
{
          _phi = value;
}
}


///<summary>
///Marshal the data to the DataOutputStream.  Note: Length needs to be set before calling this method
///</summary>
public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeFloat( (float)_psi);
       dos.writeFloat( (float)_theta);
       dos.writeFloat( (float)_phi);
    } // end try 
    catch(Exception e)
    { 
      Trace.WriteLine(e);
      Trace.Flush();
    }
} // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       _psi = dis.readFloat();
       _theta = dis.readFloat();
       _phi = dis.readFloat();
    } // end try 
   catch(Exception e)
    { 
      Trace.WriteLine(e); 
      Trace.Flush();
    }
 } // end of unmarshal method 


   ///<summary>
   ///This allows for a quick display of PDU data.  The current format is unacceptable and only used for debugging.
   ///This will be modified in the future to provide a better display.  Usage: 
   ///pdu.GetType().InvokeMember("reflection", System.Reflection.BindingFlags.InvokeMethod, null, pdu, new object[] { sb });
   ///where pdu is an object representing a single pdu and sb is a StringBuilder.
   ///Note: The supplied Utilities folder contains a method called 'DecodePDU' in the PDUProcessor Class that provides this functionality
   ///</summary>
public void reflection(StringBuilder sb)
{
    sb.Append("<Orientation>"  + System.Environment.NewLine);
    try 
    {
           sb.Append("<psi type=\"float\">" + _psi.ToString() + "</psi> " + System.Environment.NewLine);
           sb.Append("<theta type=\"float\">" + _theta.ToString() + "</theta> " + System.Environment.NewLine);
           sb.Append("<phi type=\"float\">" + _phi.ToString() + "</phi> " + System.Environment.NewLine);
    sb.Append("</Orientation>"  + System.Environment.NewLine);
    } // end try 
    catch(Exception e)
    { 
      Trace.WriteLine(e);
      Trace.Flush();
}
    } // end of marshal method

 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public bool equals(Orientation rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_psi == rhs._psi)) ivarsEqual = false;
     if( ! (_theta == rhs._theta)) ivarsEqual = false;
     if( ! (_phi == rhs._phi)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace
