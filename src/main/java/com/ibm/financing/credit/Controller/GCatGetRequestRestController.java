package com.ibm.financing.credit.Controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibm.financing.credit.persistence.bo.CreditRequestInfo;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



@RestController
public class GCatGetRequestRestController
{
	
	@Autowired
	private CreditRequestInfo creditRequestInfo;
	
	
   
	private static final Logger logger = LoggerFactory.getLogger(GCatGetRequestRestController.class);
	
	final String Rest_url = "http://9.204.133.13:8080/getRequestDataTemp?creditRequestIId=";
	final String ROOT_URI= "http://9.204.133.13:8080/insertRequestData";

	
	
	@RequestMapping(value="/getRequest")
	public JSONArray getData(@RequestParam("creditRequestIId") String creditRequestIId) throws JsonGenerationException,
			JsonMappingException, IOException {

		Client restClient = Client.create();
		String finalURL = Rest_url + creditRequestIId;
		WebResource webResource = restClient.resource(finalURL);
		ClientResponse resp = webResource.accept("application/json")
				.header("Authorization", "Basic ").post(ClientResponse.class);
		String output = resp.getEntity(String.class);

		JSONArray array = null;
		array = new JSONArray();

		try {
			array = (JSONArray) new JSONParser().parse(output);
			
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		return array;
	}
	
	
	
	
	@RequestMapping(value="/insertRequestData")
	public Object insertCreditRequestData(@RequestParam("LOB") String lob,
			 @RequestParam("reasonType") String reasonType,
			@RequestParam("dealerCode") String dealerCode) throws JsonGenerationException,
			JsonMappingException, IOException {
		
		creditRequestInfo.setLOB(lob);
		creditRequestInfo.setCreditRequestid("CR1234567");
		creditRequestInfo.setReasonType(reasonType);
		creditRequestInfo.setDealerCode(dealerCode);
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<CreditRequestInfo> creditRequest = restTemplate.postForEntity(ROOT_URI, creditRequestInfo,CreditRequestInfo.class);
		return creditRequest.getBody();
	
	}

//		Client restClient = Client.create();
//		
//		
//		
//		System.out.println(creditRequestInfo.toString());
//		WebResource webResource = restClient.resource(creditRequestInfo.toString());
//		ClientResponse resp = webResource.accept("application/json")
//				.header("Authorization", "Basic ").post(ClientResponse.class);
//		String output = resp.getEntity(String.class);
		
		
		
	
	/*
	 * public List<CreditRequestInfo> getAllPerson() {
	 * ResponseEntity<CreditRequestInfo[]> response =
	 * restTemplate.getForEntity(ROOT_URI, CreditRequestInfo[].class); return
	 * Arrays.asList(response.getBody());
	 * 
	 * }
	 * 
	 * public CreditRequestInfo getById(Long id) { ResponseEntity<CreditRequestInfo>
	 * response = restTemplate.getForEntity(ROOT_URI + "/"+id,
	 * CreditRequestInfo.class); return response.getBody(); }
	 * 
	 * public HttpStatus addCreditRequestDetalis(CreditRequestInfo
	 * creditRequestInfo) { ResponseEntity<HttpStatus> response =
	 * restTemplate.postForEntity(ROOT_URI, creditRequestInfo, HttpStatus.class);
	 * return response.getBody(); }
	 * 
	 * public void updatePerson(CreditRequestInfo creditRequestInfo) {
	 * restTemplate.put(ROOT_URI, creditRequestInfo); }
	 * 
	 * public void deletePerson(Long id) { restTemplate.delete(ROOT_URI + id);
	 * 
	 * }
	 */
	 
	

	
	
	

      
    
    
}