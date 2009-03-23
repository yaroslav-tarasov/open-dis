using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * 48 bit piece of data
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
public class SixByteChunk : Object
{
   /** six bytes of arbitrary data */
   protected byte[]  _otherParameters = new byte[6]; 


/** Constructor */
   ///<summary>
   ///48 bit piece of data
   ///</summary>
 public SixByteChunk()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 6 * 1;  // _otherParameters

   return marshalSize;
}


   ///<summary>
   ///six bytes of arbitrary data
   ///</summary>
public void setOtherParameters(byte[] pOtherParameters)
{ _otherParameters = pOtherParameters;
}

   ///<summary>
   ///six bytes of arbitrary data
   ///</summary>
public byte[] getOtherParameters()
{ return _otherParameters; }

   ///<summary>
   ///six bytes of arbitrary data
   ///</summary>
[XmlArray(ElementName="otherParameters")]
public byte[] OtherParameters
{
     get
{
          return _otherParameters;
}
     set
{
          _otherParameters = value;
}
}


///<summary>
///Marshal the data to the DataOutputStream.  Note: Length needs to be set before calling this method
///</summary>
public void marshal(DataOutputStream dos)
{
    try 
    {

       for(int idx = 0; idx < _otherParameters.Length; idx++)
       {
           dos.writeByte(_otherParameters[idx]);
       } // end of array marshaling

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
       for(int idx = 0; idx < _otherParameters.Length; idx++)
       {
                _otherParameters[idx] = dis.readByte();
       } // end of array unmarshaling
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
    sb.Append("<SixByteChunk>"  + System.Environment.NewLine);
    try 
    {

       for(int idx = 0; idx < _otherParameters.Length; idx++)
       {
           sb.Append("<otherParameters"+ idx.ToString() + " type=\"byte\">" + _otherParameters[idx] + "</otherParameters"+ idx.ToString() + "> " + System.Environment.NewLine);
       } // end of array reflection

    sb.Append("</SixByteChunk>"  + System.Environment.NewLine);
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
 public bool equals(SixByteChunk rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;


     for(int idx = 0; idx < 6; idx++)
     {
          if(!(_otherParameters[idx] == rhs._otherParameters[idx])) ivarsEqual = false;
     }


    return ivarsEqual;
 }
} // end of class
} // end of namespace
