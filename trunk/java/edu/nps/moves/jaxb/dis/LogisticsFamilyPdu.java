//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.11 at 11:22:02 AM PDT 
//


package edu.nps.moves.jaxb.dis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logisticsFamilyPdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logisticsFamilyPdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}pdu">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logisticsFamilyPdu")
@XmlSeeAlso({
    ResupplyReceivedPdu.class,
    ResupplyOfferPdu.class,
    ResupplyCancelPdu.class,
    RepairCompletePdu.class,
    RepairResponsePdu.class,
    ServiceRequestPdu.class
})
public class LogisticsFamilyPdu
    extends Pdu
{


}
