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
 * <p>Java class for variableDatum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variableDatum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variableDatumID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="variableDatumLength" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="variableDatums" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variableDatum", propOrder = {
    "variableDatumID",
    "variableDatumLength",
    "variableDatums"
})
public class VariableDatum {

    protected long variableDatumID;
    protected long variableDatumLength;
    @XmlElement(nillable = true)
    protected List<Object> variableDatums;

    /**
     * Gets the value of the variableDatumID property.
     * 
     */
    public long getVariableDatumID() {
        return variableDatumID;
    }

    /**
     * Sets the value of the variableDatumID property.
     * 
     */
    public void setVariableDatumID(long value) {
        this.variableDatumID = value;
    }

    /**
     * Gets the value of the variableDatumLength property.
     * 
     */
    public long getVariableDatumLength() {
        return variableDatumLength;
    }

    /**
     * Sets the value of the variableDatumLength property.
     * 
     */
    public void setVariableDatumLength(long value) {
        this.variableDatumLength = value;
    }

    /**
     * Gets the value of the variableDatums property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableDatums property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableDatums().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getVariableDatums() {
        if (variableDatums == null) {
            variableDatums = new ArrayList<Object>();
        }
        return this.variableDatums;
    }

}
