//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.31 at 02:05:02 PM PST 
//


package edu.nps.moves.jaxb.dis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layerHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layerHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layerNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="layerSpecificInformaiton" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layerHeader", propOrder = {
    "layerNumber",
    "layerSpecificInformaiton",
    "length"
})
public class LayerHeader {

    protected short layerNumber;
    protected short layerSpecificInformaiton;
    protected int length;

    /**
     * Gets the value of the layerNumber property.
     * 
     */
    public short getLayerNumber() {
        return layerNumber;
    }

    /**
     * Sets the value of the layerNumber property.
     * 
     */
    public void setLayerNumber(short value) {
        this.layerNumber = value;
    }

    /**
     * Gets the value of the layerSpecificInformaiton property.
     * 
     */
    public short getLayerSpecificInformaiton() {
        return layerSpecificInformaiton;
    }

    /**
     * Sets the value of the layerSpecificInformaiton property.
     * 
     */
    public void setLayerSpecificInformaiton(short value) {
        this.layerSpecificInformaiton = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

}
