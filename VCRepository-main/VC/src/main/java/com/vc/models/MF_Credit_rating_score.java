package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "MF_creditratingscore")
public class MF_Credit_rating_score {
	@Id
	private int rating_id;
	private String rating;
	private Timestamp modified_ts;
	private Timestamp created_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	
	public MF_Credit_rating_score() {
	}
	
	public MF_Credit_rating_score(int rating_id, String rating, Timestamp modified_ts, Timestamp created_date,
			Timestamp modified_date, String created_by, String modified_by) {

		this.rating_id = rating_id;
		this.rating = rating;
		this.modified_ts = modified_ts;
		this.created_date = created_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}

	public int getRating_id() {
		return rating_id;
	}
	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Timestamp isModified_ts() {
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

	public Timestamp getModified_ts() {
		return modified_ts;
	}

	@Override
	public String toString() {
		return "MF_Credit_Rating_Score [rating_id=" + rating_id + ", rating=" + rating + ", modified_ts=" + modified_ts
				+ ", created_date=" + created_date + ", modified_date=" + modified_date + ", created_by=" + created_by
				+ ", modified_by=" + modified_by + "]";
	}
	
	
}
