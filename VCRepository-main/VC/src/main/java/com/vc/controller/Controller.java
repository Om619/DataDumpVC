package com.vc.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.vc.dao.Dao;
import com.vc.models.MF_Fund_dividends;
import com.vc.services.AmcsServices;

@RestController
public class Controller {

	@Autowired
	private AmcsServices amcsservices;
	@Autowired
	private Dao dao;

	@SuppressWarnings({ "unchecked", "static-access" })
	@GetMapping("/getdividends")
	public JsonNode getamcs() throws JsonMappingException, JsonProcessingException {
		JsonMapper mapper = new JsonMapper();
		String result = amcsservices.getamcsmf();
		JsonNode obj = mapper.readTree(result);
		JsonNode fields = obj.get("data");
		List<MF_Fund_dividends> lstAmcs = new ArrayList<MF_Fund_dividends>();
		for (int i = 0; i < fields.size(); i++) {
			Map<String, Object> parser = new ObjectMapper().readValue(fields.get(i).toString(), LinkedHashMap.class);
			MF_Fund_dividends mfholding = new MF_Fund_dividends();
			for (Map.Entry<String, Object> hs : parser.entrySet()) {
//				if (("status_description").equals(hs.getKey())) {
//					mf_Fund_holding.setStatus_description(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
				if (("plan_id").equals(hs.getKey())) {
					mfholding.setPlan_id(Long.parseLong(hs.getValue().toString()));
				}
				if (("div_date").equals(hs.getKey())) {
					Date of = Date.valueOf((String) hs.getValue());
					mfholding.setDiv_date(of);
					of = null;
				}
				if (("record_date").equals(hs.getKey())) {
					Date of = Date.valueOf((String) hs.getValue());
					mfholding.setRecord_date(of);
					of = null;
				}
				if (("percentage").equals(hs.getKey())) {
					mfholding.setPercentage(Double.parseDouble(hs.getValue().toString()));
				}
				if (("is_tax_adjustable").equals(hs.getKey())) {
					mfholding.setIs_tax_adjustable(hs.getValue().toString().equals("true") ? true : false);
				}
				if (("percentage_rs_per_unit").equals(hs.getKey())) {
					mfholding.setPercentage_rs_per_unit(Double.parseDouble(hs.getValue().toString()));
				}
//				if (("description").equals(hs.getKey())) {
//					mfholding.setDescription(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("abv").equals(hs.getKey())) {
//					mfholding.setAbv(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("subplan_name").equals(hs.getKey())) {
//					mfholding.setSubplan_name(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("description").equals(hs.getKey())) {
//					mfholding.setDescription(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("sector_code").equals(hs.getKey())) {
//					mfholding.setSector_code(Long.parseLong(hs.getValue().toString()));
//				}
//				if (("div_date").equals(hs.getKey())) {
//					Date of = Date.valueOf((String) hs.getValue());
//					mfholding.setDiv_date(of);
//					of = null;
//				}
//				if (("record_date").equals(hs.getKey())) {
//					Date of = Date.valueOf((String) hs.getValue());
//					mfholding.setRecord_date(of);
//					of = null;
//				}
//				if (("percentage").equals(hs.getKey())) {
//					mfholding.setPercentage(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("offered").equals(hs.getKey())) {
//					mfholding.setOffered(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("plan_name").equals(hs.getKey())) {
//					mfholding.setPlan_name(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("sip_frequency").equals(hs.getKey())) {
//					mfholding.setSip_frequency(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("sip_dates").equals(hs.getKey())) {
//					mfholding.setSip_dates(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("sip_min_inv_amount").equals(hs.getKey())) {
//					mfholding.setSip_min_inv_amount(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("swp_frequency").equals(hs.getKey())) {
//					mfholding.setSwp_frequency(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("swp_dates").equals(hs.getKey())) {
//					mfholding.setSwp_dates(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("swp_min_inv_amount").equals(hs.getKey())) {
//					mfholding.setSwp_min_inv_amount(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("stp_frequency").equals(hs.getKey())) {
//					mfholding.setStp_frequency(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("stp_dates").equals(hs.getKey())) {
//					mfholding.setStp_dates(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("stp_min_inv_amount").equals(hs.getKey())) {
//					mfholding.setStp_min_inv_amount(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("idnumber").equals(hs.getKey())) {
//					mf_Fund_holding.setIdnumber(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("description").equals(hs.getKey())) {
//					mf_Fund_holding.setDescription(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("descriptionformat").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("parent").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("sortorder").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("coursecount").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("visible").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("visibleold").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("timemodified").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("depth").equals(hs.getKey())) {
//					mf_Fund_holding.setId(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("path").equals(hs.getKey())) {
//					mf_Fund_holding.setName(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("theme").equals(hs.getKey())) {
//					mf_Fund_holding.setName(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("as_on_date").equals(hs.getKey())) {
//					Date of = Date.valueOf(hs.getValue().toString());
//					mfholding.setAs_on_date(of);
//					 of= null;
//				}
//				if (("instrument_type_id").equals(hs.getKey())) {
//					mfholding.setInstrument_type_id(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
				if (("modified_ts").equals(hs.getKey())) {
					Timestamp mod = Timestamp.valueOf(hs.getValue().toString());
					mfholding.setModified_ts(mod);
				}

//				if (("sip_max_inv_amount").equals(hs.getKey())) {
//					mfholding.setSip_max_inv_amount(hs.getValue() == null ? "" : hs.getValue().toString());
//				}

//				if (("record_date").equals(hs.getKey())) {
//					Date of = Date.valueOf(hs.getValue().toString());
//					mf_Fund_holding.setRecord_date(of);
//					of = null;
//				}
//				if (("percentage").equals(hs.getKey())) {
//					mf_Fund_holding.setPercentage(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("is_tax_adjustable").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_tax_adjustable(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("percentage_rs_per_unit").equals(hs.getKey())) {
//					mf_Fund_holding.setPercentage_rs_per_unit(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("short_code").equals(hs.getKey())) {
//					mf_Fund_holding.setShort_code(hs.getValue() == null ? "" : hs.getValue().toString());
//				}

//				if (("short_name").equals(hs.getKey())) {
//					mf_Fund_holding.setShort_name(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("plan_name").equals(hs.getKey())) {
//					mf_Fund_holding.setPlan_name(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("basic_short_name").equals(hs.getKey())) {
//					mf_Fund_holding.setBasic_short_name(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("scheme_name").equals(hs.getKey())) {
//					mf_Fund_holding.setScheme_name(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("amc_id").equals(hs.getKey())) {
//					mf_Fund_holding.setAmc_id(Long.parseLong(hs.getValue().toString()));
//				}
//				if (("category_id").equals(hs.getKey())) {
//					mf_Fund_holding.setCategory_id(Long.parseLong(hs.getValue().toString()));
//				}
//				if (("type_id").equals(hs.getKey())) {
//					String mat=hs.getValue().toString();
//					mf_Fund_holding.setType_id(mat);
////                //mf_Fund_holding.setMaturity(hs.getValue().toString().equals(0)?"0":hs.getValue().toString());
//				}
//				if (("face_value").equals(hs.getKey())) {
//					mf_Fund_holding.setFace_value(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("min_initial_investment").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_initial_investment(Long.parseLong(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("min_subsequent_investment").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_subsequent_investment(Long.parseLong(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("min_withdrawl_amount").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_withdrawl_amount(Long.parseLong(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("sip").equals(hs.getKey())) {
//					mf_Fund_holding.setSip(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("min_subsequent_sip_investment").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_subsequent_sip_investment(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("sip_note").equals(hs.getKey())) {
//					mf_Fund_holding.setSip_note(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("swp").equals(hs.getKey())) {
//					mf_Fund_holding.setSwp(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("min_swp_widw").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_swp_widw(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("stp").equals(hs.getKey())) {
//					mf_Fund_holding.setStp(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("min_balance").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_balance(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("redemption_note").equals(hs.getKey())) {
//					mf_Fund_holding.setRedemption_note(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("equity_max").equals(hs.getKey())) {
//					mf_Fund_holding.setEquity_max(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("equity_min").equals(hs.getKey())) {
//					mf_Fund_holding.setEquity_min(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("debt_max").equals(hs.getKey())) {
//					mf_Fund_holding.setDebt_max(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("debt_min").equals(hs.getKey())) {
//					mf_Fund_holding.setDebt_min(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("money_mkt_max").equals(hs.getKey())) {
//					mf_Fund_holding.setMoney_mkt_max(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("money_mkt_min").equals(hs.getKey())) {
//					mf_Fund_holding.setMoney_mkt_min(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}

//				if (("asset_id").equals(hs.getKey())) {
//					mf_Fund_holding.setAsset_id(Long.parseLong(hs.getValue().toString()));
//				}
////				
//				if (("issue_open").equals(hs.getKey())) {
//					Date of = Date.valueOf((String) hs.getValue());
//					mf_Fund_holding.setIssue_open(of);
//					of = null;
//				}
//				if (("issue_stated_close").equals(hs.getKey())) {
//					Date of = Date.valueOf((String) hs.getValue());
//					mf_Fund_holding.setIssue_stated_close(of);
//					of = null;
//				}
//				if (("issue_actual_close").equals(hs.getKey())) {
//					Date of = Date.valueOf((String) hs.getValue());
//					mf_Fund_holding.setIssue_actual_close(of);
//					of = null;
//				}
//				if (("allottment_date").equals(hs.getKey())) {
//					Date of = Date.valueOf(hs.getValue() == null ? "2021-11-24" :(String) hs.getValue());
//					mf_Fund_holding.setAllottment_date(of);
//					of = null;
//				}
//				if (("late_redemption").equals(hs.getKey())) {
//					Date of = Date.valueOf(hs.getValue() == null ? "2021-11-24" : (String) hs.getValue());
//					mf_Fund_holding.setLate_redemption(of);
//					of = null;
//				}
//				if (("resale_start_date").equals(hs.getKey())) {
//					Date of = Date.valueOf(hs.getValue() == null ? "2021-11-17" : (String) hs.getValue());
//					mf_Fund_holding.setResale_start_date(of);
//					of = null;
//				}
//				if (("transfer_agent").equals(hs.getKey())) {
//					int parseInt = Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString());
//					String string=String.valueOf(parseInt);
//					mf_Fund_holding.setTransfer_agent(string);
//					}
//				if (("transfer_agent_short_name").equals(hs.getKey())) {
//					mf_Fund_holding.setTransfer_agent_short_name(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("transfer_agent_email").equals(hs.getKey())) {
//					mf_Fund_holding.setTransfer_agent_email(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("amfi_code").equals(hs.getKey())) {
//					mf_Fund_holding.setAmfi_code(hs.getValue() == null ? "" : hs.getValue().toString());
////					int parseInt = Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString());
////					String string=String.valueOf(parseInt);
////					mf_Fund_holding.setTransfer_agent(string);
//					//mf_Fund_holding.setAmfi_code(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("objective_text").equals(hs.getKey())) {
//					mf_Fund_holding.setObjective_text(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("benchmark").equals(hs.getKey())) {
//					mf_Fund_holding.setBenchmark(hs.getValue() == null ? "" : hs.getValue().toString());
//					//int parseInt = Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString());
//					//String string=String.valueOf(parseInt);
//					//mf_Fund_holding.setTransfer_agent(string);
//					//mf_Fund_holding.setBenchmark(hs.getValue() == null ? "" : (String) hs.getValue());
//					}
//				if (("rta_code").equals(hs.getKey())) {
//					mf_Fund_holding.setRta_code(hs.getValue() == null ? "" :hs.getValue().toString());
//					}
//				if (("colour").equals(hs.getKey())) {
//					mf_Fund_holding.setColour(Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("isin_code").equals(hs.getKey())) {
//					mf_Fund_holding.setIsin_code(hs.getValue() == null ? "" : hs.getValue().toString());
//					}
//				if (("modified_ts").equals(hs.getKey())) {
//					Timestamp mod = Timestamp.valueOf(hs.getValue().toString());
//					mf_Fund_holding.setModified_ts(mod);
//				}
//				if (("is_dividend").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_dividend(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("auditor_code").equals(hs.getKey())) {
//					mf_Fund_holding.setAuditor_code(Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("custodian_code").equals(hs.getKey())) {
//					mf_Fund_holding.setCustodian_code(Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("is_direct_plan").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_direct_plan(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("reg_plan_id").equals(hs.getKey())) {
//					mf_Fund_holding.setReg_plan_id(Long.parseLong(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("status").equals(hs.getKey())) {
//					mf_Fund_holding.setStatus(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("new_fund").equals(hs.getKey())) {
//					mf_Fund_holding.setNew_fund(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("dividend_periodicity").equals(hs.getKey())) {
//					mf_Fund_holding.setDividend_periodicity(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("is_etf_fund").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_etf_fund(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("lock_in").equals(hs.getKey())) {
//					mf_Fund_holding.setLock_in(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("lock_in_period_days").equals(hs.getKey())) {
//					mf_Fund_holding.setLock_in_period_days(Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("variant").equals(hs.getKey())) {
//					mf_Fund_holding.setVariant(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("variant_fund_id").equals(hs.getKey())) {
//					mf_Fund_holding.setVariant_fund_id(Long.parseLong(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("is_rgess_plan").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_rgess_plan(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("min_widw_unit").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_widw_unit(Double.parseDouble(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("min_subsequent_investment_unit").equals(hs.getKey())) {
//						mf_Fund_holding.setMin_subsequent_investment_unit(Double.parseDouble(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("min_investment_multiples").equals(hs.getKey())) {
//					mf_Fund_holding.setMin_investment_multiples(Integer.parseInt(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("transaction_status").equals(hs.getKey())) {
//					mf_Fund_holding.setTransaction_status(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("stated_annual_expense").equals(hs.getKey())) {
//					mf_Fund_holding.setStated_annual_expense(Double.parseDouble(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("max_inv_amount").equals(hs.getKey())) {
//					mf_Fund_holding.setMax_inv_amount(Long.parseLong(hs.getValue()==null?"0":hs.getValue().toString()));
//				}
//				if (("is_fof").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_fof(hs.getValue().toString().equals("true")?true:false);
//				}
//				if (("last_etf_trade_date").equals(hs.getKey())) {
//					Date of = Date.valueOf(hs.getValue() == null ? "2021-11-24" : (String) hs.getValue());
//					mf_Fund_holding.setLast_etf_trade_date(of);
//					of = null;
//				}
//				if (("is_index_fund").equals(hs.getKey())) {
//					mf_Fund_holding.setIs_index_fund(hs.getValue().toString().equals("true")?true:false);
//				}

//				if (("num_of_shares").equals(hs.getKey())) {
//					mf_Fund_holding.setNum_of_shares(hs.getValue()==null?0L:Long.parseLong(hs.getValue().toString()));
//				}
//				if (("asset_percentage").equals(hs.getKey())) {
//					mf_Fund_holding.setAsset_percentage(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("coupon_rate").equals(hs.getKey())) {
//					mf_Fund_holding.setCoupon_rate(Double.parseDouble(hs.getValue().toString()));
//				}
//				if (("maturity").equals(hs.getKey())) {
//					String mat=hs.getValue().toString();
//					mf_Fund_holding.setMaturity(mat);
//                //mf_Fund_holding.setMaturity(hs.getValue().toString().equals(0)?"0":hs.getValue().toString());
//				}
//                if (("rating_id").equals(hs.getKey())) {
//					mf_Fund_holding.setRating_id(Long.parseLong(hs.getValue().toString()));
//				}
//                if (("isin").equals(hs.getKey())) {
//                	String mat=hs.getValue().toString();
//                	mf_Fund_holding.setIsin(mat);
//    				}
//                if (("rating_raw").equals(hs.getKey())) {
//                    mf_Fund_holding.setRating_raw(hs.getValue() == null ? "" : (String) hs.getValue());
//    				}
//				}
//					mf_Fund_holding.setBack_load(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("period_start").equals(hs.getKey())) {
//					mf_Fund_holding.setPeriod_start(Long.parseLong(hs.getValue().toString()));
//				}

//				if (("period_end").equals(hs.getKey())) {
//					mf_Fund_holding.setPeriod_end(Long.parseLong(hs.getValue().toString()));
//				}
//				if (("debt").equals(hs.getKey())) {
//					mf_Composition.setDebt(Double.parseDouble(hs.getValue().toString()));
////					Timestamp timestamp = Timestamp.valueOf(hs.getValue().toString());
////					mf_Companies.setModified_ts(timestamp);
//				}
//
//				if (("asset_id").equals(hs.getKey())) {
//					mf_Fund_holding.setAsset_id(Long.parseLong(hs.getValue().toString()));
//				}
//				if (("percentage").equals(hs.getKey())) {
//					mf_Fund_holding.setPercentage(hs.getValue()==null?0:Double.parseDouble(hs.getValue().toString()));
//				}

//				if (("management_trustee").equals(hs.getKey())) {
//					mf_Amcs.setManagement_trustee(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("start_date").equals(hs.getKey())) {
//					Date of = Date.valueOf((String) hs.getValue());
//					mf_Amcs.setStart_date(of);
//					of = null;
//				}
//				if (("is_excluded").equals(hs.getKey())) {
//					mf_Amcs.setIs_excluded(hs.getValue().toString().equals("true") ? true : false);
//				}
//				if (("website").equals(hs.getKey())) {
//					mf_Amcs.setWebsite(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("address1").equals(hs.getKey())) {
//					mf_Amcs.setAddress1(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("address2").equals(hs.getKey())) {
//					mf_Amcs.setAddress2(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("address3").equals(hs.getKey())) {
//					mf_Amcs.setAddress3(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("city").equals(hs.getKey())) {
//					mf_Amcs.setCity(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("pin").equals(hs.getKey())) {
//					mf_Amcs.setPin(Integer.parseInt(hs.getValue().toString()));
//				}
//
//				if (("phone").equals(hs.getKey())) {
//					mf_Amcs.setPhone(hs.getValue() == null ? "" : hs.getValue().toString());
//				}
//				if (("fax").equals(hs.getKey())) {
//					mf_Amcs.setFax(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//
//				if (("email").equals(hs.getKey())) {
//					mf_Amcs.setEmail(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//
//				if (("modified_ts").equals(hs.getKey())) {
//					Timestamp timestamp = Timestamp.valueOf(hs.getValue().toString());
//					mf_Amcs.setModified_ts(timestamp);
//				}

				// System.out.println(hs.getKey() + " " + hs.getValue());

			}
			lstAmcs.add(mfholding);
			// System.out.println(mf_Fund_holding);
			System.out.println();
		}
		dao.saveAll(lstAmcs);
//		JSONObject jobj = new JSONObject(amcsservices.getamcsmf());
//		JsonNode jsonNode = new JsonMapper().readTree(result).get(0);
//		System.out.println(jsonNode);

		// JSONObject object1 = new JSONObject(result);
		// String str=object1.getJSONArray("data").toString();
		// JSONObject object2 = new JSONObject(str);
		// System.out.println(object2.get("amc_id"));
		// return ;
		// System.out.println();
		// ArrayList<JSONObject> obj=(ArrayList<JSONObject()>)parser.parse();
		return null;
	}
}
