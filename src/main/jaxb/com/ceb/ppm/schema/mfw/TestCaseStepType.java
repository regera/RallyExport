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
 * <p>Java class for TestCaseStepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestCaseStepType">
 *   &lt;complexContent>
 *     &lt;extension base="{}WorkspaceDomainObjectType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepIndex" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TestCase" type="{}TestCaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCaseStepType", propOrder = {
    "expectedResult",
    "input",
    "stepIndex",
    "testCase"
})
public class TestCaseStepType
    extends WorkspaceDomainObjectType
{

    @XmlElement(name = "ExpectedResult")
    protected String expectedResult;
    @XmlElement(name = "Input")
    protected String input;
    @XmlElement(name = "StepIndex")
    protected Long stepIndex;
    @XmlElement(name = "TestCase")
    protected TestCaseType testCase;

    /**
     * Gets the value of the expectedResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedResult() {
        return expectedResult;
    }

    /**
     * Sets the value of the expectedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedResult(String value) {
        this.expectedResult = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the stepIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStepIndex() {
        return stepIndex;
    }

    /**
     * Sets the value of the stepIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStepIndex(Long value) {
        this.stepIndex = value;
    }

    /**
     * Gets the value of the testCase property.
     * 
     * @return
     *     possible object is
     *     {@link TestCaseType }
     *     
     */
    public TestCaseType getTestCase() {
        return testCase;
    }

    /**
     * Sets the value of the testCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCaseType }
     *     
     */
    public void setTestCase(TestCaseType value) {
        this.testCase = value;
    }

}
