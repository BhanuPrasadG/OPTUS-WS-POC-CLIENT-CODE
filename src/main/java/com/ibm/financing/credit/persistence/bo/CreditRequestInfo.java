package com.ibm.financing.credit.persistence.bo;

import org.springframework.stereotype.Component;

@Component
public class CreditRequestInfo {
	
	
	private String LOB;
	private String reasonType;
	private String dealerCode;
	private String creditRequestid;	
	
	
	
	
	public String getCreditRequestid() {
		return creditRequestid;
	}
	public void setCreditRequestid(String creditRequestid) {
		this.creditRequestid = creditRequestid;
	}
	public String getLOB() {
		return LOB;
	}
	public void setLOB(String lOB) {
		LOB = lOB;
	}
	
	public String getReasonType() {
		return reasonType;
	}
	public void setReasonType(String reasonType) {
		this.reasonType = reasonType;
	}
	public String getDealerCode() {
		return dealerCode;
	}
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}
	
}
