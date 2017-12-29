package com.niit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Contact;
import com.niit.repository.ContactRespository;

@Controller
public class ContactController {

	private ContactRespository contactRep;

	@Autowired
	public ContactController(ContactRespository contactRep) {
		this.contactRep = contactRep;

	}

	@RequestMapping(value = "/home")
	public String getHome() {
		return "home";
	}

	@RequestMapping(value = "/saveContact", method = RequestMethod.POST)
	public String saveContact(Contact contact) {

		contactRep.saveContact(contact);
		return "redirect:/getAllcontacts";
	}

	@RequestMapping(value = "/getAllcontacts", method = RequestMethod.GET)
	public String getAllContacts(Map<String, Object> model) {

		List<Contact> contacts = contactRep.findAll();
		model.put("contacts", contacts);

		return "home";
	}

}
