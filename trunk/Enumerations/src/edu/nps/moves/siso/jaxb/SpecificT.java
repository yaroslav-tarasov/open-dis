//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.12 at 09:43:36 PM PST 
//


package edu.nps.moves.siso.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specific_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specific_t">
 *   &lt;complexContent>
 *     &lt;extension base="{}genericentry_t">
 *       &lt;sequence>
 *         &lt;element name="extra" type="{}extra_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="id2" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_t", propOrder = {
    "extra"
})
public class SpecificT
    extends GenericentryT
{

    protected List<ExtraT> extra;
    @XmlAttribute(required = true)
    protected float id;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger id2;

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraT }
     * 
     * 
     */
    public List<ExtraT> getExtra() {
        if (extra == null) {
            extra = new ArrayList<ExtraT>();
        }
        return this.extra;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public float getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(float value) {
        this.id = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId2(BigInteger value) {
        this.id2 = value;
    }

}
