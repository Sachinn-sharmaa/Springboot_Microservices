package com.contact_microservice.Service;

import java.util.List;

import com.contact_microservice.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactofUser(Long userId);
}
