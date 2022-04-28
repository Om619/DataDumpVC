package com.vc.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "MF_fund_dividends")
public class MF_Fund_dividends {
@Id
private Long plan_id;
private Date div_date;
private Date record_date;
private Double percentage;
private Boolean is_tax_adjustable;
private Double percentage_rs_per_unit;
private Timestamp modified_ts;
private Timestamp created_date;
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
public Double getPercentage() {
	return percentage;
}
public void setPercentage(Double percentage) {
	this.percentage = percentage;
}
public Boolean getIs_tax_adjustable() {
	return is_tax_adjustable;
}
public void setIs_tax_adjustable(Boolean is_tax_adjustable) {
	this.is_tax_adjustable = is_tax_adjustable;
}
public Double getPercentage_rs_per_unit() {
	return percentage_rs_per_unit;
}
public void setPercentage_rs_per_unit(Double percentage_rs_per_unit) {
	this.percentage_rs_per_unit = percentage_rs_per_unit;
}
public Timestamp getModified_ts() {
	return modified_ts;
}
public void setModified_ts(Timestamp modified_ts) {
	this.modified_ts = modified_ts;
}
public Timestamp getCreated_date() {
	return created_date;
}
public void setCreated_date(Timestamp created_date) {
	this.created_date = created_date;
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
public MF_Fund_dividends(Long plan_id, Date div_date, Date record_date, Double percentage, Boolean is_tax_adjustable,
		Double percentage_rs_per_unit, Timestamp modified_ts, Timestamp created_date, Timestamp modified_date,
		String created_by, String modified_by) {
	super();
	this.plan_id = plan_id;
	this.div_date = div_date;
	this.record_date = record_date;
	this.percentage = percentage;
	this.is_tax_adjustable = is_tax_adjustable;
	this.percentage_rs_per_unit = percentage_rs_per_unit;
	this.modified_ts = modified_ts;
	this.created_date = created_date;
	this.modified_date = modified_date;
	this.created_by = created_by;
	this.modified_by = modified_by;
}
public MF_Fund_dividends() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "MF_Fund_dividends [plan_id=" + plan_id + ", div_date=" + div_date + ", record_date=" + record_date
			+ ", percentage=" + percentage + ", is_tax_adjustable=" + is_tax_adjustable + ", percentage_rs_per_unit="
			+ percentage_rs_per_unit + ", modified_ts=" + modified_ts + ", created_date=" + created_date
			+ ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
}

}
