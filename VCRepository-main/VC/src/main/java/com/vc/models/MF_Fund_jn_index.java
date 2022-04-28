package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mf_fund_jn_index")
public class MF_Fund_jn_index {

	@Id
	private Long plan_id;
	private Long index_id;
	private Double percentage;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public Long getIndex_id() {
		return index_id;
	}
	public void setIndex_id(Long index_id) {
		this.index_id = index_id;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
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
	public MF_Fund_jn_index(Long plan_id, Long index_id, Double percentage, Timestamp modified_ts,
			Timestamp create_date, Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.plan_id = plan_id;
		this.index_id = index_id;
		this.percentage = percentage;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Fund_jn_index() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Fund_jn_index [plan_id=" + plan_id + ", index_id=" + index_id + ", percentage=" + percentage
				+ ", modified_ts=" + modified_ts + ", Create_date=" + Create_date + ", modified_date=" + modified_date
				+ ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
