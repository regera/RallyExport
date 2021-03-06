package com.ceb.ppm.persistence.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "objectId" }))
@Entity
public class Iteration extends Persistable {
	@Column(columnDefinition = "TEXT")
	String name;

	@Column(columnDefinition = "TEXT")
	String notes;

	Date startDate;
	Date endDate;

	String state;
	@Column(columnDefinition = "TEXT")
	String theme;

	long objectId;
	boolean migrationComplete = false;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "iteration_id", referencedColumnName = "id")
	List<Defect> defects = new ArrayList<Defect>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "iteration_id", referencedColumnName = "id")
	List<UserStory> userStories = new ArrayList<UserStory>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "iteration_id", referencedColumnName = "id")
	List<IterationCapacity> iterationCapacities = new ArrayList<IterationCapacity>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public List<Defect> getDefects() {
		return defects;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public List<IterationCapacity> getIterationCapacities() {
		return iterationCapacities;
	}

	public long getObjectId() {
		return objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	public boolean isMigrationComplete() {
		return migrationComplete;
	}

	public void setMigrationComplete(boolean migrationComplete) {
		this.migrationComplete = migrationComplete;
	}

}
