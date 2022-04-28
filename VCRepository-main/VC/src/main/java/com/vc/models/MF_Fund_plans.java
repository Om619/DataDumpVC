package com.vc.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MF_Fd_plans")
public class MF_Fund_plans {
	@Id
	private Long plan_id;
	@Column(length = 1337)
	private String basic_name;
	@Column(length = 1337)
	private String short_name;
	@Column(length = 1337)
	private String plan_name;
	@Column(length = 1337)
	private String basic_short_name;
	@Column(length = 1337)
	private String scheme_name;
	private Long amc_id;
	private Long category_id;
	@Column(length = 1337)
	private String type_id;
	private Double face_value;
	private Long min_initial_investment;
	private Long min_subsequent_investment;
	private Long min_withdrawl_amount;
	private boolean sip;
	private Long min_subsequent_sip_investment;
	@Column(length = 1337)
	private String sip_note;
	private boolean swp;
	private Long min_swp_widw;
	private boolean stp;
	private Long min_balance;
	@Column(length = 1337)
	private String redemption_note;
	private Long equity_max;
	private Long equity_min;
	private Long debt_max;
	private Long debt_min;
	private Long money_mkt_max;
	private Long money_mkt_min;
	private Date issue_open;
	private Date issue_stated_close;
	private Date issue_actual_close;
	private Date allottment_date;
	private Date late_redemption;
	private Date resale_start_date;
	@Column(length = 1337)
	private String transfer_agent;
	@Column(length = 1337)
	private String transfer_agent_short_name;
	@Column(length = 1337)
	private String transfer_agent_email;
	@Column(length = 1337)
	private String amfi_code;
	@Column(length = 1337)
	private String objective_text;
	@Column(length = 1337)
	private String benchmark;
	@Column(length = 1337)
	private String rta_code;
	private int colour;
	@Column(length = 1337)
	private String isin_code;
	private Timestamp modified_ts;
	private boolean is_dividend;
	private int auditor_code;
	private int custodian_code;
	private boolean is_direct_plan;
	private Long reg_plan_id;
	@Column(length = 1337)
	private String status;
	private boolean new_fund;
	@Column(length = 1337)
	private String dividend_periodicity;
	private boolean is_etf_fund;
    private boolean lock_in;
    private int lock_in_period_days;
    private boolean variant;
    private Long variant_fund_id;
    private boolean is_rgess_plan;
    private Double min_widw_unit;
    private Double min_subsequent_investment_unit;
    private int min_investment_multiples;
    @Column(length = 1337)
    private String transaction_status;
    private Double stated_annual_expense;
    private Long max_inv_amount;
    private boolean is_fof;
    private Date last_etf_trade_date;
    private boolean is_index_fund;
    private Timestamp Create_date;
	private Timestamp modified_date;
	private String created_by;
	private String modified_by;
	public MF_Fund_plans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public String getBasic_name() {
		return basic_name;
	}
	public void setBasic_name(String basic_name) {
		this.basic_name = basic_name;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getBasic_short_name() {
		return basic_short_name;
	}
	public void setBasic_short_name(String basic_short_name) {
		this.basic_short_name = basic_short_name;
	}
	public String getScheme_name() {
		return scheme_name;
	}
	public void setScheme_name(String scheme_name) {
		this.scheme_name = scheme_name;
	}
	public Long getAmc_id() {
		return amc_id;
	}
	public void setAmc_id(Long amc_id) {
		this.amc_id = amc_id;
	}
	public Long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}
	public Double getFace_value() {
		return face_value;
	}
	public void setFace_value(Double face_value) {
		this.face_value = face_value;
	}
	public Long getMin_initial_investment() {
		return min_initial_investment;
	}
	public void setMin_initial_investment(Long min_initial_investment) {
		this.min_initial_investment = min_initial_investment;
	}
	public Long getMin_subsequent_investment() {
		return min_subsequent_investment;
	}
	public void setMin_subsequent_investment(Long min_subsequent_investment) {
		this.min_subsequent_investment = min_subsequent_investment;
	}
	public Long getMin_withdrawl_amount() {
		return min_withdrawl_amount;
	}
	public void setMin_withdrawl_amount(Long min_withdrawl_amount) {
		this.min_withdrawl_amount = min_withdrawl_amount;
	}
	public boolean isSip() {
		return sip;
	}
	public void setSip(boolean sip) {
		this.sip = sip;
	}
	public Long getMin_subsequent_sip_investment() {
		return min_subsequent_sip_investment;
	}
	public void setMin_subsequent_sip_investment(Long min_subsequent_sip_investment) {
		this.min_subsequent_sip_investment = min_subsequent_sip_investment;
	}
	public String getSip_note() {
		return sip_note;
	}
	public void setSip_note(String sip_note) {
		this.sip_note = sip_note;
	}
	public boolean isSwp() {
		return swp;
	}
	public void setSwp(boolean swp) {
		this.swp = swp;
	}
	public Long getMin_swp_widw() {
		return min_swp_widw;
	}
	public void setMin_swp_widw(Long min_swp_widw) {
		this.min_swp_widw = min_swp_widw;
	}
	public boolean isStp() {
		return stp;
	}
	public void setStp(boolean stp) {
		this.stp = stp;
	}
	public Long getMin_balance() {
		return min_balance;
	}
	public void setMin_balance(Long min_balance) {
		this.min_balance = min_balance;
	}
	public String getRedemption_note() {
		return redemption_note;
	}
	public void setRedemption_note(String redemption_note) {
		this.redemption_note = redemption_note;
	}
	public Long getEquity_max() {
		return equity_max;
	}
	public void setEquity_max(Long equity_max) {
		this.equity_max = equity_max;
	}
	public Long getEquity_min() {
		return equity_min;
	}
	public void setEquity_min(Long equity_min) {
		this.equity_min = equity_min;
	}
	public Long getDebt_max() {
		return debt_max;
	}
	public void setDebt_max(Long debt_max) {
		this.debt_max = debt_max;
	}
	public Long getDebt_min() {
		return debt_min;
	}
	public void setDebt_min(Long debt_min) {
		this.debt_min = debt_min;
	}
	public Long getMoney_mkt_max() {
		return money_mkt_max;
	}
	public void setMoney_mkt_max(Long money_mkt_max) {
		this.money_mkt_max = money_mkt_max;
	}
	public Long getMoney_mkt_min() {
		return money_mkt_min;
	}
	public void setMoney_mkt_min(Long money_mkt_min) {
		this.money_mkt_min = money_mkt_min;
	}
	public Date getIssue_open() {
		return issue_open;
	}
	public void setIssue_open(Date issue_open) {
		this.issue_open = issue_open;
	}
	public Date getIssue_stated_close() {
		return issue_stated_close;
	}
	public void setIssue_stated_close(Date issue_stated_close) {
		this.issue_stated_close = issue_stated_close;
	}
	public Date getIssue_actual_close() {
		return issue_actual_close;
	}
	public void setIssue_actual_close(Date issue_actual_close) {
		this.issue_actual_close = issue_actual_close;
	}
	public Date getAllottment_date() {
		return allottment_date;
	}
	public void setAllottment_date(Date allottment_date) {
		this.allottment_date = allottment_date;
	}
	public Date getLate_redemption() {
		return late_redemption;
	}
	public void setLate_redemption(Date late_redemption) {
		this.late_redemption = late_redemption;
	}
	public Date getResale_start_date() {
		return resale_start_date;
	}
	public void setResale_start_date(Date resale_start_date) {
		this.resale_start_date = resale_start_date;
	}
	public String getTransfer_agent() {
		return transfer_agent;
	}
	public void setTransfer_agent(String transfer_agent) {
		this.transfer_agent = transfer_agent;
	}
	public String getTransfer_agent_short_name() {
		return transfer_agent_short_name;
	}
	public void setTransfer_agent_short_name(String transfer_agent_short_name) {
		this.transfer_agent_short_name = transfer_agent_short_name;
	}
	public String getTransfer_agent_email() {
		return transfer_agent_email;
	}
	public void setTransfer_agent_email(String transfer_agent_email) {
		this.transfer_agent_email = transfer_agent_email;
	}
	public String getAmfi_code() {
		return amfi_code;
	}
	public void setAmfi_code(String amfi_code) {
		this.amfi_code = amfi_code;
	}
	public String getObjective_text() {
		return objective_text;
	}
	public void setObjective_text(String objective_text) {
		this.objective_text = objective_text;
	}
	public String getBenchmark() {
		return benchmark;
	}
	public void setBenchmark(String benchmark) {
		this.benchmark = benchmark;
	}
	public String getRta_code() {
		return rta_code;
	}
	public void setRta_code(String rta_code) {
		this.rta_code = rta_code;
	}
	public int getColour() {
		return colour;
	}
	public void setColour(int colour) {
		this.colour = colour;
	}
	public String getIsin_code() {
		return isin_code;
	}
	public void setIsin_code(String isin_code) {
		this.isin_code = isin_code;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public boolean isIs_dividend() {
		return is_dividend;
	}
	public void setIs_dividend(boolean is_dividend) {
		this.is_dividend = is_dividend;
	}
	public int getAuditor_code() {
		return auditor_code;
	}
	public void setAuditor_code(int auditor_code) {
		this.auditor_code = auditor_code;
	}
	public int getCustodian_code() {
		return custodian_code;
	}
	public void setCustodian_code(int custodian_code) {
		this.custodian_code = custodian_code;
	}
	public boolean isIs_direct_plan() {
		return is_direct_plan;
	}
	public void setIs_direct_plan(boolean is_direct_plan) {
		this.is_direct_plan = is_direct_plan;
	}
	public Long getReg_plan_id() {
		return reg_plan_id;
	}
	public void setReg_plan_id(Long reg_plan_id) {
		this.reg_plan_id = reg_plan_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isNew_fund() {
		return new_fund;
	}
	public void setNew_fund(boolean new_fund) {
		this.new_fund = new_fund;
	}
	public String getDividend_periodicity() {
		return dividend_periodicity;
	}
	public void setDividend_periodicity(String dividend_periodicity) {
		this.dividend_periodicity = dividend_periodicity;
	}
	public boolean isIs_etf_fund() {
		return is_etf_fund;
	}
	public void setIs_etf_fund(boolean is_etf_fund) {
		this.is_etf_fund = is_etf_fund;
	}
	public boolean isLock_in() {
		return lock_in;
	}
	public void setLock_in(boolean lock_in) {
		this.lock_in = lock_in;
	}
	public int getLock_in_period_days() {
		return lock_in_period_days;
	}
	public void setLock_in_period_days(int lock_in_period_days) {
		this.lock_in_period_days = lock_in_period_days;
	}
	public boolean isVariant() {
		return variant;
	}
	public void setVariant(boolean variant) {
		this.variant = variant;
	}
	public Long getVariant_fund_id() {
		return variant_fund_id;
	}
	public void setVariant_fund_id(Long variant_fund_id) {
		this.variant_fund_id = variant_fund_id;
	}
	public boolean isIs_rgess_plan() {
		return is_rgess_plan;
	}
	public void setIs_rgess_plan(boolean is_rgess_plan) {
		this.is_rgess_plan = is_rgess_plan;
	}
	public Double getMin_widw_unit() {
		return min_widw_unit;
	}
	public void setMin_widw_unit(Double min_widw_unit) {
		this.min_widw_unit = min_widw_unit;
	}
	public Double getMin_subsequent_investment_unit() {
		return min_subsequent_investment_unit;
	}
	public void setMin_subsequent_investment_unit(Double min_subsequent_investment_unit) {
		this.min_subsequent_investment_unit = min_subsequent_investment_unit;
	}
	public int getMin_investment_multiples() {
		return min_investment_multiples;
	}
	public void setMin_investment_multiples(int min_investment_multiples) {
		this.min_investment_multiples = min_investment_multiples;
	}
	public String getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(String transaction_status) {
		this.transaction_status = transaction_status;
	}
	public Double getStated_annual_expense() {
		return stated_annual_expense;
	}
	public void setStated_annual_expense(Double stated_annual_expense) {
		this.stated_annual_expense = stated_annual_expense;
	}
	public Long getMax_inv_amount() {
		return max_inv_amount;
	}
	public void setMax_inv_amount(Long max_inv_amount) {
		this.max_inv_amount = max_inv_amount;
	}
	public boolean isIs_fof() {
		return is_fof;
	}
	public void setIs_fof(boolean is_fof) {
		this.is_fof = is_fof;
	}
	public Date getLast_etf_trade_date() {
		return last_etf_trade_date;
	}
	public void setLast_etf_trade_date(Date last_etf_trade_date) {
		this.last_etf_trade_date = last_etf_trade_date;
	}
	public boolean isIs_index_fund() {
		return is_index_fund;
	}
	public void setIs_index_fund(boolean is_index_fund) {
		this.is_index_fund = is_index_fund;
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
	public MF_Fund_plans(Long plan_id, String basic_name, String short_name, String plan_name, String basic_short_name,
			String scheme_name, Long amc_id, Long category_id, String type_id, Double face_value,
			Long min_initial_investment, Long min_subsequent_investment, Long min_withdrawl_amount, boolean sip,
			Long min_subsequent_sip_investment, String sip_note, boolean swp, Long min_swp_widw, boolean stp,
			Long min_balance, String redemption_note, Long equity_max, Long equity_min, Long debt_max, Long debt_min,
			Long money_mkt_max, Long money_mkt_min, Date issue_open, Date issue_stated_close, Date issue_actual_close,
			Date allottment_date, Date late_redemption, Date resale_start_date, String transfer_agent,
			String transfer_agent_short_name, String transfer_agent_email, String amfi_code, String objective_text,
			String benchmark, String rta_code, int colour, String isin_code, Timestamp modified_ts, boolean is_dividend,
			int auditor_code, int custodian_code, boolean is_direct_plan, Long reg_plan_id, String status,
			boolean new_fund, String dividend_periodicity, boolean is_etf_fund, boolean lock_in,
			int lock_in_period_days, boolean variant, Long variant_fund_id, boolean is_rgess_plan, Double min_widw_unit,
			Double min_subsequent_investment_unit, int min_investment_multiples, String transaction_status,
			Double stated_annual_expense, Long max_inv_amount, boolean is_fof, Date last_etf_trade_date,
			boolean is_index_fund, Timestamp create_date, Timestamp modified_date, String created_by,
			String modified_by) {
		super();
		this.plan_id = plan_id;
		this.basic_name = basic_name;
		this.short_name = short_name;
		this.plan_name = plan_name;
		this.basic_short_name = basic_short_name;
		this.scheme_name = scheme_name;
		this.amc_id = amc_id;
		this.category_id = category_id;
		this.type_id = type_id;
		this.face_value = face_value;
		this.min_initial_investment = min_initial_investment;
		this.min_subsequent_investment = min_subsequent_investment;
		this.min_withdrawl_amount = min_withdrawl_amount;
		this.sip = sip;
		this.min_subsequent_sip_investment = min_subsequent_sip_investment;
		this.sip_note = sip_note;
		this.swp = swp;
		this.min_swp_widw = min_swp_widw;
		this.stp = stp;
		this.min_balance = min_balance;
		this.redemption_note = redemption_note;
		this.equity_max = equity_max;
		this.equity_min = equity_min;
		this.debt_max = debt_max;
		this.debt_min = debt_min;
		this.money_mkt_max = money_mkt_max;
		this.money_mkt_min = money_mkt_min;
		this.issue_open = issue_open;
		this.issue_stated_close = issue_stated_close;
		this.issue_actual_close = issue_actual_close;
		this.allottment_date = allottment_date;
		this.late_redemption = late_redemption;
		this.resale_start_date = resale_start_date;
		this.transfer_agent = transfer_agent;
		this.transfer_agent_short_name = transfer_agent_short_name;
		this.transfer_agent_email = transfer_agent_email;
		this.amfi_code = amfi_code;
		this.objective_text = objective_text;
		this.benchmark = benchmark;
		this.rta_code = rta_code;
		this.colour = colour;
		this.isin_code = isin_code;
		this.modified_ts = modified_ts;
		this.is_dividend = is_dividend;
		this.auditor_code = auditor_code;
		this.custodian_code = custodian_code;
		this.is_direct_plan = is_direct_plan;
		this.reg_plan_id = reg_plan_id;
		this.status = status;
		this.new_fund = new_fund;
		this.dividend_periodicity = dividend_periodicity;
		this.is_etf_fund = is_etf_fund;
		this.lock_in = lock_in;
		this.lock_in_period_days = lock_in_period_days;
		this.variant = variant;
		this.variant_fund_id = variant_fund_id;
		this.is_rgess_plan = is_rgess_plan;
		this.min_widw_unit = min_widw_unit;
		this.min_subsequent_investment_unit = min_subsequent_investment_unit;
		this.min_investment_multiples = min_investment_multiples;
		this.transaction_status = transaction_status;
		this.stated_annual_expense = stated_annual_expense;
		this.max_inv_amount = max_inv_amount;
		this.is_fof = is_fof;
		this.last_etf_trade_date = last_etf_trade_date;
		this.is_index_fund = is_index_fund;
		Create_date = create_date;
		this.modified_date = modified_date;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "MF_Fund_plans [plan_id=" + plan_id + ", basic_name=" + basic_name + ", short_name=" + short_name
				+ ", plan_name=" + plan_name + ", basic_short_name=" + basic_short_name + ", scheme_name=" + scheme_name
				+ ", amc_id=" + amc_id + ", category_id=" + category_id + ", type_id=" + type_id + ", face_value="
				+ face_value + ", min_initial_investment=" + min_initial_investment + ", min_subsequent_investment="
				+ min_subsequent_investment + ", min_withdrawl_amount=" + min_withdrawl_amount + ", sip=" + sip
				+ ", min_subsequent_sip_investment=" + min_subsequent_sip_investment + ", sip_note=" + sip_note
				+ ", swp=" + swp + ", min_swp_widw=" + min_swp_widw + ", stp=" + stp + ", min_balance=" + min_balance
				+ ", redemption_note=" + redemption_note + ", equity_max=" + equity_max + ", equity_min=" + equity_min
				+ ", debt_max=" + debt_max + ", debt_min=" + debt_min + ", money_mkt_max=" + money_mkt_max
				+ ", money_mkt_min=" + money_mkt_min + ", issue_open=" + issue_open + ", issue_stated_close="
				+ issue_stated_close + ", issue_actual_close=" + issue_actual_close + ", allottment_date="
				+ allottment_date + ", late_redemption=" + late_redemption + ", resale_start_date=" + resale_start_date
				+ ", transfer_agent=" + transfer_agent + ", transfer_agent_short_name=" + transfer_agent_short_name
				+ ", transfer_agent_email=" + transfer_agent_email + ", amfi_code=" + amfi_code + ", objective_text="
				+ objective_text + ", benchmark=" + benchmark + ", rta_code=" + rta_code + ", colour=" + colour
				+ ", isin_code=" + isin_code + ", modified_ts=" + modified_ts + ", is_dividend=" + is_dividend
				+ ", auditor_code=" + auditor_code + ", custodian_code=" + custodian_code + ", is_direct_plan="
				+ is_direct_plan + ", reg_plan_id=" + reg_plan_id + ", status=" + status + ", new_fund=" + new_fund
				+ ", dividend_periodicity=" + dividend_periodicity + ", is_etf_fund=" + is_etf_fund + ", lock_in="
				+ lock_in + ", lock_in_period_days=" + lock_in_period_days + ", variant=" + variant
				+ ", variant_fund_id=" + variant_fund_id + ", is_rgess_plan=" + is_rgess_plan + ", min_widw_unit="
				+ min_widw_unit + ", min_subsequent_investment_unit=" + min_subsequent_investment_unit
				+ ", min_investment_multiples=" + min_investment_multiples + ", transaction_status="
				+ transaction_status + ", stated_annual_expense=" + stated_annual_expense + ", max_inv_amount="
				+ max_inv_amount + ", is_fof=" + is_fof + ", last_etf_trade_date=" + last_etf_trade_date
				+ ", is_index_fund=" + is_index_fund + ", Create_date=" + Create_date + ", modified_date="
				+ modified_date + ", created_by=" + created_by + ", modified_by=" + modified_by + "]";
	}
	
}
