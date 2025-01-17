package com.contact_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact_microservice.Service.ContactService;
import com.contact_microservice.entity.Contact;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		return this.contactService.getContactofUser(userId);
	}
}
