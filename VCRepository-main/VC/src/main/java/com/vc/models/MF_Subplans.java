package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_subplans")
public class MF_Subplans {
	@Id
	private String subplan_id;
	private Long plan_id;
	private String subplan_full_name;
	private String subplan_name;
	private String description;
	private Timestamp modified_ts;
	private Timestamp create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public String getSubplan_id() {
		return subplan_id;
	}
	public void setSubplan_id(String subplan_id) {
		this.subplan_id = subplan_id;
	}
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public String getSubplan_full_name() {
		return subplan_full_name;
	}
	public void setSubplan_full_name(String subplan_full_name) {
		this.subplan_full_name = subplan_full_name;
	}
	public String getSubplan_name() {
		return subplan_name;
	}
	public void setSubplan_name(String subplan_name) {
		this.subplan_name = subplan_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
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
	public MF_Subplans(String subplan_id, Long plan_id, String subplan_full_name, String subplan_name,
			String description, Timestamp modified_ts, Timestamp create_date, Timestamp modified_date,
			String created_by, String modified_by) {
		super();
		this.subplan_id = subplan_id;
		this.plan_id = plan_id;
		this.subplan_full_name = subplan_full_name;
		this.subplan_name = subplan_name;
		this.description = description;
		this.modified_ts = modified_ts;
		this.create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Subplans() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Subplans [subplan_id=" + subplan_id + ", plan_id=" + plan_id + ", subplan_full_name="
				+ subplan_full_name + ", subplan_name=" + subplan_name + ", description=" + description
				+ ", modified_ts=" + modified_ts + ", create_date=" + create_date + ", modified_date=" + modified_date
				+ ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
	
}
