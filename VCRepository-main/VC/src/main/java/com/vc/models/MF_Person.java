package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_person")
public class MF_Person {
	@Id
	private Long person_id;
	@Column(length = 1337)
	private String person_name;
	@Column(length = 1337)
	private String education;
	@Column(length = 1337)
	private String experience;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public Long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Long person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public Timestamp getCreate_date() {
		return Create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		Create_date = create_date;
	}
	public Timestamp getModified_date() {
		return modified_date;
	}
	public void setModified_date(Timestamp modified_date) {
		this.modified_date = modified_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public MF_Person(Long person_id, String person_name, String education, String experience, Timestamp modified_ts,
			Timestamp create_date, Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.person_id = person_id;
		this.person_name = person_name;
		this.education = education;
		this.experience = experience;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Person [person_id=" + person_id + ", person_name=" + person_name + ", education=" + education
				+ ", experience=" + experience + ", modified_ts=" + modified_ts + ", Create_date=" + Create_date
				+ ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by
				+ "]";
	}
	
}
