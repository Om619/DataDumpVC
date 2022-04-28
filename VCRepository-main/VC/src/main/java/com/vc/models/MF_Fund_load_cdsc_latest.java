package com.vc.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_Fd_load_cdsc_latest")
public class MF_Fund_load_cdsc_latest {
	@Id
	private Long plan_id;
	private Date as_on_date;
	private Double cdsc;
	private String start_operand;
	private Long period_start;
	private String end_operand;
	private Long period_end;
	private Double percentage;
	private Timestamp modified_ts;
	private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Fund_load_cdsc_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Double getCdsc() {
		return cdsc;
	}
	public void setCdsc(Double cdsc) {
		this.cdsc = cdsc;
	}
	public String getStart_operand() {
		return start_operand;
	}
	public void setStart_operand(String start_operand) {
		this.start_operand = start_operand;
	}
	public Long getPeriod_start() {
		return period_start;
	}
	public void setPeriod_start(Long period_start) {
		this.period_start = period_start;
	}
	public String getEnd_operand() {
		return end_operand;
	}
	public void setEnd_operand(String end_operand) {
		this.end_operand = end_operand;
	}
	public Long getPeriod_end() {
		return period_end;
	}
	public void setPeriod_end(Long period_end) {
		this.period_end = period_end;
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
	public MF_Fund_load_cdsc_latest(Long plan_id, Date as_on_date, Double cdsc, String start_operand, Long period_start,
			String end_operand, Long period_end, Double percentage, Timestamp modified_ts, Timestamp create_date,
			Timestamp modified_date, String created_by, String modified_by) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.cdsc = cdsc;
		this.start_operand = start_operand;
		this.period_start = period_start;
		this.end_operand = end_operand;
		this.period_end = period_end;
		this.percentage = percentage;
		this.modified_ts = modified_ts;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Fund_load_cdsc_latest [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", cdsc=" + cdsc
				+ ", start_operand=" + start_operand + ", period_start=" + period_start + ", end_operand=" + end_operand
				+ ", period_end=" + period_end + ", percentage=" + percentage + ", modified_ts=" + modified_ts
				+ ", Create_date=" + Create_date + ", modified_date=" + modified_date + ", created_by=" + created_by
				+ ", modified_by=" + modified_by + "]";
	}
	
	
}
