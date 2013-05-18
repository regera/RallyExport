//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.18 at 01:12:07 PM EDT 
//


package com.ceb.ppm.schema.mfw;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DefectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefectType">
 *   &lt;complexContent>
 *     &lt;extension base="{}ArtifactType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AffectsDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{}DefectAttachmentsType" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BlockedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blocker" type="{}BlockerType" minOccurs="0"/>
 *         &lt;element name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duplicates" type="{}DefectDuplicatesType" minOccurs="0"/>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FixedInBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FoundInBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProgressDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Iteration" type="{}IterationType" minOccurs="0"/>
 *         &lt;element name="OpenedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Recycled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Release" type="{}ReleaseType" minOccurs="0"/>
 *         &lt;element name="ReleaseNote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Requirement" type="{}RequirementType" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesforceCaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesforceCaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmittedBy" type="{}UserType" minOccurs="0"/>
 *         &lt;element name="TargetBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaskActualTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskEstimateTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskRemainingTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{}DefectTasksType" minOccurs="0"/>
 *         &lt;element name="TestCase" type="{}TestCaseType" minOccurs="0"/>
 *         &lt;element name="TestCaseResult" type="{}TestCaseResultType" minOccurs="0"/>
 *         &lt;element name="TestCaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestCases" type="{}DefectTestCasesType" minOccurs="0"/>
 *         &lt;element name="VerifiedInBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefectCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefectRootCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="QACompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServiceCenterTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefectType", propOrder = {
    "acceptedDate",
    "affectsDoc",
    "attachments",
    "blocked",
    "blockedReason",
    "blocker",
    "closedDate",
    "duplicates",
    "environment",
    "fixedInBuild",
    "foundInBuild",
    "inProgressDate",
    "iteration",
    "openedDate",
    "_package",
    "planEstimate",
    "priority",
    "rank",
    "recycled",
    "release",
    "releaseNote",
    "requirement",
    "resolution",
    "salesforceCaseID",
    "salesforceCaseNumber",
    "scheduleState",
    "severity",
    "state",
    "submittedBy",
    "targetBuild",
    "targetDate",
    "taskActualTotal",
    "taskEstimateTotal",
    "taskRemainingTotal",
    "taskStatus",
    "tasks",
    "testCase",
    "testCaseResult",
    "testCaseStatus",
    "testCases",
    "verifiedInBuild",
    "businessOwner",
    "defectCategory",
    "defectRootCause",
    "devCompletionDate",
    "qaCompletionDate",
    "serviceCenterTicket"
})
public class DefectType
    extends ArtifactType
{

    @XmlElement(name = "AcceptedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptedDate;
    @XmlElement(name = "AffectsDoc")
    protected Boolean affectsDoc;
    @XmlElement(name = "Attachments")
    protected DefectAttachmentsType attachments;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    @XmlElement(name = "BlockedReason")
    protected String blockedReason;
    @XmlElement(name = "Blocker")
    protected BlockerType blocker;
    @XmlElement(name = "ClosedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedDate;
    @XmlElement(name = "Duplicates")
    protected DefectDuplicatesType duplicates;
    @XmlElement(name = "Environment")
    protected String environment;
    @XmlElement(name = "FixedInBuild")
    protected String fixedInBuild;
    @XmlElement(name = "FoundInBuild")
    protected String foundInBuild;
    @XmlElement(name = "InProgressDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProgressDate;
    @XmlElement(name = "Iteration")
    protected IterationType iteration;
    @XmlElement(name = "OpenedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openedDate;
    @XmlElement(name = "Package")
    protected String _package;
    @XmlElement(name = "PlanEstimate")
    protected Double planEstimate;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Rank")
    protected BigDecimal rank;
    @XmlElement(name = "Recycled")
    protected Boolean recycled;
    @XmlElement(name = "Release")
    protected ReleaseType release;
    @XmlElement(name = "ReleaseNote")
    protected Boolean releaseNote;
    @XmlElement(name = "Requirement")
    protected RequirementType requirement;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "SalesforceCaseID")
    protected String salesforceCaseID;
    @XmlElement(name = "SalesforceCaseNumber")
    protected String salesforceCaseNumber;
    @XmlElement(name = "ScheduleState")
    protected String scheduleState;
    @XmlElement(name = "Severity")
    protected String severity;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "SubmittedBy")
    protected UserType submittedBy;
    @XmlElement(name = "TargetBuild")
    protected String targetBuild;
    @XmlElement(name = "TargetDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar targetDate;
    @XmlElement(name = "TaskActualTotal")
    protected Double taskActualTotal;
    @XmlElement(name = "TaskEstimateTotal")
    protected Double taskEstimateTotal;
    @XmlElement(name = "TaskRemainingTotal")
    protected Double taskRemainingTotal;
    @XmlElement(name = "TaskStatus")
    protected String taskStatus;
    @XmlElement(name = "Tasks")
    protected DefectTasksType tasks;
    @XmlElement(name = "TestCase")
    protected TestCaseType testCase;
    @XmlElement(name = "TestCaseResult")
    protected TestCaseResultType testCaseResult;
    @XmlElement(name = "TestCaseStatus")
    protected String testCaseStatus;
    @XmlElement(name = "TestCases")
    protected DefectTestCasesType testCases;
    @XmlElement(name = "VerifiedInBuild")
    protected String verifiedInBuild;
    @XmlElement(name = "BusinessOwner")
    protected String businessOwner;
    @XmlElement(name = "DefectCategory")
    protected String defectCategory;
    @XmlElement(name = "DefectRootCause")
    protected String defectRootCause;
    @XmlElement(name = "DevCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar devCompletionDate;
    @XmlElement(name = "QACompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qaCompletionDate;
    @XmlElement(name = "ServiceCenterTicket")
    protected String serviceCenterTicket;

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptedDate(XMLGregorianCalendar value) {
        this.acceptedDate = value;
    }

    /**
     * Gets the value of the affectsDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAffectsDoc() {
        return affectsDoc;
    }

    /**
     * Sets the value of the affectsDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAffectsDoc(Boolean value) {
        this.affectsDoc = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DefectAttachmentsType }
     *     
     */
    public DefectAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefectAttachmentsType }
     *     
     */
    public void setAttachments(DefectAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the blockedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedReason() {
        return blockedReason;
    }

    /**
     * Sets the value of the blockedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedReason(String value) {
        this.blockedReason = value;
    }

    /**
     * Gets the value of the blocker property.
     * 
     * @return
     *     possible object is
     *     {@link BlockerType }
     *     
     */
    public BlockerType getBlocker() {
        return blocker;
    }

    /**
     * Sets the value of the blocker property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockerType }
     *     
     */
    public void setBlocker(BlockerType value) {
        this.blocker = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDate(XMLGregorianCalendar value) {
        this.closedDate = value;
    }

    /**
     * Gets the value of the duplicates property.
     * 
     * @return
     *     possible object is
     *     {@link DefectDuplicatesType }
     *     
     */
    public DefectDuplicatesType getDuplicates() {
        return duplicates;
    }

    /**
     * Sets the value of the duplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefectDuplicatesType }
     *     
     */
    public void setDuplicates(DefectDuplicatesType value) {
        this.duplicates = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the fixedInBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedInBuild() {
        return fixedInBuild;
    }

    /**
     * Sets the value of the fixedInBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedInBuild(String value) {
        this.fixedInBuild = value;
    }

    /**
     * Gets the value of the foundInBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundInBuild() {
        return foundInBuild;
    }

    /**
     * Sets the value of the foundInBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundInBuild(String value) {
        this.foundInBuild = value;
    }

    /**
     * Gets the value of the inProgressDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProgressDate() {
        return inProgressDate;
    }

    /**
     * Sets the value of the inProgressDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProgressDate(XMLGregorianCalendar value) {
        this.inProgressDate = value;
    }

    /**
     * Gets the value of the iteration property.
     * 
     * @return
     *     possible object is
     *     {@link IterationType }
     *     
     */
    public IterationType getIteration() {
        return iteration;
    }

    /**
     * Sets the value of the iteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IterationType }
     *     
     */
    public void setIteration(IterationType value) {
        this.iteration = value;
    }

    /**
     * Gets the value of the openedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenedDate() {
        return openedDate;
    }

    /**
     * Sets the value of the openedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenedDate(XMLGregorianCalendar value) {
        this.openedDate = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the planEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlanEstimate() {
        return planEstimate;
    }

    /**
     * Sets the value of the planEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlanEstimate(Double value) {
        this.planEstimate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRank(BigDecimal value) {
        this.rank = value;
    }

    /**
     * Gets the value of the recycled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecycled() {
        return recycled;
    }

    /**
     * Sets the value of the recycled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecycled(Boolean value) {
        this.recycled = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseType }
     *     
     */
    public ReleaseType getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseType }
     *     
     */
    public void setRelease(ReleaseType value) {
        this.release = value;
    }

    /**
     * Gets the value of the releaseNote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseNote() {
        return releaseNote;
    }

    /**
     * Sets the value of the releaseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseNote(Boolean value) {
        this.releaseNote = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getRequirement() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setRequirement(RequirementType value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the salesforceCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesforceCaseID() {
        return salesforceCaseID;
    }

    /**
     * Sets the value of the salesforceCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesforceCaseID(String value) {
        this.salesforceCaseID = value;
    }

    /**
     * Gets the value of the salesforceCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesforceCaseNumber() {
        return salesforceCaseNumber;
    }

    /**
     * Sets the value of the salesforceCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesforceCaseNumber(String value) {
        this.salesforceCaseNumber = value;
    }

    /**
     * Gets the value of the scheduleState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleState() {
        return scheduleState;
    }

    /**
     * Sets the value of the scheduleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleState(String value) {
        this.scheduleState = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the submittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Sets the value of the submittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSubmittedBy(UserType value) {
        this.submittedBy = value;
    }

    /**
     * Gets the value of the targetBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBuild() {
        return targetBuild;
    }

    /**
     * Sets the value of the targetBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBuild(String value) {
        this.targetBuild = value;
    }

    /**
     * Gets the value of the targetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDate() {
        return targetDate;
    }

    /**
     * Sets the value of the targetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDate(XMLGregorianCalendar value) {
        this.targetDate = value;
    }

    /**
     * Gets the value of the taskActualTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaskActualTotal() {
        return taskActualTotal;
    }

    /**
     * Sets the value of the taskActualTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaskActualTotal(Double value) {
        this.taskActualTotal = value;
    }

    /**
     * Gets the value of the taskEstimateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }

    /**
     * Sets the value of the taskEstimateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaskEstimateTotal(Double value) {
        this.taskEstimateTotal = value;
    }

    /**
     * Gets the value of the taskRemainingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }

    /**
     * Sets the value of the taskRemainingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaskRemainingTotal(Double value) {
        this.taskRemainingTotal = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link DefectTasksType }
     *     
     */
    public DefectTasksType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefectTasksType }
     *     
     */
    public void setTasks(DefectTasksType value) {
        this.tasks = value;
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

    /**
     * Gets the value of the testCaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link TestCaseResultType }
     *     
     */
    public TestCaseResultType getTestCaseResult() {
        return testCaseResult;
    }

    /**
     * Sets the value of the testCaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCaseResultType }
     *     
     */
    public void setTestCaseResult(TestCaseResultType value) {
        this.testCaseResult = value;
    }

    /**
     * Gets the value of the testCaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseStatus() {
        return testCaseStatus;
    }

    /**
     * Sets the value of the testCaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseStatus(String value) {
        this.testCaseStatus = value;
    }

    /**
     * Gets the value of the testCases property.
     * 
     * @return
     *     possible object is
     *     {@link DefectTestCasesType }
     *     
     */
    public DefectTestCasesType getTestCases() {
        return testCases;
    }

    /**
     * Sets the value of the testCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefectTestCasesType }
     *     
     */
    public void setTestCases(DefectTestCasesType value) {
        this.testCases = value;
    }

    /**
     * Gets the value of the verifiedInBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedInBuild() {
        return verifiedInBuild;
    }

    /**
     * Sets the value of the verifiedInBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedInBuild(String value) {
        this.verifiedInBuild = value;
    }

    /**
     * Gets the value of the businessOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOwner() {
        return businessOwner;
    }

    /**
     * Sets the value of the businessOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOwner(String value) {
        this.businessOwner = value;
    }

    /**
     * Gets the value of the defectCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectCategory() {
        return defectCategory;
    }

    /**
     * Sets the value of the defectCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectCategory(String value) {
        this.defectCategory = value;
    }

    /**
     * Gets the value of the defectRootCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectRootCause() {
        return defectRootCause;
    }

    /**
     * Sets the value of the defectRootCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectRootCause(String value) {
        this.defectRootCause = value;
    }

    /**
     * Gets the value of the devCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDevCompletionDate() {
        return devCompletionDate;
    }

    /**
     * Sets the value of the devCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDevCompletionDate(XMLGregorianCalendar value) {
        this.devCompletionDate = value;
    }

    /**
     * Gets the value of the qaCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQACompletionDate() {
        return qaCompletionDate;
    }

    /**
     * Sets the value of the qaCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQACompletionDate(XMLGregorianCalendar value) {
        this.qaCompletionDate = value;
    }

    /**
     * Gets the value of the serviceCenterTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCenterTicket() {
        return serviceCenterTicket;
    }

    /**
     * Sets the value of the serviceCenterTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCenterTicket(String value) {
        this.serviceCenterTicket = value;
    }

}
