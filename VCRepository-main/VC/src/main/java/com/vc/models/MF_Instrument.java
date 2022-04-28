package com.vc.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_instrument")
public class MF_Instrument {
	@Id
	private Long asset_id;
	private String description;
	private String abv;
	private String instrument_type_id;
	private Timestamp modified_ts;
	private Timestamp create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public Long getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(Long asset_id) {
		this.asset_id = asset_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbv() {
		return abv;
	}
	public void setAbv(String abv) {
		this.abv = abv;
	}
	public String getInstrument_type_id() {
		return instrument_type_id;
	}
	public void setInstrument_type_id(String instrument_type_id) {
		this.instrument_type_id = instrument_type_id;
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
	public MF_Instrument(Long asset_id, String description, String abv, String instrument_type_id,
			Timestamp modified_ts, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.asset_id = asset_id;
		this.description = description;
		this.abv = abv;
		this.instrument_type_id = instrument_type_id;
		this.modified_ts = modified_ts;
		this.create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	public MF_Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MF_Instrument [asset_id=" + asset_id + ", description=" + description + ", abv=" + abv
				+ ", instrument_type_id=" + instrument_type_id + ", modified_ts=" + modified_ts + ", create_date="
				+ create_date + ", modified_date=" + modified_date + ", created_by=" + created_by + ", modified_by="
				+ modified_by + "]";
	}

}
