//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.18 at 01:12:07 PM EDT 
//


package com.ceb.ppm.schema.mfw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisplayString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebLink", propOrder = {
    "linkID",
    "displayString"
})
public class WebLink {

    @XmlElement(name = "LinkID", required = true)
    protected String linkID;
    @XmlElement(name = "DisplayString")
    protected String displayString;

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkID(String value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the displayString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayString() {
        return displayString;
    }

    /**
     * Sets the value of the displayString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayString(String value) {
        this.displayString = value;
    }

}
