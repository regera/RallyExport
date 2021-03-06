package com.ceb.ppm.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project extends Persistable {

	@Column(columnDefinition = "TEXT")
	String name;

	@Column(columnDefinition = "TEXT")
	String description;

	@Column(columnDefinition = "TEXT")
	String notes;

	String owner;
	String state;
	boolean migrationComplete = false;
	String workspace;
	long objectId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	List<UserStory> userStories = new ArrayList<UserStory>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	List<Defect> defects = new ArrayList<Defect>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	List<Iteration> iterations = new ArrayList<Iteration>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	List<Release> releases = new ArrayList<Release>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	List<RallyUser> users = new ArrayList<RallyUser>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public List<Defect> getDefects() {
		return defects;
	}

	public List<Iteration> getIterations() {
		return iterations;
	}

	public List<Release> getReleases() {
		return releases;
	}

	public List<RallyUser> getUsers() {
		return users;
	}

	public boolean isMigrationComplete() {
		return migrationComplete;
	}

	public void setMigrationComplete(boolean migrationComplete) {
		this.migrationComplete = migrationComplete;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	public long getObjectId() {
		return objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}
	

}
