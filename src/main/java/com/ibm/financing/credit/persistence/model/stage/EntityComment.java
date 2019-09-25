package com.ibm.financing.credit.persistence.model.stage;

import java.io.Serializable;
import javax.persistence.*;

import com.ibm.financing.credit.persistence.bo.EntityCommentDTO;

import java.sql.Timestamp;


/**
 * The persistent class for the ENTITY_COMMENT database table.
 * 
 */
@Entity
@Table(name = "ENTITY_COMMENT")
@NamedQuery(name = "EntityComment.findAll", query = "SELECT c FROM EntityComment c")



@NamedQuery(name="EntityComment.findAllToDTO", query="Select new com.ibm.financing.credit.persistence.bo.EntityCommentDTO(c.entityId, c.text, c.updateUserId) From EntityComment c")
/*
 * @NamedQuery(name="EntityComment.findAllForEntity",
 * query="SELECT c FROM EntityComment c Where ENTITY_ID = ?")
 */


@NamedNativeQuery(
	    name = "EntityComment.find",
	    query =
	        "SELECT " +
	        "       p.ENTITY_ID AS ENTITY_ID, " +
	        "       p.TEXT AS TEXT " +
	        "FROM ENTITY_COMMENT p " +
	        "WHERE p.ENTITY_ID = ? ",
	    resultSetMapping = "PostDTO"
	)
	@SqlResultSetMapping(
	    name = "PostDTO",
	    classes = @ConstructorResult(
	        targetClass = EntityCommentDTO.class,
	        columns = {
	            @ColumnResult(name = "ENTITY_ID"),
	            @ColumnResult(name = "TEXT")
	        }
	    )
	)


public class EntityComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Entity Comment [ Comment Id=" + commentId + ", Entity ID= " + entityId + ", Updated User Id  =" + updateUserId +", Text =" + text + "]";
	}
	
	@Id
	@Column(name = "ENTITY_ID")
	private int entityId;

	@Column(name = "COMMENT_ID")
	private int commentId;

	@Column(name = "SRC_VALUE_ID")
	private int srcValueId;

	@Column(name = "CREATE_TIMESTAMP")
	private Timestamp createTimestamp;

	@Column(name = "LOB_ID")
	private int lobId;

	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@Column(name = "DELETE_FLG")
	private String deleteFlg;

	@Column(name = "UPDATE_USERID")
	private String updateUserId;

	@Column(name = "UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name = "TEXT")
	private String text;

	@Column(name = "CRED_LINE_ID")
	private String credLineId;

	@Column(name = "VERSION")
	private String version;



	public EntityComment() {
	}

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getSrcValueId() {
		return srcValueId;
	}

	public void setSrcValueId(int srcValueId) {
		this.srcValueId = srcValueId;
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
