//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.31 at 02:05:02 PM PST 
//


package edu.nps.moves.jaxb.dis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fastEntityStatePdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fastEntityStatePdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}entityInformationFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="altCategory" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="altCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altDomain" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="altEntityKind" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="altExtra" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="altSpecific" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="altSubcategory" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="articulationParameters" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capabilities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deadReckoningAlgorithm" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entityAppearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entityKind" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="extra" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="forceId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="marking" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="numberOfArticulationParameters" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="otherParameters" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="phi" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="psi" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="specific" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="subcategory" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="XAcceleration" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="XAngularVelocity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="XLocation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="XVelocity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="YAcceleration" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="YAngularVelocity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="YLocation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="YVelocity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ZAcceleration" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ZAngularVelocity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ZLocation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ZVelocity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fastEntityStatePdu", propOrder = {
    "altCategory",
    "altCountry",
    "altDomain",
    "altEntityKind",
    "altExtra",
    "altSpecific",
    "altSubcategory",
    "application",
    "articulationParameters",
    "capabilities",
    "category",
    "country",
    "deadReckoningAlgorithm",
    "domain",
    "entity",
    "entityAppearance",
    "entityKind",
    "extra",
    "forceId",
    "marking",
    "numberOfArticulationParameters",
    "otherParameters",
    "phi",
    "psi",
    "site",
    "specific",
    "subcategory",
    "theta",
    "xAcceleration",
    "xAngularVelocity",
    "xLocation",
    "xVelocity",
    "yAcceleration",
    "yAngularVelocity",
    "yLocation",
    "yVelocity",
    "zAcceleration",
    "zAngularVelocity",
    "zLocation",
    "zVelocity"
})
public class FastEntityStatePdu
    extends EntityInformationFamilyPdu
{

    protected short altCategory;
    protected int altCountry;
    protected short altDomain;
    protected short altEntityKind;
    protected short altExtra;
    protected short altSpecific;
    protected short altSubcategory;
    protected int application;
    @XmlElement(nillable = true)
    protected List<Object> articulationParameters;
    protected int capabilities;
    protected short category;
    protected int country;
    protected short deadReckoningAlgorithm;
    protected short domain;
    protected int entity;
    protected int entityAppearance;
    protected short entityKind;
    protected short extra;
    protected short forceId;
    protected byte[] marking;
    protected byte numberOfArticulationParameters;
    protected byte[] otherParameters;
    protected float phi;
    protected float psi;
    protected int site;
    protected short specific;
    protected short subcategory;
    protected float theta;
    @XmlElement(name = "XAcceleration")
    protected float xAcceleration;
    @XmlElement(name = "XAngularVelocity")
    protected float xAngularVelocity;
    @XmlElement(name = "XLocation")
    protected float xLocation;
    @XmlElement(name = "XVelocity")
    protected float xVelocity;
    @XmlElement(name = "YAcceleration")
    protected float yAcceleration;
    @XmlElement(name = "YAngularVelocity")
    protected float yAngularVelocity;
    @XmlElement(name = "YLocation")
    protected float yLocation;
    @XmlElement(name = "YVelocity")
    protected float yVelocity;
    @XmlElement(name = "ZAcceleration")
    protected float zAcceleration;
    @XmlElement(name = "ZAngularVelocity")
    protected float zAngularVelocity;
    @XmlElement(name = "ZLocation")
    protected float zLocation;
    @XmlElement(name = "ZVelocity")
    protected float zVelocity;

    /**
     * Gets the value of the altCategory property.
     * 
     */
    public short getAltCategory() {
        return altCategory;
    }

    /**
     * Sets the value of the altCategory property.
     * 
     */
    public void setAltCategory(short value) {
        this.altCategory = value;
    }

    /**
     * Gets the value of the altCountry property.
     * 
     */
    public int getAltCountry() {
        return altCountry;
    }

    /**
     * Sets the value of the altCountry property.
     * 
     */
    public void setAltCountry(int value) {
        this.altCountry = value;
    }

    /**
     * Gets the value of the altDomain property.
     * 
     */
    public short getAltDomain() {
        return altDomain;
    }

    /**
     * Sets the value of the altDomain property.
     * 
     */
    public void setAltDomain(short value) {
        this.altDomain = value;
    }

    /**
     * Gets the value of the altEntityKind property.
     * 
     */
    public short getAltEntityKind() {
        return altEntityKind;
    }

    /**
     * Sets the value of the altEntityKind property.
     * 
     */
    public void setAltEntityKind(short value) {
        this.altEntityKind = value;
    }

    /**
     * Gets the value of the altExtra property.
     * 
     */
    public short getAltExtra() {
        return altExtra;
    }

    /**
     * Sets the value of the altExtra property.
     * 
     */
    public void setAltExtra(short value) {
        this.altExtra = value;
    }

    /**
     * Gets the value of the altSpecific property.
     * 
     */
    public short getAltSpecific() {
        return altSpecific;
    }

    /**
     * Sets the value of the altSpecific property.
     * 
     */
    public void setAltSpecific(short value) {
        this.altSpecific = value;
    }

    /**
     * Gets the value of the altSubcategory property.
     * 
     */
    public short getAltSubcategory() {
        return altSubcategory;
    }

    /**
     * Sets the value of the altSubcategory property.
     * 
     */
    public void setAltSubcategory(short value) {
        this.altSubcategory = value;
    }

    /**
     * Gets the value of the application property.
     * 
     */
    public int getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     */
    public void setApplication(int value) {
        this.application = value;
    }

    /**
     * Gets the value of the articulationParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articulationParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticulationParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getArticulationParameters() {
        if (articulationParameters == null) {
            articulationParameters = new ArrayList<Object>();
        }
        return this.articulationParameters;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     */
    public int getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     */
    public void setCapabilities(int value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the category property.
     * 
     */
    public short getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(short value) {
        this.category = value;
    }

    /**
     * Gets the value of the country property.
     * 
     */
    public int getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(int value) {
        this.country = value;
    }

    /**
     * Gets the value of the deadReckoningAlgorithm property.
     * 
     */
    public short getDeadReckoningAlgorithm() {
        return deadReckoningAlgorithm;
    }

    /**
     * Sets the value of the deadReckoningAlgorithm property.
     * 
     */
    public void setDeadReckoningAlgorithm(short value) {
        this.deadReckoningAlgorithm = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     */
    public short getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     */
    public void setDomain(short value) {
        this.domain = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     */
    public int getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     */
    public void setEntity(int value) {
        this.entity = value;
    }

    /**
     * Gets the value of the entityAppearance property.
     * 
     */
    public int getEntityAppearance() {
        return entityAppearance;
    }

    /**
     * Sets the value of the entityAppearance property.
     * 
     */
    public void setEntityAppearance(int value) {
        this.entityAppearance = value;
    }

    /**
     * Gets the value of the entityKind property.
     * 
     */
    public short getEntityKind() {
        return entityKind;
    }

    /**
     * Sets the value of the entityKind property.
     * 
     */
    public void setEntityKind(short value) {
        this.entityKind = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     */
    public short getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     */
    public void setExtra(short value) {
        this.extra = value;
    }

    /**
     * Gets the value of the forceId property.
     * 
     */
    public short getForceId() {
        return forceId;
    }

    /**
     * Sets the value of the forceId property.
     * 
     */
    public void setForceId(short value) {
        this.forceId = value;
    }

    /**
     * Gets the value of the marking property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMarking() {
        return marking;
    }

    /**
     * Sets the value of the marking property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMarking(byte[] value) {
        this.marking = ((byte[]) value);
    }

    /**
     * Gets the value of the numberOfArticulationParameters property.
     * 
     */
    public byte getNumberOfArticulationParameters() {
        return numberOfArticulationParameters;
    }

    /**
     * Sets the value of the numberOfArticulationParameters property.
     * 
     */
    public void setNumberOfArticulationParameters(byte value) {
        this.numberOfArticulationParameters = value;
    }

    /**
     * Gets the value of the otherParameters property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOtherParameters() {
        return otherParameters;
    }

    /**
     * Sets the value of the otherParameters property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOtherParameters(byte[] value) {
        this.otherParameters = ((byte[]) value);
    }

    /**
     * Gets the value of the phi property.
     * 
     */
    public float getPhi() {
        return phi;
    }

    /**
     * Sets the value of the phi property.
     * 
     */
    public void setPhi(float value) {
        this.phi = value;
    }

    /**
     * Gets the value of the psi property.
     * 
     */
    public float getPsi() {
        return psi;
    }

    /**
     * Sets the value of the psi property.
     * 
     */
    public void setPsi(float value) {
        this.psi = value;
    }

    /**
     * Gets the value of the site property.
     * 
     */
    public int getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     */
    public void setSite(int value) {
        this.site = value;
    }

    /**
     * Gets the value of the specific property.
     * 
     */
    public short getSpecific() {
        return specific;
    }

    /**
     * Sets the value of the specific property.
     * 
     */
    public void setSpecific(short value) {
        this.specific = value;
    }

    /**
     * Gets the value of the subcategory property.
     * 
     */
    public short getSubcategory() {
        return subcategory;
    }

    /**
     * Sets the value of the subcategory property.
     * 
     */
    public void setSubcategory(short value) {
        this.subcategory = value;
    }

    /**
     * Gets the value of the theta property.
     * 
     */
    public float getTheta() {
        return theta;
    }

    /**
     * Sets the value of the theta property.
     * 
     */
    public void setTheta(float value) {
        this.theta = value;
    }

    /**
     * Gets the value of the xAcceleration property.
     * 
     */
    public float getXAcceleration() {
        return xAcceleration;
    }

    /**
     * Sets the value of the xAcceleration property.
     * 
     */
    public void setXAcceleration(float value) {
        this.xAcceleration = value;
    }

    /**
     * Gets the value of the xAngularVelocity property.
     * 
     */
    public float getXAngularVelocity() {
        return xAngularVelocity;
    }

    /**
     * Sets the value of the xAngularVelocity property.
     * 
     */
    public void setXAngularVelocity(float value) {
        this.xAngularVelocity = value;
    }

    /**
     * Gets the value of the xLocation property.
     * 
     */
    public float getXLocation() {
        return xLocation;
    }

    /**
     * Sets the value of the xLocation property.
     * 
     */
    public void setXLocation(float value) {
        this.xLocation = value;
    }

    /**
     * Gets the value of the xVelocity property.
     * 
     */
    public float getXVelocity() {
        return xVelocity;
    }

    /**
     * Sets the value of the xVelocity property.
     * 
     */
    public void setXVelocity(float value) {
        this.xVelocity = value;
    }

    /**
     * Gets the value of the yAcceleration property.
     * 
     */
    public float getYAcceleration() {
        return yAcceleration;
    }

    /**
     * Sets the value of the yAcceleration property.
     * 
     */
    public void setYAcceleration(float value) {
        this.yAcceleration = value;
    }

    /**
     * Gets the value of the yAngularVelocity property.
     * 
     */
    public float getYAngularVelocity() {
        return yAngularVelocity;
    }

    /**
     * Sets the value of the yAngularVelocity property.
     * 
     */
    public void setYAngularVelocity(float value) {
        this.yAngularVelocity = value;
    }

    /**
     * Gets the value of the yLocation property.
     * 
     */
    public float getYLocation() {
        return yLocation;
    }

    /**
     * Sets the value of the yLocation property.
     * 
     */
    public void setYLocation(float value) {
        this.yLocation = value;
    }

    /**
     * Gets the value of the yVelocity property.
     * 
     */
    public float getYVelocity() {
        return yVelocity;
    }

    /**
     * Sets the value of the yVelocity property.
     * 
     */
    public void setYVelocity(float value) {
        this.yVelocity = value;
    }

    /**
     * Gets the value of the zAcceleration property.
     * 
     */
    public float getZAcceleration() {
        return zAcceleration;
    }

    /**
     * Sets the value of the zAcceleration property.
     * 
     */
    public void setZAcceleration(float value) {
        this.zAcceleration = value;
    }

    /**
     * Gets the value of the zAngularVelocity property.
     * 
     */
    public float getZAngularVelocity() {
        return zAngularVelocity;
    }

    /**
     * Sets the value of the zAngularVelocity property.
     * 
     */
    public void setZAngularVelocity(float value) {
        this.zAngularVelocity = value;
    }

    /**
     * Gets the value of the zLocation property.
     * 
     */
    public float getZLocation() {
        return zLocation;
    }

    /**
     * Sets the value of the zLocation property.
     * 
     */
    public void setZLocation(float value) {
        this.zLocation = value;
    }

    /**
     * Gets the value of the zVelocity property.
     * 
     */
    public float getZVelocity() {
        return zVelocity;
    }

    /**
     * Sets the value of the zVelocity property.
     * 
     */
    public void setZVelocity(float value) {
        this.zVelocity = value;
    }

}
