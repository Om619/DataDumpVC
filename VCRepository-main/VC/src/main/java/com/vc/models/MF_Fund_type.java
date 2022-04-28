package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_fundtype")
public class MF_Fund_type {
	@Id 
	private int type_id;
	private String type_name;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Fund_type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_type(int type_id, String type_name, Timestamp modified_ts, Timestamp create_date,
			Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
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
	@Override
	public String toString() {
		return "MF_Fund_type [type_id=" + type_id + ", type_name=" + type_name + ", modified_ts=" + modified_ts
				+ ", Create_date=" + Create_date + ", modified_date=" + modified_date + ", created_by=" + created_by
				+ ", modified_by=" + modified_by + "]";
	}
	
	
}
