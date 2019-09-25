package com.ibm.financing.credit.persistence.model.stage;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the S_VALID_VALUE_DESC database table.
 * 
 */
@Embeddable
public class SValidValueDescPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="VALUE_ID", insertable=false, updatable=false)
	private int valueId;

	@Column(name="LOCALE_ID", insertable=false, updatable=false)
	private int localeId;

	public SValidValueDescPK() {
	}
	public int getValueId() {
		return this.valueId;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}
	public int getLocaleId() {
		return this.localeId;
	}
	public void setLocaleId(int localeId) {
		this.localeId = localeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SValidValueDescPK)) {
			return false;
		}
		SValidValueDescPK castOther = (SValidValueDescPK)other;
		return 
			(this.valueId == castOther.valueId)
			&& (this.localeId == castOther.localeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.valueId;
		hash = hash * prime + this.localeId;
		
		return hash;
	}
}