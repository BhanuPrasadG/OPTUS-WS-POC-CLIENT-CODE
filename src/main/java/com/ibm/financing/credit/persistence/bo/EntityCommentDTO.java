package com.ibm.financing.credit.persistence.bo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@SuppressWarnings("serial")

public class EntityCommentDTO implements Serializable {

	private Integer entityId;
	private Integer commentId;
	private Integer scrValue;
	private Timestamp createTimestamp;
	private int lobId;
	private String countryCode;
	private String deleteFlg;
	private String updateUserId;
	private Timestamp updateTimestamp;
	private String text;
	private String credLineId;
	private String version;

	public EntityCommentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EntityCommentDTO(Integer entityId, String updateUserId, String text) {
		super();
		this.entityId = entityId;
		this.text = text;
		this.updateUserId = updateUserId;

	}
	
	public EntityCommentDTO(Integer entityId, String text) {
		super();
		this.entityId = entityId;
		this.text = text;

	}

	
	@Override
	public String toString() {
		return "EntityOrg [Entity ID= " + entityId + ", Comment Id=" + commentId + ", Text =" + text + "]";
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getScrValue() {
		return scrValue;
	}

	public void setScrValue(Integer scrValue) {
		this.scrValue = scrValue;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public int getLobId() {
		return lobId;
	}

	public void setLobId(int lobId) {
		this.lobId = lobId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCredLineId() {
		return credLineId;
	}

	public void setCredLineId(String credLineId) {
		this.credLineId = credLineId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
