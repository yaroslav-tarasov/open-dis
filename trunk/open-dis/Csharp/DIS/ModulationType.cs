using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * Radio modulation
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
public class ModulationType : Object
{
   /** spread spectrum, 16 bit boolean array */
   protected ushort  _spreadSpectrum;

   /** major */
   protected ushort  _major;

   /** detail */
   protected ushort  _detail;

   /** system */
   protected ushort  _system;


/** Constructor */
   ///<summary>
   ///Radio modulation
   ///</summary>
 public ModulationType()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 2;  // _spreadSpectrum
   marshalSize = marshalSize + 2;  // _major
   marshalSize = marshalSize + 2;  // _detail
   marshalSize = marshalSize + 2;  // _system

   return marshalSize;
}


   ///<summary>
   ///spread spectrum, 16 bit boolean array
   ///</summary>
public void setSpreadSpectrum(ushort pSpreadSpectrum)
{ _spreadSpectrum = pSpreadSpectrum;
}

[XmlElement(Type= typeof(ushort), ElementName="spreadSpectrum")]
public ushort SpreadSpectrum
{
     get
{
          return _spreadSpectrum;
}
     set
{
          _spreadSpectrum = value;
}
}

   ///<summary>
   ///major
   ///</summary>
public void setMajor(ushort pMajor)
{ _major = pMajor;
}

[XmlElement(Type= typeof(ushort), ElementName="major")]
public ushort Major
{
     get
{
          return _major;
}
     set
{
          _major = value;
}
}

   ///<summary>
   ///detail
   ///</summary>
public void setDetail(ushort pDetail)
{ _detail = pDetail;
}

[XmlElement(Type= typeof(ushort), ElementName="detail")]
public ushort Detail
{
     get
{
          return _detail;
}
     set
{
          _detail = value;
}
}

   ///<summary>
   ///system
   ///</summary>
public void setSystem(ushort pSystem)
{ _system = pSystem;
}

[XmlElement(Type= typeof(ushort), ElementName="system")]
public ushort System_
{
     get
{
          return _system;
}
     set
{
          _system = value;
}
}


///<summary>
///Marshal the data to the DataOutputStream.  Note: Length needs to be set before calling this method
///</summary>
public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeUshort( (ushort)_spreadSpectrum);
       dos.writeUshort( (ushort)_major);
       dos.writeUshort( (ushort)_detail);
       dos.writeUshort( (ushort)_system);
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
       _spreadSpectrum = dis.readUshort();
       _major = dis.readUshort();
       _detail = dis.readUshort();
       _system = dis.readUshort();
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
    sb.Append("<ModulationType>"  + System.Environment.NewLine);
    try 
    {
           sb.Append("<spreadSpectrum type=\"ushort\">" + _spreadSpectrum.ToString() + "</spreadSpectrum> " + System.Environment.NewLine);
           sb.Append("<major type=\"ushort\">" + _major.ToString() + "</major> " + System.Environment.NewLine);
           sb.Append("<detail type=\"ushort\">" + _detail.ToString() + "</detail> " + System.Environment.NewLine);
           sb.Append("<system type=\"ushort\">" + _system.ToString() + "</system> " + System.Environment.NewLine);
    sb.Append("</ModulationType>"  + System.Environment.NewLine);
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
 public bool equals(ModulationType rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_spreadSpectrum == rhs._spreadSpectrum)) ivarsEqual = false;
     if( ! (_major == rhs._major)) ivarsEqual = false;
     if( ! (_detail == rhs._detail)) ivarsEqual = false;
     if( ! (_system == rhs._system)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace
