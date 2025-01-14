package com.contact_microservice.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact_microservice.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService{
	
	//fake List of Contacts 
	
	List<Contact> list = List.of(new Contact(1L, "Amit", "amit@gmail.com", 1311L),
			new Contact(2L, "Anil", "anil@gmail.com", 1312L),
			new Contact(3L, "ravi", "ravi@gmail.com", 1313L),
			new Contact(4L, "mukul", "mukul@gmail.com", 1311L));

	@Override
	public List<Contact> getContactofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
	
	
}
