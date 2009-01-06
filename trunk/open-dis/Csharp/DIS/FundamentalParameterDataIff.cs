using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * 5.2.45. Fundamental IFF atc data
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
public class FundamentalParameterDataIff : Object
{
   /** ERP */
   protected float  _erp;

   /** frequency */
   protected float  _frequency;

   /** pgrf */
   protected float  _pgrf;

   /** Pulse width */
   protected float  _pulseWidth;

   /** Burst length */
   protected uint  _burstLength;

   /** Applicable modes enumeration */
   protected byte  _applicableModes;

   /** padding */
   protected ushort  _pad2;

   /** padding */
   protected byte  _pad3;


/** Constructor */
 public FundamentalParameterDataIff()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 4;  // _erp
   marshalSize = marshalSize + 4;  // _frequency
   marshalSize = marshalSize + 4;  // _pgrf
   marshalSize = marshalSize + 4;  // _pulseWidth
   marshalSize = marshalSize + 4;  // _burstLength
   marshalSize = marshalSize + 1;  // _applicableModes
   marshalSize = marshalSize + 2;  // _pad2
   marshalSize = marshalSize + 1;  // _pad3

   return marshalSize;
}


public void setErp(float pErp)
{ _erp = pErp;
}

[XmlElement(Type= typeof(float), ElementName="erp")]
public float Erp
{
     get
{
          return _erp;
}
     set
{
          _erp = value;
}
}

public void setFrequency(float pFrequency)
{ _frequency = pFrequency;
}

[XmlElement(Type= typeof(float), ElementName="frequency")]
public float Frequency
{
     get
{
          return _frequency;
}
     set
{
          _frequency = value;
}
}

public void setPgrf(float pPgrf)
{ _pgrf = pPgrf;
}

[XmlElement(Type= typeof(float), ElementName="pgrf")]
public float Pgrf
{
     get
{
          return _pgrf;
}
     set
{
          _pgrf = value;
}
}

public void setPulseWidth(float pPulseWidth)
{ _pulseWidth = pPulseWidth;
}

[XmlElement(Type= typeof(float), ElementName="pulseWidth")]
public float PulseWidth
{
     get
{
          return _pulseWidth;
}
     set
{
          _pulseWidth = value;
}
}

public void setBurstLength(uint pBurstLength)
{ _burstLength = pBurstLength;
}

[XmlElement(Type= typeof(uint), ElementName="burstLength")]
public uint BurstLength
{
     get
{
          return _burstLength;
}
     set
{
          _burstLength = value;
}
}

public void setApplicableModes(byte pApplicableModes)
{ _applicableModes = pApplicableModes;
}

[XmlElement(Type= typeof(byte), ElementName="applicableModes")]
public byte ApplicableModes
{
     get
{
          return _applicableModes;
}
     set
{
          _applicableModes = value;
}
}

public void setPad2(ushort pPad2)
{ _pad2 = pPad2;
}

[XmlElement(Type= typeof(ushort), ElementName="pad2")]
public ushort Pad2
{
     get
{
          return _pad2;
}
     set
{
          _pad2 = value;
}
}

public void setPad3(byte pPad3)
{ _pad3 = pPad3;
}

[XmlElement(Type= typeof(byte), ElementName="pad3")]
public byte Pad3
{
     get
{
          return _pad3;
}
     set
{
          _pad3 = value;
}
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeFloat( (float)_erp);
       dos.writeFloat( (float)_frequency);
       dos.writeFloat( (float)_pgrf);
       dos.writeFloat( (float)_pulseWidth);
       dos.writeUint( (uint)_burstLength);
       dos.writeByte( (byte)_applicableModes);
       dos.writeUshort( (ushort)_pad2);
       dos.writeByte( (byte)_pad3);
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
       _erp = dis.readFloat();
       _frequency = dis.readFloat();
       _pgrf = dis.readFloat();
       _pulseWidth = dis.readFloat();
       _burstLength = dis.readUint();
       _applicableModes = dis.readByte();
       _pad2 = dis.readUshort();
       _pad3 = dis.readByte();
    } // end try 
   catch(Exception e)
    { 
      Trace.WriteLine(e); 
      Trace.Flush();
    }
 } // end of unmarshal method 


public void reflection(StringBuilder sb)
{
    sb.Append("----- FundamentalParameterDataIff-----"  + System.Environment.NewLine);
    try 
    {
           sb.Append("float\t _erp\t " + _erp.ToString() + System.Environment.NewLine);
           sb.Append("float\t _frequency\t " + _frequency.ToString() + System.Environment.NewLine);
           sb.Append("float\t _pgrf\t " + _pgrf.ToString() + System.Environment.NewLine);
           sb.Append("float\t _pulseWidth\t " + _pulseWidth.ToString() + System.Environment.NewLine);
           sb.Append("uint\t _burstLength\t " + _burstLength.ToString() + System.Environment.NewLine);
           sb.Append("byte\t _applicableModes\t " + _applicableModes.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _pad2\t " + _pad2.ToString() + System.Environment.NewLine);
           sb.Append("byte\t _pad3\t " + _pad3.ToString() + System.Environment.NewLine);
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
 public bool equals(FundamentalParameterDataIff rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_erp == rhs._erp)) ivarsEqual = false;
     if( ! (_frequency == rhs._frequency)) ivarsEqual = false;
     if( ! (_pgrf == rhs._pgrf)) ivarsEqual = false;
     if( ! (_pulseWidth == rhs._pulseWidth)) ivarsEqual = false;
     if( ! (_burstLength == rhs._burstLength)) ivarsEqual = false;
     if( ! (_applicableModes == rhs._applicableModes)) ivarsEqual = false;
     if( ! (_pad2 == rhs._pad2)) ivarsEqual = false;
     if( ! (_pad3 == rhs._pad3)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace
