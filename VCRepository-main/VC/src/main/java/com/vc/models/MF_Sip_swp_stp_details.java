package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_sip_swp_stp_details")
public class MF_Sip_swp_stp_details {

	@Id
	private Long plan_id;
	private String plan_name;
	private String sip_frequency;
	private String sip_dates;
	private String sip_min_inv_amount;
	private String swp_frequency;
	private String swp_dates;
	private String swp_min_inv_amount;
	private String stp_frequency;
	private String stp_dates;
	private String stp_min_inv_amount;
	private Timestamp modified_ts;
	private String sip_max_inv_amount;
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
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getSip_frequency() {
		return sip_frequency;
	}
	public void setSip_frequency(String sip_frequency) {
		this.sip_frequency = sip_frequency;
	}
	public String getSip_dates() {
		return sip_dates;
	}
	public void setSip_dates(String sip_dates) {
		this.sip_dates = sip_dates;
	}
	public String getSip_min_inv_amount() {
		return sip_min_inv_amount;
	}
	public void setSip_min_inv_amount(String sip_min_inv_amount) {
		this.sip_min_inv_amount = sip_min_inv_amount;
	}
	public String getSwp_frequency() {
		return swp_frequency;
	}
	public void setSwp_frequency(String swp_frequency) {
		this.swp_frequency = swp_frequency;
	}
	public String getSwp_dates() {
		return swp_dates;
	}
	public void setSwp_dates(String swp_dates) {
		this.swp_dates = swp_dates;
	}
	public String getSwp_min_inv_amount() {
		return swp_min_inv_amount;
	}
	public void setSwp_min_inv_amount(String swp_min_inv_amount) {
		this.swp_min_inv_amount = swp_min_inv_amount;
	}
	public String getStp_frequency() {
		return stp_frequency;
	}
	public void setStp_frequency(String stp_frequency) {
		this.stp_frequency = stp_frequency;
	}
	public String getStp_dates() {
		return stp_dates;
	}
	public void setStp_dates(String stp_dates) {
		this.stp_dates = stp_dates;
	}
	public String getStp_min_inv_amount() {
		return stp_min_inv_amount;
	}
	public void setStp_min_inv_amount(String stp_min_inv_amount) {
		this.stp_min_inv_amount = stp_min_inv_amount;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getSip_max_inv_amount() {
		return sip_max_inv_amount;
	}
	public void setSip_max_inv_amount(String sip_max_inv_amount) {
		this.sip_max_inv_amount = sip_max_inv_amount;
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
	public MF_Sip_swp_stp_details(Long plan_id, String plan_name, String sip_frequency, String sip_dates,
			String sip_min_inv_amount, String swp_frequency, String swp_dates, String swp_min_inv_amount,
			String stp_frequency, String stp_dates, String stp_min_inv_amount, Timestamp modified_ts,
			String sip_max_inv_amount, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.plan_id = plan_id;
		this.plan_name = plan_name;
		this.sip_frequency = sip_frequency;
		this.sip_dates = sip_dates;
		this.sip_min_inv_amount = sip_min_inv_amount;
		this.swp_frequency = swp_frequency;
		this.swp_dates = swp_dates;
		this.swp_min_inv_amount = swp_min_inv_amount;
		this.stp_frequency = stp_frequency;
		this.stp_dates = stp_dates;
		this.stp_min_inv_amount = stp_min_inv_amount;
		this.modified_ts = modified_ts;
		this.sip_max_inv_amount = sip_max_inv_amount;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Sip_swp_stp_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Sip_swp_stp_details [plan_id=" + plan_id + ", plan_name=" + plan_name + ", sip_frequency="
				+ sip_frequency + ", sip_dates=" + sip_dates + ", sip_min_inv_amount=" + sip_min_inv_amount
				+ ", swp_frequency=" + swp_frequency + ", swp_dates=" + swp_dates + ", swp_min_inv_amount="
				+ swp_min_inv_amount + ", stp_frequency=" + stp_frequency + ", stp_dates=" + stp_dates
				+ ", stp_min_inv_amount=" + stp_min_inv_amount + ", modified_ts=" + modified_ts
				+ ", sip_max_inv_amount=" + sip_max_inv_amount + ", Create_date=" + Create_date + ", modified_date="
				+ modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
