package com.vc.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_fundsplit")
public class MF_Fund_split {

	@Id
	private Long plan_id;
	private Date div_date;
	private Date record_date;
	private Double held;
	private Double offered;
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
	public Date getDiv_date() {
		return div_date;
	}
	public void setDiv_date(Date div_date) {
		this.div_date = div_date;
	}
	public Date getRecord_date() {
		return record_date;
	}
	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}
	public Double getHeld() {
		return held;
	}
	public void setHeld(Double held) {
		this.held = held;
	}
	public Double getOffered() {
		return offered;
	}
	public void setOffered(Double offered) {
		this.offered = offered;
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
	public MF_Fund_split(Long plan_id, Date div_date, Date record_date, Double held, Double offered,
			Timestamp modified_ts, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.plan_id = plan_id;
		this.div_date = div_date;
		this.record_date = record_date;
		this.held = held;
		this.offered = offered;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Fund_split() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Fund_split [plan_id=" + plan_id + ", div_date=" + div_date + ", record_date=" + record_date
				+ ", held=" + held + ", offered=" + offered + ", modified_ts=" + modified_ts + ", Create_date="
				+ Create_date + ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by="
				+ modified_by + "]";
	}
	
}
