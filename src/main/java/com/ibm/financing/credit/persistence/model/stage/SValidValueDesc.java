package com.ibm.financing.credit.persistence.model.stage;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


/**
 * The persistent class for the S_VALID_VALUE_DESC database table.
 * 
 */
@Entity
@Table(name="S_VALID_VALUE_DESC")
@NamedQuery(name="SValidValueDesc.findAll", query="SELECT s FROM SValidValueDesc s")
public class SValidValueDesc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SValidValueDescPK id;

	private String description;

	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name="UPDATE_USERID")
	private String updateUserid;

	//bi-directional many-to-one association to SValidValue
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="LOCALE_ID" ,insertable = false, updatable = false)
	private SValidValue SValidValue1;

	//bi-directional many-to-one association to SValidValue
	@ManyToOne
	
	@JoinColumn(name="VALUE_ID",insertable = false, updatable = false)
	private SValidValue SValidValue2;

	public SValidValueDesc() {
	}

	public SValidValueDescPK getId() {
		return this.id;
	}

	public void setId(SValidValueDescPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUpdateUserid() {
		return this.updateUserid;
	}

	public void setUpdateUserid(String updateUserid) {
		this.updateUserid = updateUserid;
	}

	public SValidValue getSValidValue1() {
		return this.SValidValue1;
	}

	public void setSValidValue1(SValidValue SValidValue1) {
		this.SValidValue1 = SValidValue1;
	}

	public SValidValue getSValidValue2() {
		return this.SValidValue2;
	}

	public void setSValidValue2(SValidValue SValidValue2) {
		this.SValidValue2 = SValidValue2;
	}

}