package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String groupName ;
	private String groupType ;
	private String parentGroup ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getParentGroup() {
		return parentGroup;
	}
	public void setParentGroup(String parentGroup) {
		this.parentGroup = parentGroup;
	}
	

}
