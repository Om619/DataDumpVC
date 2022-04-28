package com.vc.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_Fd_manager_latest")
public class MF_Fund_manager_latest {
	@Id
	private Long plan_id;
	private Long person_id;
	private Date date_from;
	private Timestamp modified_ts;
	private String person_type;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Fund_manager_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public Long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Long person_id) {
		this.person_id = person_id;
	}
	public Date getDate_from() {
		return date_from;
	}
	public void setDate_from(Date date_from) {
		this.date_from = date_from;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getPerson_type() {
		return person_type;
	}
	public void setPerson_type(String person_type) {
		this.person_type = person_type;
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
	public MF_Fund_manager_latest(Long plan_id, Long person_id, Date date_from, Timestamp modified_ts,
			String person_type, Timestamp create_date, Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.plan_id = plan_id;
		this.person_id = person_id;
		this.date_from = date_from;
		this.modified_ts = modified_ts;
		this.person_type = person_type;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Fund_manager_latest [plan_id=" + plan_id + ", person_id=" + person_id + ", date_from=" + date_from
				+ ", modified_ts=" + modified_ts + ", person_type=" + person_type + ", Create_date=" + Create_date
				+ ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by
				+ "]";
	}
		
}
