// Copyright (c) 1995-2009 held by the author(s).  All rights reserved.
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// * Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// * Redistributions in binary form must reproduce the above copyright
//   notice, this list of conditions and the following disclaimer
//   in the documentation and/or other materials provided with the
//   distribution.
// * Neither the names of the Naval Postgraduate School (NPS)
//   Modeling Virtual Environments and Simulation (MOVES) Institute
//   (http://www.nps.edu and http://www.MovesInstitute.org)
//   nor the names of its contributors may be used to endorse or
//   promote products derived from this software without specific
//   prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// AS IS AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
// FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
// COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
// BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
// CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
// ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.
//
// Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All 
// rights reserved. This work is licensed under the BSD open source license,
// available at https://www.movesinstitute.org/licenses/bsd.html
//
// Author: DMcG
// Modified for use with C#:
//  - Peter Smith (Naval Air Warfare Center - Training Systems Division)
//  - Zvonko Bostjancic (Blubit d.o.o. - zvonko.bostjancic@blubit.si)

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Text;
using System.Xml.Serialization;
using OpenDis.Core;
using OpenDis.Utilities;

namespace OpenDis.Dis1998
{
    /// <summary>
    /// 5.3.7.4.1: Navigational and IFF PDU. COMPLETE
    /// </summary>
    [Serializable]
    [XmlRoot]
    [XmlInclude(typeof(EntityID))]
    [XmlInclude(typeof(EventID))]
    [XmlInclude(typeof(Vector3Float))]
    [XmlInclude(typeof(SystemID))]
    [XmlInclude(typeof(IffFundamentalData))]
    public partial class IffAtcNavAidsLayer1Pdu : DistributedEmissionsFamilyPdu, IEquatable<IffAtcNavAidsLayer1Pdu>
    {
        /// <summary>
        /// ID of the entity that is the source of the emissions
        /// </summary>
        private EntityID _emittingEntityId = new EntityID();

        /// <summary>
        /// Number generated by the issuing simulation to associate realted events.
        /// </summary>
        private EventID _eventID = new EventID();

        /// <summary>
        /// Location wrt entity. There is some ambugiuity in the standard here, but this is the order it is listed in the table.
        /// </summary>
        private Vector3Float _location = new Vector3Float();

        /// <summary>
        /// System ID information
        /// </summary>
        private SystemID _systemID = new SystemID();

        /// <summary>
        /// padding
        /// </summary>
        private ushort _pad2;

        /// <summary>
        /// fundamental parameters
        /// </summary>
        private IffFundamentalData _fundamentalParameters = new IffFundamentalData();

        /// <summary>
        /// Initializes a new instance of the <see cref="IffAtcNavAidsLayer1Pdu"/> class.
        /// </summary>
        public IffAtcNavAidsLayer1Pdu()
        {
            PduType = (byte)28;
        }

        /// <summary>
        /// Implements the operator !=.
        /// </summary>
        /// <param name="left">The left operand.</param>
        /// <param name="right">The right operand.</param>
        /// <returns>
        /// 	<c>true</c> if operands are not equal; otherwise, <c>false</c>.
        /// </returns>
        public static bool operator !=(IffAtcNavAidsLayer1Pdu left, IffAtcNavAidsLayer1Pdu right)
        {
            return !(left == right);
        }

        /// <summary>
        /// Implements the operator ==.
        /// </summary>
        /// <param name="left">The left operand.</param>
        /// <param name="right">The right operand.</param>
        /// <returns>
        /// 	<c>true</c> if both operands are equal; otherwise, <c>false</c>.
        /// </returns>
        public static bool operator ==(IffAtcNavAidsLayer1Pdu left, IffAtcNavAidsLayer1Pdu right)
        {
            if (object.ReferenceEquals(left, right))
            {
                return true;
            }

            if (((object)left == null) || ((object)right == null))
            {
                return false;
            }

            return left.Equals(right);
        }

        public override int GetMarshalledSize()
        {
            int marshalSize = 0; 

            marshalSize = base.GetMarshalledSize();
            marshalSize += this._emittingEntityId.GetMarshalledSize();  // this._emittingEntityId
            marshalSize += this._eventID.GetMarshalledSize();  // this._eventID
            marshalSize += this._location.GetMarshalledSize();  // this._location
            marshalSize += this._systemID.GetMarshalledSize();  // this._systemID
            marshalSize += 2;  // this._pad2
            marshalSize += this._fundamentalParameters.GetMarshalledSize();  // this._fundamentalParameters
            return marshalSize;
        }

        /// <summary>
        /// Gets or sets the ID of the entity that is the source of the emissions
        /// </summary>
        [XmlElement(Type = typeof(EntityID), ElementName = "emittingEntityId")]
        public EntityID EmittingEntityId
        {
            get
            {
                return this._emittingEntityId;
            }

            set
            {
                this._emittingEntityId = value;
            }
        }

        /// <summary>
        /// Gets or sets the Number generated by the issuing simulation to associate realted events.
        /// </summary>
        [XmlElement(Type = typeof(EventID), ElementName = "eventID")]
        public EventID EventID
        {
            get
            {
                return this._eventID;
            }

            set
            {
                this._eventID = value;
            }
        }

        /// <summary>
        /// Gets or sets the Location wrt entity. There is some ambugiuity in the standard here, but this is the order it is listed in the table.
        /// </summary>
        [XmlElement(Type = typeof(Vector3Float), ElementName = "location")]
        public Vector3Float Location
        {
            get
            {
                return this._location;
            }

            set
            {
                this._location = value;
            }
        }

        /// <summary>
        /// Gets or sets the System ID information
        /// </summary>
        [XmlElement(Type = typeof(SystemID), ElementName = "systemID")]
        public SystemID SystemID
        {
            get
            {
                return this._systemID;
            }

            set
            {
                this._systemID = value;
            }
        }

        /// <summary>
        /// Gets or sets the padding
        /// </summary>
        [XmlElement(Type = typeof(ushort), ElementName = "pad2")]
        public ushort Pad2
        {
            get
            {
                return this._pad2;
            }

            set
            {
                this._pad2 = value;
            }
        }

        /// <summary>
        /// Gets or sets the fundamental parameters
        /// </summary>
        [XmlElement(Type = typeof(IffFundamentalData), ElementName = "fundamentalParameters")]
        public IffFundamentalData FundamentalParameters
        {
            get
            {
                return this._fundamentalParameters;
            }

            set
            {
                this._fundamentalParameters = value;
            }
        }

        /// <summary>
        /// Automatically sets the length of the marshalled data, then calls the marshal method.
        /// </summary>
        /// <param name="dos">The DataOutputStream instance to which the PDU is marshaled.</param>
        public override void MarshalAutoLengthSet(DataOutputStream dos)
        {
            // Set the length prior to marshalling data
            this.Length = (ushort)this.GetMarshalledSize();
            this.Marshal(dos);
        }

        /// <summary>
        /// Marshal the data to the DataOutputStream.  Note: Length needs to be set before calling this method
        /// </summary>
        /// <param name="dos">The DataOutputStream instance to which the PDU is marshaled.</param>
        [SuppressMessage("Microsoft.Design", "CA1031:DoNotCatchGeneralExceptionTypes", Justification = "Due to ignoring errors.")]
        public override void Marshal(DataOutputStream dos)
        {
            base.Marshal(dos);
            if (dos != null)
            {
                try
                {
                    this._emittingEntityId.Marshal(dos);
                    this._eventID.Marshal(dos);
                    this._location.Marshal(dos);
                    this._systemID.Marshal(dos);
                    dos.WriteUnsignedShort((ushort)this._pad2);
                    this._fundamentalParameters.Marshal(dos);
                }
                catch (Exception e)
                {
#if DEBUG
                    Trace.WriteLine(e);
                    Trace.Flush();
#endif
                    this.OnException(e);
                }
            }
        }

        [SuppressMessage("Microsoft.Design", "CA1031:DoNotCatchGeneralExceptionTypes", Justification = "Due to ignoring errors.")]
        public override void Unmarshal(DataInputStream dis)
        {
            base.Unmarshal(dis);

            if (dis != null)
            {
                try
                {
                    this._emittingEntityId.Unmarshal(dis);
                    this._eventID.Unmarshal(dis);
                    this._location.Unmarshal(dis);
                    this._systemID.Unmarshal(dis);
                    this._pad2 = dis.ReadUnsignedShort();
                    this._fundamentalParameters.Unmarshal(dis);
                }
                catch (Exception e)
                {
#if DEBUG
                    Trace.WriteLine(e);
                    Trace.Flush();
#endif
                    this.OnException(e);
                }
            }
        }

        /// <summary>
        /// This allows for a quick display of PDU data.  The current format is unacceptable and only used for debugging.
        /// This will be modified in the future to provide a better display.  Usage: 
        /// pdu.GetType().InvokeMember("Reflection", System.Reflection.BindingFlags.InvokeMethod, null, pdu, new object[] { sb });
        /// where pdu is an object representing a single pdu and sb is a StringBuilder.
        /// Note: The supplied Utilities folder contains a method called 'DecodePDU' in the PDUProcessor Class that provides this functionality
        /// </summary>
        /// <param name="sb">The StringBuilder instance to which the PDU is written to.</param>
        [SuppressMessage("Microsoft.Design", "CA1031:DoNotCatchGeneralExceptionTypes", Justification = "Due to ignoring errors.")]
        public override void Reflection(StringBuilder sb)
        {
            sb.AppendLine("<IffAtcNavAidsLayer1Pdu>");
            base.Reflection(sb);
            try
            {
                sb.AppendLine("<emittingEntityId>");
                this._emittingEntityId.Reflection(sb);
                sb.AppendLine("</emittingEntityId>");
                sb.AppendLine("<eventID>");
                this._eventID.Reflection(sb);
                sb.AppendLine("</eventID>");
                sb.AppendLine("<location>");
                this._location.Reflection(sb);
                sb.AppendLine("</location>");
                sb.AppendLine("<systemID>");
                this._systemID.Reflection(sb);
                sb.AppendLine("</systemID>");
                sb.AppendLine("<pad2 type=\"ushort\">" + this._pad2.ToString(CultureInfo.InvariantCulture) + "</pad2>");
                sb.AppendLine("<fundamentalParameters>");
                this._fundamentalParameters.Reflection(sb);
                sb.AppendLine("</fundamentalParameters>");
                sb.AppendLine("</IffAtcNavAidsLayer1Pdu>");
            }
            catch (Exception e)
            {
#if DEBUG
                    Trace.WriteLine(e);
                    Trace.Flush();
#endif
                    this.OnException(e);
            }
        }

        /// <summary>
        /// Determines whether the specified <see cref="System.Object"/> is equal to this instance.
        /// </summary>
        /// <param name="obj">The <see cref="System.Object"/> to compare with this instance.</param>
        /// <returns>
        /// 	<c>true</c> if the specified <see cref="System.Object"/> is equal to this instance; otherwise, <c>false</c>.
        /// </returns>
        public override bool Equals(object obj)
        {
            return this == obj as IffAtcNavAidsLayer1Pdu;
        }

        /// <summary>
        /// Compares for reference AND value equality.
        /// </summary>
        /// <param name="obj">The object to compare with this instance.</param>
        /// <returns>
        /// 	<c>true</c> if both operands are equal; otherwise, <c>false</c>.
        /// </returns>
        public bool Equals(IffAtcNavAidsLayer1Pdu obj)
        {
            bool ivarsEqual = true;

            if (obj.GetType() != this.GetType())
            {
                return false;
            }

            ivarsEqual = base.Equals(obj);

            if (!this._emittingEntityId.Equals(obj._emittingEntityId))
            {
                ivarsEqual = false;
            }

            if (!this._eventID.Equals(obj._eventID))
            {
                ivarsEqual = false;
            }

            if (!this._location.Equals(obj._location))
            {
                ivarsEqual = false;
            }

            if (!this._systemID.Equals(obj._systemID))
            {
                ivarsEqual = false;
            }

            if (this._pad2 != obj._pad2)
            {
                ivarsEqual = false;
            }

            if (!this._fundamentalParameters.Equals(obj._fundamentalParameters))
            {
                ivarsEqual = false;
            }

            return ivarsEqual;
        }

        /// <summary>
        /// HashCode Helper
        /// </summary>
        /// <param name="hash">The hash value.</param>
        /// <returns>The new hash value.</returns>
        private static int GenerateHash(int hash)
        {
            hash = hash << (5 + hash);
            return hash;
        }

        /// <summary>
        /// Gets the hash code.
        /// </summary>
        /// <returns>The hash code.</returns>
        public override int GetHashCode()
        {
            int result = 0;

            result = GenerateHash(result) ^ base.GetHashCode();

            result = GenerateHash(result) ^ this._emittingEntityId.GetHashCode();
            result = GenerateHash(result) ^ this._eventID.GetHashCode();
            result = GenerateHash(result) ^ this._location.GetHashCode();
            result = GenerateHash(result) ^ this._systemID.GetHashCode();
            result = GenerateHash(result) ^ this._pad2.GetHashCode();
            result = GenerateHash(result) ^ this._fundamentalParameters.GetHashCode();

            return result;
        }
    }
}
