package com.ibm.financing.credit.persistence.bo;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@SuppressWarnings("serial")

public class CustomerDTO implements Serializable {

	private Integer id;
	private String name;
	private String mpp;
	private String parent;

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(Integer id, String name, String mpp) {
		super();
		this.id = id;
		this.name = name;
		this.mpp = mpp;

	}

	@Override
	public String toString() {
		return "Entity Comment [  Id=" + id + ", name = " + name + ", mpp  ="
				+ mpp + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMpp() {
		return mpp;
	}

	public void setMpp(String mpp) {
		this.mpp = mpp;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

}
