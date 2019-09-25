package com.ibm.financing.credit.persistence.bo;

import java.io.Serializable;
import java.sql.Date;

public class CreditRequestBO implements Serializable {
	
	private String createRequestId;
    private Integer version;
	
	private Integer entityId;
	private Integer lobId;
	private Integer creditRequestTypeId;
	private Integer currencyId ;
	
	private String transNumber;
	
	private String creditPGM;
	
	private Integer busineesUnitId;
	
	private String busPartNum;
	private String busPartName;
	
	private Float busPartAmt;
	
	private String busPartAppFlag;
	private Integer promoId;
	
	private Integer contractTerm;
	private Date submmitedTs;
	
	private String creditLineId;
	private Integer creditLineVersion;
	
	private Integer rateId;
	private Date expirationTs;
	
	private Integer statusId;
	private String acceptanceId;
	private String overDraftFlag;
	private Integer ncrId;
	private String assignee;
	private Float xchangRtae;
	private String localCode;
	private String updateUserId;
	private Date updateTimeStamp;
	private String repostFlag;
	private Date fullFillmentTs;
	private String custRef; 
	private String confidentialFlag;
	private Float amount;
	private Integer regId;
	private Integer srcValueId;
	
	private String reqRefNumber;
	
	private Integer externalId;
	
	private String externalIdentifer;
	
	private String routingRole;
	private String counrtyCode;
	private String latestVerseFlag;
	private String replyToQueue;
	private Date withdrawTs;
	private String routedBy;
	private Integer transTypeId;
	private Integer ibmSubsidiryId;
	private String dealLockFlog;
	private Date initialapprovedTs;
	private String project;
	private String localReting;
	private String oneStepFlag;
	private Integer lobContentId;
	private String financiarTypeId;
	private String dealerCode;
	private String cofLineReasonTypeID;
	private String proposedIncAmount;
	private String legalEntityId;  
	private String quoteReferenceId;
	
	public String getCreateRequestId() {
		return createRequestId;
	}
	public void setCreateRequestId(String createRequestId) {
		this.createRequestId = createRequestId;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	public Integer getLobId() {
		return lobId;
	}
	public void setLobId(Integer lobId) {
		this.lobId = lobId;
	}
	public Integer getCreditRequestTypeId() {
		return creditRequestTypeId;
	}
	public void setCreditRequestTypeId(Integer creditRequestTypeId) {
		this.creditRequestTypeId = creditRequestTypeId;
	}
	public Integer getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	public String getTransNumber() {
		return transNumber;
	}
	public void setTransNumber(String transNumber) {
		this.transNumber = transNumber;
	}
	public String getCreditPGM() {
		return creditPGM;
	}
	public void setCreditPGM(String creditPGM) {
		this.creditPGM = creditPGM;
	}
	public Integer getBusineesUnitId() {
		return busineesUnitId;
	}
	public void setBusineesUnitId(Integer busineesUnitId) {
		this.busineesUnitId = busineesUnitId;
	}
	public String getBusPartNum() {
		return busPartNum;
	}
	public void setBusPartNum(String busPartNum) {
		this.busPartNum = busPartNum;
	}
	public String getBusPartName() {
		return busPartName;
	}
	public void setBusPartName(String busPartName) {
		this.busPartName = busPartName;
	}
	public Float getBusPartAmt() {
		return busPartAmt;
	}
	public void setBusPartAmt(Float busPartAmt) {
		this.busPartAmt = busPartAmt;
	}
	public String getBusPartAppFlag() {
		return busPartAppFlag;
	}
	public void setBusPartAppFlag(String busPartAppFlag) {
		this.busPartAppFlag = busPartAppFlag;
	}
	public Integer getPromoId() {
		return promoId;
	}
	public void setPromoId(Integer promoId) {
		this.promoId = promoId;
	}
	public Integer getContractTerm() {
		return contractTerm;
	}
	public void setContractTerm(Integer contractTerm) {
		this.contractTerm = contractTerm;
	}
	public Date getSubmmitedTs() {
		return submmitedTs;
	}
	public void setSubmmitedTs(Date submmitedTs) {
		this.submmitedTs = submmitedTs;
	}
	public String getCreditLineId() {
		return creditLineId;
	}
	public void setCreditLineId(String creditLineId) {
		this.creditLineId = creditLineId;
	}
	public Integer getCreditLineVersion() {
		return creditLineVersion;
	}
	public void setCreditLineVersion(Integer creditLineVersion) {
		this.creditLineVersion = creditLineVersion;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public Date getExpirationTs() {
		return expirationTs;
	}
	public void setExpirationTs(Date expirationTs) {
		this.expirationTs = expirationTs;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getAcceptanceId() {
		return acceptanceId;
	}
	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId;
	}
	public String getOverDraftFlag() {
		return overDraftFlag;
	}
	public void setOverDraftFlag(String overDraftFlag) {
		this.overDraftFlag = overDraftFlag;
	}
	public Integer getNcrId() {
		return ncrId;
	}
	public void setNcrId(Integer ncrId) {
		this.ncrId = ncrId;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public Float getXchangRtae() {
		return xchangRtae;
	}
	public void setXchangRtae(Float xchangRtae) {
		this.xchangRtae = xchangRtae;
	}
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}
	public String getRepostFlag() {
		return repostFlag;
	}
	public void setRepostFlag(String repostFlag) {
		this.repostFlag = repostFlag;
	}
	public Date getFullFillmentTs() {
		return fullFillmentTs;
	}
	public void setFullFillmentTs(Date fullFillmentTs) {
		this.fullFillmentTs = fullFillmentTs;
	}
	public String getCustRef() {
		return custRef;
	}
	public void setCustRef(String custRef) {
		this.custRef = custRef;
	}
	public String getConfidentialFlag() {
		return confidentialFlag;
	}
	public void setConfidentialFlag(String confidentialFlag) {
		this.confidentialFlag = confidentialFlag;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getRegId() {
		return regId;
	}
	public void setRegId(Integer regId) {
		this.regId = regId;
	}
	public Integer getSrcValueId() {
		return srcValueId;
	}
	public void setSrcValueId(Integer srcValueId) {
		this.srcValueId = srcValueId;
	}
	public String getReqRefNumber() {
		return reqRefNumber;
	}
	public void setReqRefNumber(String reqRefNumber) {
		this.reqRefNumber = reqRefNumber;
	}
	public Integer getExternalId() {
		return externalId;
	}
	public void setExternalId(Integer externalId) {
		this.externalId = externalId;
	}
	public String getExternalIdentifer() {
		return externalIdentifer;
	}
	public void setExternalIdentifer(String externalIdentifer) {
		this.externalIdentifer = externalIdentifer;
	}
	public String getRoutingRole() {
		return routingRole;
	}
	public void setRoutingRole(String routingRole) {
		this.routingRole = routingRole;
	}
	public String getCounrtyCode() {
		return counrtyCode;
	}
	public void setCounrtyCode(String counrtyCode) {
		this.counrtyCode = counrtyCode;
	}
	public String getLatestVerseFlag() {
		return latestVerseFlag;
	}
	public void setLatestVerseFlag(String latestVerseFlag) {
		this.latestVerseFlag = latestVerseFlag;
	}
	public String getReplyToQueue() {
		return replyToQueue;
	}
	public void setReplyToQueue(String replyToQueue) {
		this.replyToQueue = replyToQueue;
	}
	public Date getWithdrawTs() {
		return withdrawTs;
	}
	public void setWithdrawTs(Date withdrawTs) {
		this.withdrawTs = withdrawTs;
	}
	public String getRoutedBy() {
		return routedBy;
	}
	public void setRoutedBy(String routedBy) {
		this.routedBy = routedBy;
	}
	public Integer getTransTypeId() {
		return transTypeId;
	}
	public void setTransTypeId(Integer transTypeId) {
		this.transTypeId = transTypeId;
	}
	public Integer getIbmSubsidiryId() {
		return ibmSubsidiryId;
	}
	public void setIbmSubsidiryId(Integer ibmSubsidiryId) {
		this.ibmSubsidiryId = ibmSubsidiryId;
	}
	public String getDealLockFlog() {
		return dealLockFlog;
	}
	public void setDealLockFlog(String dealLockFlog) {
		this.dealLockFlog = dealLockFlog;
	}
	public Date getInitialapprovedTs() {
		return initialapprovedTs;
	}
	public void setInitialapprovedTs(Date initialapprovedTs) {
		this.initialapprovedTs = initialapprovedTs;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getLocalReting() {
		return localReting;
	}
	public void setLocalReting(String localReting) {
		this.localReting = localReting;
	}
	public String getOneStepFlag() {
		return oneStepFlag;
	}
	public void setOneStepFlag(String oneStepFlag) {
		this.oneStepFlag = oneStepFlag;
	}
	public Integer getLobContentId() {
		return lobContentId;
	}
	public void setLobContentId(Integer lobContentId) {
		this.lobContentId = lobContentId;
	}
	public String getFinanciarTypeId() {
		return financiarTypeId;
	}
	public void setFinanciarTypeId(String financiarTypeId) {
		this.financiarTypeId = financiarTypeId;
	}
	public String getDealerCode() {
		return dealerCode;
	}
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}
	public String getCofLineReasonTypeID() {
		return cofLineReasonTypeID;
	}
	public void setCofLineReasonTypeID(String cofLineReasonTypeID) {
		this.cofLineReasonTypeID = cofLineReasonTypeID;
	}
	public String getProposedIncAmount() {
		return proposedIncAmount;
	}
	public void setProposedIncAmount(String proposedIncAmount) {
		this.proposedIncAmount = proposedIncAmount;
	}
	public String getLegalEntityId() {
		return legalEntityId;
	}
	public void setLegalEntityId(String legalEntityId) {
		this.legalEntityId = legalEntityId;
	}
	public String getQuoteReferenceId() {
		return quoteReferenceId;
	}
	public void setQuoteReferenceId(String quoteReferenceId) {
		this.quoteReferenceId = quoteReferenceId;
	}
	

}
