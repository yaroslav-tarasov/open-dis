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
 * <p>Java class for acousticEmitterSystemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acousticEmitterSystemData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acousticEmitterSystem" type="{}acousticEmitterSystem" minOccurs="0"/>
 *         &lt;element name="beamRecords" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emitterLocation" type="{}vector3Float" minOccurs="0"/>
 *         &lt;element name="emitterSystemDataLength" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numberOfBeams" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="pad2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acousticEmitterSystemData", propOrder = {
    "acousticEmitterSystem",
    "beamRecords",
    "emitterLocation",
    "emitterSystemDataLength",
    "numberOfBeams",
    "pad2"
})
public class AcousticEmitterSystemData {

    protected AcousticEmitterSystem acousticEmitterSystem;
    @XmlElement(nillable = true)
    protected List<Object> beamRecords;
    protected Vector3Float emitterLocation;
    protected short emitterSystemDataLength;
    protected short numberOfBeams;
    protected int pad2;

    /**
     * Gets the value of the acousticEmitterSystem property.
     * 
     * @return
     *     possible object is
     *     {@link AcousticEmitterSystem }
     *     
     */
    public AcousticEmitterSystem getAcousticEmitterSystem() {
        return acousticEmitterSystem;
    }

    /**
     * Sets the value of the acousticEmitterSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcousticEmitterSystem }
     *     
     */
    public void setAcousticEmitterSystem(AcousticEmitterSystem value) {
        this.acousticEmitterSystem = value;
    }

    /**
     * Gets the value of the beamRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beamRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeamRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBeamRecords() {
        if (beamRecords == null) {
            beamRecords = new ArrayList<Object>();
        }
        return this.beamRecords;
    }

    /**
     * Gets the value of the emitterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Float }
     *     
     */
    public Vector3Float getEmitterLocation() {
        return emitterLocation;
    }

    /**
     * Sets the value of the emitterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Float }
     *     
     */
    public void setEmitterLocation(Vector3Float value) {
        this.emitterLocation = value;
    }

    /**
     * Gets the value of the emitterSystemDataLength property.
     * 
     */
    public short getEmitterSystemDataLength() {
        return emitterSystemDataLength;
    }

    /**
     * Sets the value of the emitterSystemDataLength property.
     * 
     */
    public void setEmitterSystemDataLength(short value) {
        this.emitterSystemDataLength = value;
    }

    /**
     * Gets the value of the numberOfBeams property.
     * 
     */
    public short getNumberOfBeams() {
        return numberOfBeams;
    }

    /**
     * Sets the value of the numberOfBeams property.
     * 
     */
    public void setNumberOfBeams(short value) {
        this.numberOfBeams = value;
    }

    /**
     * Gets the value of the pad2 property.
     * 
     */
    public int getPad2() {
        return pad2;
    }

    /**
     * Sets the value of the pad2 property.
     * 
     */
    public void setPad2(int value) {
        this.pad2 = value;
    }

}
