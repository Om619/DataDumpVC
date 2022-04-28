package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MF_Companies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mf_comp_id;
	public Long getMf_comp_id() {
		return mf_comp_id;
	}
	public void setMf_comp_id(Long mf_comp_id) {
		this.mf_comp_id = mf_comp_id;
	}
	private Long company_id;
	private String full_name;
	private String short_name;
	private Timestamp modified_ts;
	private String country_code;
	private int industry_code;
	private Long entity_group_id;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public Long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public int getIndustry_code() {
		return industry_code;
	}
	public void setIndustry_code(int industry_code) {
		this.industry_code = industry_code;
	}
	public Long getEntity_group_id() {
		return entity_group_id;
	}
	public void setEntity_group_id(Long entity_group_id) {
		this.entity_group_id = entity_group_id;
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
	
	public MF_Companies(Long mf_comp_id, Long company_id, String full_name, String short_name, Timestamp modified_ts,
			String country_code, int industry_code, Long entity_group_id, Timestamp create_date,
			Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.mf_comp_id = mf_comp_id;
		this.company_id = company_id;
		this.full_name = full_name;
		this.short_name = short_name;
		this.modified_ts = modified_ts;
		this.country_code = country_code;
		this.industry_code = industry_code;
		this.entity_group_id = entity_group_id;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Companies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Companies [mf_comp_id=" + mf_comp_id + ", company_id=" + company_id + ", full_name=" + full_name
				+ ", short_name=" + short_name + ", modified_ts=" + modified_ts + ", country_code=" + country_code
				+ ", industry_code=" + industry_code + ", entity_group_id=" + entity_group_id + ", Create_date="
				+ Create_date + ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by="
				+ modified_by + "]";
	}
	
	
	
}
