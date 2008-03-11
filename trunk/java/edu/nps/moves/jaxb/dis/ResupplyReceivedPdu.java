//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.11 at 11:22:02 AM PDT 
//


package edu.nps.moves.jaxb.dis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resupplyReceivedPdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resupplyReceivedPdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}logisticsFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="numberOfSupplyTypes" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="padding1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="padding2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="receivingEntityID" type="{}entityID" minOccurs="0"/>
 *         &lt;element name="supplies" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplyingEntityID" type="{}entityID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resupplyReceivedPdu", propOrder = {
    "numberOfSupplyTypes",
    "padding1",
    "padding2",
    "receivingEntityID",
    "supplies",
    "supplyingEntityID"
})
public class ResupplyReceivedPdu
    extends LogisticsFamilyPdu
{

    protected short numberOfSupplyTypes;
    protected short padding1;
    protected byte padding2;
    protected EntityID receivingEntityID;
    @XmlElement(nillable = true)
    protected List<Object> supplies;
    protected EntityID supplyingEntityID;

    /**
     * Gets the value of the numberOfSupplyTypes property.
     * 
     */
    public short getNumberOfSupplyTypes() {
        return numberOfSupplyTypes;
    }

    /**
     * Sets the value of the numberOfSupplyTypes property.
     * 
     */
    public void setNumberOfSupplyTypes(short value) {
        this.numberOfSupplyTypes = value;
    }

    /**
     * Gets the value of the padding1 property.
     * 
     */
    public short getPadding1() {
        return padding1;
    }

    /**
     * Sets the value of the padding1 property.
     * 
     */
    public void setPadding1(short value) {
        this.padding1 = value;
    }

    /**
     * Gets the value of the padding2 property.
     * 
     */
    public byte getPadding2() {
        return padding2;
    }

    /**
     * Sets the value of the padding2 property.
     * 
     */
    public void setPadding2(byte value) {
        this.padding2 = value;
    }

    /**
     * Gets the value of the receivingEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityID }
     *     
     */
    public EntityID getReceivingEntityID() {
        return receivingEntityID;
    }

    /**
     * Sets the value of the receivingEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityID }
     *     
     */
    public void setReceivingEntityID(EntityID value) {
        this.receivingEntityID = value;
    }

    /**
     * Gets the value of the supplies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSupplies() {
        if (supplies == null) {
            supplies = new ArrayList<Object>();
        }
        return this.supplies;
    }

    /**
     * Gets the value of the supplyingEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityID }
     *     
     */
    public EntityID getSupplyingEntityID() {
        return supplyingEntityID;
    }

    /**
     * Sets the value of the supplyingEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityID }
     *     
     */
    public void setSupplyingEntityID(EntityID value) {
        this.supplyingEntityID = value;
    }

}
