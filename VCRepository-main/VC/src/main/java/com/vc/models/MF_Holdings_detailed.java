package com.vc.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_Fd_Holdings_detailed")
public class MF_Holdings_detailed {
	@Id
	private Long plan_id;
	private Long company_id;
	private Long asset_id;
	private Date asset_date;
	private Double asset_value;
	private Long num_of_shares;
	private Double asset_percentage;
	private Double coupon_rate;
	private String maturity;
	private Long rating_id;
	private String isin;
	private String rating_raw;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Holdings_detailed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public Long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}
	public Long getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(Long asset_id) {
		this.asset_id = asset_id;
	}
	public Date getAsset_date() {
		return asset_date;
	}
	public void setAsset_date(Date asset_date) {
		this.asset_date = asset_date;
	}
	public Double getAsset_value() {
		return asset_value;
	}
	public void setAsset_value(Double asset_value) {
		this.asset_value = asset_value;
	}
	public Long getNum_of_shares() {
		return num_of_shares;
	}
	public void setNum_of_shares(Long num_of_shares) {
		this.num_of_shares = num_of_shares;
	}
	public Double getAsset_percentage() {
		return asset_percentage;
	}
	public void setAsset_percentage(Double asset_percentage) {
		this.asset_percentage = asset_percentage;
	}
	public Double getCoupon_rate() {
		return coupon_rate;
	}
	public void setCoupon_rate(Double coupon_rate) {
		this.coupon_rate = coupon_rate;
	}
	public String getMaturity() {
		return maturity;
	}
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}
	public Long getRating_id() {
		return rating_id;
	}
	public void setRating_id(Long rating_id) {
		this.rating_id = rating_id;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getRating_raw() {
		return rating_raw;
	}
	public void setRating_raw(String rating_raw) {
		this.rating_raw = rating_raw;
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
	public MF_Holdings_detailed(Long plan_id, Long company_id, Long asset_id, Date asset_date, Double asset_value,
			Long num_of_shares, Double asset_percentage, Double coupon_rate, String maturity, Long rating_id,
			String isin, String rating_raw, Timestamp modified_ts, Timestamp create_date, Timestamp modified_date,
			String created_by, String modified_by) {
		super();
		this.plan_id = plan_id;
		this.company_id = company_id;
		this.asset_id = asset_id;
		this.asset_date = asset_date;
		this.asset_value = asset_value;
		this.num_of_shares = num_of_shares;
		this.asset_percentage = asset_percentage;
		this.coupon_rate = coupon_rate;
		this.maturity = maturity;
		this.rating_id = rating_id;
		this.isin = isin;
		this.rating_raw = rating_raw;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Holdings_detailed [plan_id=" + plan_id + ", company_id=" + company_id + ", asset_id=" + asset_id
				+ ", asset_date=" + asset_date + ", asset_value=" + asset_value + ", num_of_shares=" + num_of_shares
				+ ", asset_percentage=" + asset_percentage + ", coupon_rate=" + coupon_rate + ", maturity=" + maturity
				+ ", rating_id=" + rating_id + ", isin=" + isin + ", rating_raw=" + rating_raw + ", modified_ts="
				+ modified_ts + ", Create_date=" + Create_date + ", modified_date=" + modified_date + ", created_by="
				+ created_by + ", modified_by=" + modified_by + "]";
	}
	
	
}
