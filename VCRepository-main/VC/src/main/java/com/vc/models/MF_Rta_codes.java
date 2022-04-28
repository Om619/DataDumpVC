package com.vc.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_rtacodes")
public class MF_Rta_codes {

	@Id
	private String subplan_id;
	private Long plan_id;
	private String subplan_name;
	private String rta_code;
	private String rta_name;
	private Date as_on_date;
	private Timestamp modified_ts;
	private String fund_amc_id;
	private String fund_scheme_id;
	private String online_rta_code;
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
	public String getSubplan_id() {
		return subplan_id;
	}
	public void setSubplan_id(String subplan_id) {
		this.subplan_id = subplan_id;
	}
	public String getSubplan_name() {
		return subplan_name;
	}
	public void setSubplan_name(String subplan_name) {
		this.subplan_name = subplan_name;
	}
	public String getRta_code() {
		return rta_code;
	}
	public void setRta_code(String rta_code) {
		this.rta_code = rta_code;
	}
	public String getRta_name() {
		return rta_name;
	}
	public void setRta_name(String rta_name) {
		this.rta_name = rta_name;
	}
	public Date getAs_on_date() {
		return as_on_date;
	}
	public void setAs_on_date(Date as_on_date) {
		this.as_on_date = as_on_date;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getFund_amc_id() {
		return fund_amc_id;
	}
	public void setFund_amc_id(String fund_amc_id) {
		this.fund_amc_id = fund_amc_id;
	}
	public String getFund_scheme_id() {
		return fund_scheme_id;
	}
	public void setFund_scheme_id(String fund_scheme_id) {
		this.fund_scheme_id = fund_scheme_id;
	}
	public String getOnline_rta_code() {
		return online_rta_code;
	}
	public void setOnline_rta_code(String online_rta_code) {
		this.online_rta_code = online_rta_code;
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
	public MF_Rta_codes(Long plan_id, String subplan_id, String subplan_name, String rta_code, String rta_name,
			Date as_on_date, Timestamp modified_ts, String fund_amc_id, String fund_scheme_id, String online_rta_code,
			Timestamp create_date, Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.plan_id = plan_id;
		this.subplan_id = subplan_id;
		this.subplan_name = subplan_name;
		this.rta_code = rta_code;
		this.rta_name = rta_name;
		this.as_on_date = as_on_date;
		this.modified_ts = modified_ts;
		this.fund_amc_id = fund_amc_id;
		this.fund_scheme_id = fund_scheme_id;
		this.online_rta_code = online_rta_code;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Rta_codes() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Rta_codes [plan_id=" + plan_id + ", subplan_id=" + subplan_id + ", subplan_name=" + subplan_name
				+ ", rta_code=" + rta_code + ", rta_name=" + rta_name + ", as_on_date=" + as_on_date + ", modified_ts="
				+ modified_ts + ", fund_amc_id=" + fund_amc_id + ", fund_scheme_id=" + fund_scheme_id
				+ ", online_rta_code=" + online_rta_code + ", Create_date=" + Create_date + ", modified_date="
				+ modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
