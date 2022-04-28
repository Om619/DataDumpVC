package com.vc.controller;

//@RestController
//public class MF_Fund_Controller {
//	@Autowired
//	private AmcsServices amcsservices;
//	@Autowired
//	private Dao dao;
//
//	@SuppressWarnings({ "unchecked", "static-access" })
//	@GetMapping("/mf_fund_categories")
//	public JsonNode getamcs() throws JsonMappingException, JsonProcessingException {
//		JsonMapper mapper = new JsonMapper();
//		String result = amcsservices.getamcsmf();
//		JsonNode obj = mapper.readTree(result);
//		JsonNode fields = obj.get("data");
//		List<MF_Fund_categories> lstAmcs = new ArrayList<MF_Fund_categories>();
//		for (int i = 0; i < fields.size(); i++) {
//			Map<String, Object> parser = new ObjectMapper().readValue(fields.get(i).toString(), LinkedHashMap.class);
//
//			MF_Fund_categories mf_fund_categories = new MF_Fund_categories();
//			for (Map.Entry<String, Object> hs : parser.entrySet()) {
//				if (("category_id").equals(hs.getKey())) {
//					mf_fund_categories.setCategory_id(Long.parseLong(hs.getValue().toString()));
//				}
//				if (("primary_category_name").equals(hs.getKey())) {
//					mf_fund_categories.setPrimary_category_name(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("category_name").equals(hs.getKey())) {
//					mf_fund_categories.setCategory_name(hs.getValue() == null ? "" : (String) hs.getValue());
//				}
//				if (("modified_ts").equals(hs.getKey())) {
//					Timestamp mod = Timestamp.valueOf(hs.getValue().toString());
//					mf_fund_categories.setModified_ts(mod);
//				}
//				if (("is_active").equals(hs.getKey())) {
//					mf_fund_categories.setIs_active(hs.getValue().toString().equals("true") ? true : false);
//				}
//
//			}
//			lstAmcs.add(mf_fund_categories);
//		}
//		dao.saveAll(lstAmcs);
//		return null;
//	}
//}
