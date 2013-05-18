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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArtifactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtifactType">
 *   &lt;complexContent>
 *     &lt;extension base="{}WorkspaceDomainObjectType">
 *       &lt;sequence>
 *         &lt;element name="Changesets" type="{}ArtifactChangesetsType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discussion" type="{}ArtifactDiscussionType" minOccurs="0"/>
 *         &lt;element name="DisplayColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{}UserType" minOccurs="0"/>
 *         &lt;element name="Project" type="{}ProjectType" minOccurs="0"/>
 *         &lt;element name="Ready" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RevisionHistory" type="{}RevisionHistoryType" minOccurs="0"/>
 *         &lt;element name="Tags" type="{}ArtifactTagsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtifactType", propOrder = {
    "changesets",
    "description",
    "discussion",
    "displayColor",
    "formattedID",
    "lastUpdateDate",
    "name",
    "notes",
    "owner",
    "project",
    "ready",
    "revisionHistory",
    "tags"
})
@XmlSeeAlso({
    DefectType.class,
    TestCaseType.class,
    TaskType.class,
    DefectSuiteType.class,
    RequirementType.class
})
public class ArtifactType
    extends WorkspaceDomainObjectType
{

    @XmlElement(name = "Changesets")
    protected ArtifactChangesetsType changesets;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Discussion")
    protected ArtifactDiscussionType discussion;
    @XmlElement(name = "DisplayColor")
    protected String displayColor;
    @XmlElement(name = "FormattedID")
    protected String formattedID;
    @XmlElement(name = "LastUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Owner")
    protected UserType owner;
    @XmlElement(name = "Project")
    protected ProjectType project;
    @XmlElement(name = "Ready")
    protected Boolean ready;
    @XmlElement(name = "RevisionHistory")
    protected RevisionHistoryType revisionHistory;
    @XmlElement(name = "Tags")
    protected ArtifactTagsType tags;

    /**
     * Gets the value of the changesets property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactChangesetsType }
     *     
     */
    public ArtifactChangesetsType getChangesets() {
        return changesets;
    }

    /**
     * Sets the value of the changesets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactChangesetsType }
     *     
     */
    public void setChangesets(ArtifactChangesetsType value) {
        this.changesets = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discussion property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactDiscussionType }
     *     
     */
    public ArtifactDiscussionType getDiscussion() {
        return discussion;
    }

    /**
     * Sets the value of the discussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactDiscussionType }
     *     
     */
    public void setDiscussion(ArtifactDiscussionType value) {
        this.discussion = value;
    }

    /**
     * Gets the value of the displayColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayColor() {
        return displayColor;
    }

    /**
     * Sets the value of the displayColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayColor(String value) {
        this.displayColor = value;
    }

    /**
     * Gets the value of the formattedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedID() {
        return formattedID;
    }

    /**
     * Sets the value of the formattedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedID(String value) {
        this.formattedID = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOwner(UserType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectType }
     *     
     */
    public ProjectType getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectType }
     *     
     */
    public void setProject(ProjectType value) {
        this.project = value;
    }

    /**
     * Gets the value of the ready property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReady() {
        return ready;
    }

    /**
     * Sets the value of the ready property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReady(Boolean value) {
        this.ready = value;
    }

    /**
     * Gets the value of the revisionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionHistoryType }
     *     
     */
    public RevisionHistoryType getRevisionHistory() {
        return revisionHistory;
    }

    /**
     * Sets the value of the revisionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionHistoryType }
     *     
     */
    public void setRevisionHistory(RevisionHistoryType value) {
        this.revisionHistory = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactTagsType }
     *     
     */
    public ArtifactTagsType getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactTagsType }
     *     
     */
    public void setTags(ArtifactTagsType value) {
        this.tags = value;
    }

}
