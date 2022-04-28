package com.vc.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_fund_holdings_sectorwise_imputed_latest")
public class MF_Fund_holdings_sectorwise_imputed_latest {

	@Id
	private Long plan_id;
	private Long sector_code;
	private Date as_on_date;
	private Double percentage;
	private Timestamp modified_ts;
	private Timestamp create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public Long getSector_code() {
		return sector_code;
	}
	public void setSector_code(Long sector_code) {
		this.sector_code = sector_code;
	}
	public Date getAs_on_date() {
		return as_on_date;
	}
	public void setAs_on_date(Date as_on_date) {
		this.as_on_date = as_on_date;
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
	public MF_Fund_holdings_sectorwise_imputed_latest(Long plan_id, Long sector_code, Date as_on_date,
			Double percentage, Timestamp modified_ts, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.plan_id = plan_id;
		this.sector_code = sector_code;
		this.as_on_date = as_on_date;
		this.percentage = percentage;
		this.modified_ts = modified_ts;
		this.create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Fund_holdings_sectorwise_imputed_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Fund_holdings_sectorwise_imputed_latest [plan_id=" + plan_id + ", sector_code=" + sector_code
				+ ", as_on_date=" + as_on_date + ", percentage=" + percentage + ", modified_ts=" + modified_ts
				+ ", create_date=" + create_date + ", modified_date=" + modified_date + ", created_by=" + created_by
				+ ", modified_by=" + modified_by + "]";
	}
	
}
