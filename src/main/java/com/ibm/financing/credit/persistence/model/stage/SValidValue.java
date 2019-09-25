package com.ibm.financing.credit.persistence.model.stage;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the S_VALID_VALUE database table.
 * 
 */
@Entity
@Table(name="S_VALID_VALUE")
@NamedQuery(name="SValidValue.findAll", query="SELECT s FROM SValidValue s")
public class SValidValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VALUE_ID")
	private int valueId;

	@Column(name="ACTIVE_FLG")
	private String activeFlg;

	@Column(name="GLOBAL_FLG")
	private String globalFlg;

	@Column(name="GROUP_NAME")
	private String groupName;

	private String mnemonic;

	@Column(name="RPT_NAME")
	private String rptName;

	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name="UPDATE_USERID")
	private String updateUserid;

	//bi-directional many-to-one association to SEntityOrg
	@OneToMany(mappedBy="SValidValue")
	private List<SEntityOrg> SEntityOrgs;

	//bi-directional many-to-one association to SValidValueDesc
	@OneToMany(mappedBy="SValidValue1")
	private List<SValidValueDesc> SValidValueDescs1;

	//bi-directional many-to-one association to SValidValueDesc
	@OneToMany(mappedBy="SValidValue2")
	private List<SValidValueDesc> SValidValueDescs2;

	public SValidValue() {
	}

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public String getActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(String activeFlg) {
		this.activeFlg = activeFlg;
	}

	public String getGlobalFlg() {
		return this.globalFlg;
	}

	public void setGlobalFlg(String globalFlg) {
		this.globalFlg = globalFlg;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMnemonic() {
		return this.mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getRptName() {
		return this.rptName;
	}

	public void setRptName(String rptName) {
		this.rptName = rptName;
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

	public List<SEntityOrg> getSEntityOrgs() {
		return this.SEntityOrgs;
	}

	public void setSEntityOrgs(List<SEntityOrg> SEntityOrgs) {
		this.SEntityOrgs = SEntityOrgs;
	}

	public SEntityOrg addSEntityOrg(SEntityOrg SEntityOrg) {
		getSEntityOrgs().add(SEntityOrg);
		SEntityOrg.setSValidValue(this);

		return SEntityOrg;
	}

	public SEntityOrg removeSEntityOrg(SEntityOrg SEntityOrg) {
		getSEntityOrgs().remove(SEntityOrg);
		SEntityOrg.setSValidValue(null);

		return SEntityOrg;
	}

	public List<SValidValueDesc> getSValidValueDescs1() {
		return this.SValidValueDescs1;
	}

	public void setSValidValueDescs1(List<SValidValueDesc> SValidValueDescs1) {
		this.SValidValueDescs1 = SValidValueDescs1;
	}

	public SValidValueDesc addSValidValueDescs1(SValidValueDesc SValidValueDescs1) {
		getSValidValueDescs1().add(SValidValueDescs1);
		SValidValueDescs1.setSValidValue1(this);

		return SValidValueDescs1;
	}

	public SValidValueDesc removeSValidValueDescs1(SValidValueDesc SValidValueDescs1) {
		getSValidValueDescs1().remove(SValidValueDescs1);
		SValidValueDescs1.setSValidValue1(null);

		return SValidValueDescs1;
	}

	public List<SValidValueDesc> getSValidValueDescs2() {
		return this.SValidValueDescs2;
	}

	public void setSValidValueDescs2(List<SValidValueDesc> SValidValueDescs2) {
		this.SValidValueDescs2 = SValidValueDescs2;
	}

	public SValidValueDesc addSValidValueDescs2(SValidValueDesc SValidValueDescs2) {
		getSValidValueDescs2().add(SValidValueDescs2);
		SValidValueDescs2.setSValidValue2(this);

		return SValidValueDescs2;
	}

	public SValidValueDesc removeSValidValueDescs2(SValidValueDesc SValidValueDescs2) {
		getSValidValueDescs2().remove(SValidValueDescs2);
		SValidValueDescs2.setSValidValue2(null);

		return SValidValueDescs2;
	}

}