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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{}WSObject">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{}OperationResultErrorsType" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}OperationResultWarningsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationResultType", propOrder = {
    "errors",
    "warnings"
})
@XmlSeeAlso({
    QueryResultType.class,
    CreateResultType.class
})
public class OperationResultType
    extends WSObject
{

    @XmlElement(name = "Errors")
    protected OperationResultErrorsType errors;
    @XmlElement(name = "Warnings")
    protected OperationResultWarningsType warnings;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultErrorsType }
     *     
     */
    public OperationResultErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultErrorsType }
     *     
     */
    public void setErrors(OperationResultErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultWarningsType }
     *     
     */
    public OperationResultWarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultWarningsType }
     *     
     */
    public void setWarnings(OperationResultWarningsType value) {
        this.warnings = value;
    }

}
