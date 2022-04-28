package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mf_indices")
public class MF_Indices {

	@Id
	private Long index_id;
	private String short_name;
	private String full_name;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public Long getIndex_id() {
		return index_id;
	}
	public void setIndex_id(Long index_id) {
		this.index_id = index_id;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
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
	public MF_Indices(Long index_id, String short_name, String full_name, Timestamp modified_ts, Timestamp create_date,
			Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.index_id = index_id;
		this.short_name = short_name;
		this.full_name = full_name;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Indices() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Indices [index_id=" + index_id + ", short_name=" + short_name + ", full_name=" + full_name
				+ ", modified_ts=" + modified_ts + ", Create_date=" + Create_date + ", modified_date=" + modified_date
				+ ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
	
}
