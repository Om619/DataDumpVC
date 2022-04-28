package com.vc.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AmcsServices {

	private RestTemplate restTemplate;
	public String getamcsmf()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.add("API_KEY", "d0f1269986b18419cb5865f6191d946ac01d267e");
		//HttpEntity<MF_Amcs> entity=new HttpEntity<>(panSeeding,headers);
		restTemplate=new RestTemplate();
//		HttpEntity<String> objEntity=new HttpEntity<String>(headers);
		String url = "http://api.vro.in/v1/fund_dividends?output=data&changed-after=2022-04-28-00-00";
//        Map<String,String> paramsMap=new HashMap<String ,String>();
//        paramsMap.put("output","data");
//        paramsMap.put("changed-after","2021-05-25-00-00");
		HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
//		ResponseEntity<MF_Data> response = restTemplate.getForObject(url,requestEntity,MF_Data.class);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity,String.class);
		//MF_Amcs responseEntity = restTemplate.getForObject(url,objEntity,MF_Amcs.class);
		//JSONObject object1 = new JSONObject(response);
		System.out.println(response.getBody().toString());
		return response.getBody().toString();
//		Map<String, String> objMap = new HashMap<String, String>();
//		
//		objMap.put( "requestData", responseEntity);
	}
}
