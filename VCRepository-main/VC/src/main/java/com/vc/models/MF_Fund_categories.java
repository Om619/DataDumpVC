package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "MF_Fd_categories")
public class MF_Fund_categories {

	@Id
	private Long category_id;
	private String primary_category_name;
	private String category_name;
	private Timestamp modified_ts;
	private boolean is_active;
	private Timestamp created_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Fund_categories() {
		super();
	}
	
	public Long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public String getPrimary_category_name() {
		return primary_category_name;
	}
	public void setPrimary_category_name(String primary_category_name) {
		this.primary_category_name = primary_category_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
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
	public MF_Fund_categories(Long category_id, String primary_category_name, String category_name,
			Timestamp modified_ts, boolean is_active, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		this.category_id = category_id;
		this.primary_category_name = primary_category_name;
		this.category_name = category_name;
		this.modified_ts = modified_ts;
		this.is_active = is_active;
		this.created_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Fund_categories [category_id=" + category_id
				+ ", primary_category_name=" + primary_category_name + ", category_name=" + category_name
				+ ", modified_ts=" + modified_ts + ", is_active=" + is_active + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by
				+ "]";
	}
	
	
}
