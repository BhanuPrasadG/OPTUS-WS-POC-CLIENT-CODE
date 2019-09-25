package com.ibm.financing.credit.persistence.model.stage;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the S_ENTITY_ORG database table.
 * 
 */
@Entity
@Table(name="S_ENTITY_ORG")
@NamedQuery(name="SEntityOrg.findAll", query="SELECT s FROM SEntityOrg s")
@NamedQuery(name="SEntityOrg.findAllToDTO", query="Select new com.ibm.financing.credit.persistence.bo.CustomerDTO(eo.entityId, eo.nameUppercase, eo.entityNum) From SEntityOrg eo")

public class SEntityOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENTITY_ID")
	private int entityId;

	@Column(name="ACTIVE_FLG")
	private String activeFlg;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="ENTITY_NUM")
	private String entityNum;

	@Column(name="HIERARCHY_CAT_ID")
	private int hierarchyCatId;

	@Column(name="LOCAL_NAME")
	private String localName;

	@Column(name="\"NAME\"")
	private String name;

	@Column(name="NAME_UPPERCASE")
	private String nameUppercase;

	@Column(name="\"SOURCE\"")
	private String source;

	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name="UPDATE_USERID")
	private String updateUserid;

	//bi-directional many-to-one association to SEntityOrg
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private SEntityOrg SEntityOrg;

	//bi-directional many-to-one association to SEntityOrg
	@OneToMany(mappedBy="SEntityOrg")
	private List<SEntityOrg> SEntityOrgs;

	//bi-directional many-to-one association to SValidValue
	@ManyToOne
	@JoinColumn(name="LEVEL_ID")
	private SValidValue SValidValue;

	public SEntityOrg() {
	}

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(String activeFlg) {
		this.activeFlg = activeFlg;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEntityNum() {
		return this.entityNum;
	}

	public void setEntityNum(String entityNum) {
		this.entityNum = entityNum;
	}

	public int getHierarchyCatId() {
		return this.hierarchyCatId;
	}

	public void setHierarchyCatId(int hierarchyCatId) {
		this.hierarchyCatId = hierarchyCatId;
	}

	public String getLocalName() {
		return this.localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameUppercase() {
		return this.nameUppercase;
	}

	public void setNameUppercase(String nameUppercase) {
		this.nameUppercase = nameUppercase;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
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

	public SEntityOrg getSEntityOrg() {
		return this.SEntityOrg;
	}

	public void setSEntityOrg(SEntityOrg SEntityOrg) {
		this.SEntityOrg = SEntityOrg;
	}

	public List<SEntityOrg> getSEntityOrgs() {
		return this.SEntityOrgs;
	}

	public void setSEntityOrgs(List<SEntityOrg> SEntityOrgs) {
		this.SEntityOrgs = SEntityOrgs;
	}

	public SEntityOrg addSEntityOrg(SEntityOrg SEntityOrg) {
		getSEntityOrgs().add(SEntityOrg);
		SEntityOrg.setSEntityOrg(this);

		return SEntityOrg;
	}

	public SEntityOrg removeSEntityOrg(SEntityOrg SEntityOrg) {
		getSEntityOrgs().remove(SEntityOrg);
		SEntityOrg.setSEntityOrg(null);

		return SEntityOrg;
	}

	public SValidValue getSValidValue() {
		return this.SValidValue;
	}

	public void setSValidValue(SValidValue SValidValue) {
		this.SValidValue = SValidValue;
	}

}