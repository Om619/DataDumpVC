package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_Fd_status")
public class MF_Fund_status {
	@Id
	private String status_id;
	private String status_description;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Fund_status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStatus_id() {
		return status_id;
	}
	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	public String getStatus_description() {
		return status_description;
	}
	public void setStatus_description(String status_description) {
		this.status_description = status_description;
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
	public MF_Fund_status(String status_id, String status_description, Timestamp modified_ts, Timestamp create_date,
			Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.status_id = status_id;
		this.status_description = status_description;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Fund_status [status_id=" + status_id + ", status_description=" + status_description
				+ ", modified_ts=" + modified_ts + ", Create_date=" + Create_date + ", modified_date=" + modified_date
				+ ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
