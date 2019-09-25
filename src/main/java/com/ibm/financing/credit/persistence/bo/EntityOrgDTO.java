package com.ibm.financing.credit.persistence.bo;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@SuppressWarnings("serial")

public class EntityOrgDTO implements Serializable{
	
	private int id_entity;
	private String name;
	private int level;
	private int id_parent;
	private EntityOrgDTO parent;
	
	
	
	
	public EntityOrgDTO(int id_entity, String name, int id_parent, int level) {
		super();
		this.id_entity = id_entity;
		this.name = name;
		this.level = level;
		this.id_parent = id_parent;
	}
	
	public EntityOrgDTO(int id_entity, String name, int level) {
		super();
		this.id_entity = id_entity;
		this.name = name;
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "EntityOrg [id_entity=" + id_entity + ", name=" + name + ", level=" + level + ", id_parent=" + id_parent
				+ ", parent=" + (parent!=null? parent.id_entity:null) + "]";
	}

	public EntityOrgDTO getParent() {
		return parent;
	}
	public void setParent(EntityOrgDTO parent) {
		this.parent = parent;
	}
	public int getId_entity() {
		return id_entity;
	}
	public void setId_entity(int id_entity) {
		this.id_entity = id_entity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getId_parent() {
		return id_parent;
	}
	public void setId_parent(int id_parent) {
		this.id_parent = id_parent;
	}
	
	
	

}
