package com.vc.controller;

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
import com.vc.models.MF_Credit_rating_score;
import com.vc.models.MF_Fund_categories;
import com.vc.services.AmcsServices;

//@RestController
//public class MF_Credit_rating_Controller {
//	@Autowired
//	private AmcsServices amcsservices;
//	@Autowired
//	private Dao dao;
//
//	@SuppressWarnings({ "unchecked", "static-access" })
//	@GetMapping("/mf_credit_rating_score")
//	public JsonNode getamcs() throws JsonMappingException, JsonProcessingException {
//		JsonMapper mapper = new JsonMapper();
//		String result = amcsservices.getamcsmf();
//		JsonNode obj = mapper.readTree(result);
//		JsonNode fields = obj.get("data");
//		List<MF_Credit_rating_score> lstAmcs = new ArrayList<MF_Credit_rating_score>();
//		for (int i = 0; i < fields.size(); i++) {
//			Map<String, Object> parser = new ObjectMapper().readValue(fields.get(i).toString(), LinkedHashMap.class);
//
//			MF_Credit_rating_score mf_credit_rating_score = new MF_Credit_rating_score();
//			for (Map.Entry<String, Object> hs : parser.entrySet()) {
//				if (("rating_id").equals(hs.getKey())) {
//					mf_credit_rating_score.setRating_id(Integer.parseInt(hs.getValue().toString()));
//				}
//				if (("rating").equals(hs.getKey())) {
//					mf_credit_rating_score.setRating(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("modified_ts").equals(hs.getKey())) {
//					Timestamp mod = Timestamp.valueOf(hs.getValue().toString());
//					mf_credit_rating_score.setModified_ts(mod);
//				}
//	
//
//			}
//			lstAmcs.add(mf_credit_rating_score);
//		}
//		dao.saveAll(lstAmcs);
//		return null;
//	}
//}
