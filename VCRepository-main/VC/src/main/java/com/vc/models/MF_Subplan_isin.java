package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subplan_isin")
public class MF_Subplan_isin {

	@Id
	private String subplan_code;
	private Long plan_id;
	private String isin_code;
	private Timestamp modified_ts;
	private String reinvestment_flag;
	private Timestamp create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public String getSubplan_code() {
		return subplan_code;
	}
	public void setSubplan_code(String subplan_code) {
		this.subplan_code = subplan_code;
	}
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public String getIsin_code() {
		return isin_code;
	}
	public void setIsin_code(String isin_code) {
		this.isin_code = isin_code;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getReinvestment_flag() {
		return reinvestment_flag;
	}
	public void setReinvestment_flag(String reinvestment_flag) {
		this.reinvestment_flag = reinvestment_flag;
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
	public MF_Subplan_isin(String subplan_code, Long plan_id, String isin_code, Timestamp modified_ts,
			String reinvestment_flag, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.subplan_code = subplan_code;
		this.plan_id = plan_id;
		this.isin_code = isin_code;
		this.modified_ts = modified_ts;
		this.reinvestment_flag = reinvestment_flag;
		this.create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Subplan_isin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Subplan_isin [subplan_code=" + subplan_code + ", plan_id=" + plan_id + ", isin_code=" + isin_code
				+ ", modified_ts=" + modified_ts + ", reinvestment_flag=" + reinvestment_flag + ", create_date="
				+ create_date + ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by="
				+ modified_by + "]";
	}
	
}
