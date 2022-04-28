package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_Fd_Industry")
public class MF_Industry {
	@Id
	private int industry_code;
	private int sector_code;
	private String industry_name;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Industry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIndustry_code() {
		return industry_code;
	}
	public void setIndustry_code(int industry_code) {
		this.industry_code = industry_code;
	}
	public int getSector_code() {
		return sector_code;
	}
	public void setSector_code(int sector_code) {
		this.sector_code = sector_code;
	}
	public String getIndustry_name() {
		return industry_name;
	}
	public void setIndustry_name(String industry_name) {
		this.industry_name = industry_name;
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
	public MF_Industry(int industry_code, int sector_code, String industry_name, Timestamp modified_ts,
			Timestamp create_date, Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.industry_code = industry_code;
		this.sector_code = sector_code;
		this.industry_name = industry_name;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Industry [industry_code=" + industry_code + ", sector_code=" + sector_code + ", industry_name="
				+ industry_name + ", modified_ts=" + modified_ts + ", Create_date=" + Create_date + ", modified_date="
				+ modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
