//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.11 at 11:22:02 AM PDT 
//


package edu.nps.moves.jaxb.dis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vectoringNozzleSystemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vectoringNozzleSystemData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horizontalDeflectionAngle" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="verticalDeflectionAngle" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vectoringNozzleSystemData", propOrder = {
    "horizontalDeflectionAngle",
    "verticalDeflectionAngle"
})
public class VectoringNozzleSystemData {

    protected float horizontalDeflectionAngle;
    protected float verticalDeflectionAngle;

    /**
     * Gets the value of the horizontalDeflectionAngle property.
     * 
     */
    public float getHorizontalDeflectionAngle() {
        return horizontalDeflectionAngle;
    }

    /**
     * Sets the value of the horizontalDeflectionAngle property.
     * 
     */
    public void setHorizontalDeflectionAngle(float value) {
        this.horizontalDeflectionAngle = value;
    }

    /**
     * Gets the value of the verticalDeflectionAngle property.
     * 
     */
    public float getVerticalDeflectionAngle() {
        return verticalDeflectionAngle;
    }

    /**
     * Sets the value of the verticalDeflectionAngle property.
     * 
     */
    public void setVerticalDeflectionAngle(float value) {
        this.verticalDeflectionAngle = value;
    }

}
