package com.contact_microservice.entity;

public class Contact {
	private Long cId;
	private String contactname;
	private String contactemail;
	private Long userId;
	
	public Contact(Long cId, String contactname, String contactemail, Long userId) {
		super();
		this.cId = cId;
		this.contactname = contactname;
		this.contactemail = contactemail;
		this.userId = userId;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getContactemail() {
		return contactemail;
	}
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}