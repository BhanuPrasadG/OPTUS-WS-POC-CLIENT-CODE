package com.ibm.financing.credit.persistence.model.stage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Credit_Request_Temp")
public class CreditRequestInfoBO {
	
	
	
	@Id
	@Column(name="creditRequestId")
	private String creditRequestid;
	@Column(name="reasonType")
	private String reasonType;
	@Column(name="dealerCode")
	private String dealerCode;
	@Column(name="Lob ")
	private String LOB;
	
	
	
	
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
