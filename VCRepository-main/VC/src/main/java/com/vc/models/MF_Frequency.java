package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_frequency")
public class MF_Frequency {
	@Id
	private int frequency_code;
	private String frequency_desc;
	private String short_code;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public int getFrequency_code() {
		return frequency_code;
	}
	public void setFrequency_code(int frequency_code) {
		this.frequency_code = frequency_code;
	}
	public String getFrequency_desc() {
		return frequency_desc;
	}
	public void setFrequency_desc(String frequency_desc) {
		this.frequency_desc = frequency_desc;
	}
	public String getShort_code() {
		return short_code;
	}
	public void setShort_code(String short_code) {
		this.short_code = short_code;
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
	public MF_Frequency(int frequency_code, String frequency_desc, String short_code, Timestamp modified_ts,
			Timestamp create_date, Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.frequency_code = frequency_code;
		this.frequency_desc = frequency_desc;
		this.short_code = short_code;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Frequency() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Frequency [frequency_code=" + frequency_code + ", frequency_desc=" + frequency_desc + ", short_code="
				+ short_code + ", modified_ts=" + modified_ts + ", Create_date=" + Create_date + ", modified_date="
				+ modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
