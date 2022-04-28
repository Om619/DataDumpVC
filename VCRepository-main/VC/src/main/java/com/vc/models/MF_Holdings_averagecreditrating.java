package com.vc.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MF_holdingsaveragecreditrating")
public class MF_Holdings_averagecreditrating {

	@Id
	private Long plan_id;
	private Date as_on_date;
	private Double average_credit_rating;
	private Timestamp modified_ts;
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
	public Date getAs_on_date() {
		return as_on_date;
	}
	public void setAs_on_date(Date as_on_date) {
		this.as_on_date = as_on_date;
	}
	public Double getAverage_credit_rating() {
		return average_credit_rating;
	}
	public void setAverage_credit_rating(Double average_credit_rating) {
		this.average_credit_rating = average_credit_rating;
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
	public MF_Holdings_averagecreditrating(Long plan_id, Date as_on_date, Double average_credit_rating,
			Timestamp modified_ts, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.average_credit_rating = average_credit_rating;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Holdings_averagecreditrating() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Holdings_averagecreditrating [plan_id=" + plan_id + ", as_on_date=" + as_on_date
				+ ", average_credit_rating=" + average_credit_rating + ", modified_ts=" + modified_ts + ", Create_date="
				+ Create_date + ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by="
				+ modified_by + "]";
	}

}
