package com.ibm.financing.credit.persistence.model.stage;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="CREDIT_REQUEST")
@NamedQuery(name="CreditRequestEntity.findAll", query="SELECT c FROM CreditRequestEntity c Where CRED_REQ_ID = ?1")

public class CreditRequestEntity implements Serializable {
	
	@Id
	@Column(name="CRED_REQ_ID")
	private String createRequestId;
	
	@Column(name="VERSION")
    private Integer version;
	
	@Column(name="ENTITY_ID")
	private Integer entityId;
	
	@Column(name="LOB_ID")
	private Integer lobId;
	
	@Column(name="CRED_REQ_TYPE_ID")
	private Integer creditRequestTypeId;
	
	@Column(name="CURRENCY_ID")
	private Integer currencyId ;
	
	@Column(name="TRANS_NUM")
	private String transNumber;
	
	@Column(name="CREDIT_PGM")
	private String creditPGM;
	
	
	@Column(name="BUSINESS_UNIT_ID")
	private Integer busineesUnitId;
	
	
	@Column(name="BUS_PART_NUM")
	private String busPartNum;
	
	@Column(name="BUS_PART_NAME")
	private String busPartName;
	
	@Column(name="BUS_PART_AMT")
	private Float busPartAmt;
	
	@Column(name="BUS_PART_APP_FLG")
	private String busPartAppFlag;
	
	@Column(name="PROMO_ID")
	private Integer promoId;
	
	@Column(name="CONTRACT_TERM")
	private Integer contractTerm;
	
	@Column(name="SUBMITTED_TS")
	private Date submmitedTs;
	
	@Column(name="CRED_LINE_ID")
	private String creditLineId;
	
	@Column(name="CRED_LINE_VERS")
	private Integer creditLineVersion;
	
	@Column(name="RATE_ID")
	private Integer rateId;
	
	@Column(name="EXPIRATION_TS")
	private Date expirationTs;
	
	
	@Column(name="STATUS_ID")
	private Integer statusId;
	
	@Column(name="ACCEPTANCE_ID")
	private String acceptanceId;
	
	@Column(name="OVERDRAFT_FLG")
	private String overDraftFlag;
	
	@Column(name="NCR_ID")
	private Integer ncrId;
	
	@Column(name="ASSIGNEE")
	private String assignee;
	
	@Column(name="XCHG_RATE")
	private Float xchangRtae;
	
	@Column(name="LOCALE_CODE")
	private String localCode;
	
	@Column(name="UPDATE_USERID")
	private String updateUserId;
	
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimeStamp;
	
	@Column(name="REPOST_FLG")
	private String repostFlag;
	
	@Column(name="FULFILLMENT_TS")
	private Date fullFillmentTs;
	
	@Column(name="CUST_REF")
	private String custRef; 
	
	@Column(name="CONFIDENTIAL_FLG")
	private String confidentialFlag;
	
	@Column(name="AMOUNT")
	private Float amount;
	
	@Column(name="REG_ID")
	private Integer regId;
	
	@Column(name="SRC_VALUE_ID")
	private Integer srcValueId;
	
	
	@Column(name="REQ_REF_NUM")
	private String reqRefNumber;
	
	
	@Column(name="EXTERNAL_ID")
	private Integer externalId;
	
	@Column(name="EXT_IDENTIFIER")
	private String externalIdentifer;
	
	@Column(name="ROUTING_ROLE")
	private String routingRole;
	
	@Column(name="COUNTRY_CODE")
	private String counrtyCode;
	
	@Column(name="LATEST_VERS_FLG")
	private String latestVerseFlag;
	
	@Column(name="REPLY_TO_QUEUE")
	private String replyToQueue;
	
	@Column(name="WITHDRAW_TS")
	private Date withdrawTs;
	
	@Column(name="ROUTED_BY")
	private String routedBy;
	
	@Column(name="TRANS_TYPE_ID")
	private Integer transTypeId;
	
	@Column(name="IBM_SUBSIDIARY_ID")
	private Integer ibmSubsidiryId;
	
	@Column(name="DEAL_LOCK_FLG")
	private String dealLockFlog;
	
	@Column(name="INITIAL_APPROVE_TS")
	private Date initialapprovedTs;
	
	@Column(name="PROJECT")
	private String project;
	
	@Column(name="LOCAL_RATING")
	private String localReting;
	
	@Column(name="ONE_STEP_FLG")
	private String oneStepFlag;
	
	@Column(name="LOB_CONTENT_ID")
	private Integer lobContentId;
	
	@Column(name="FINANCIER_TYPE_ID")
	private String financiarTypeId;
	
	@Column(name="DEALER_CODE")
	private String dealerCode;
	
	@Column(name="COF_LINE_REASON_TYPE_ID")
	private String cofLineReasonTypeID;
	
	@Column(name="PROPOSED_INC_AMT")
	private String proposedIncAmount;
	
	@Column(name="LEGAL_ENTITY_ID")
	private String legalEntityId;  
	
	@Column(name="QUOTE_REFERENCE_ID")
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
