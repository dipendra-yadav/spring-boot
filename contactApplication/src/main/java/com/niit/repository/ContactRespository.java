package com.niit.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.valves.JDBCAccessLogValve;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.niit.model.Contact;

@Repository
public class ContactRespository {

	private JdbcTemplate jdbcTemplate;

	public ContactRespository(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	// insert a contact
	public void saveContact(Contact contact) {

		jdbcTemplate.update(
				"insert into contacts" + "(id,firstName,lastName,phoneNumber,emailAddress)" + "values(?,?,?,?,?)",
				contact.getId(),contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber(), contact.getEmailAddress());

	}

	// Retrieve all Contacts
	public List<Contact> findAll() {

		
	
		return jdbcTemplate.query("select id,firstName,lastName,phoneNumber,emailAddress" + " from contacts",
			new RowMapper<Contact>() {

					public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {

						Contact contact = new Contact();
						contact.setId(rs.getInt(1));
						contact.setFirstName(rs.getString(2));
						contact.setLastName(rs.getString(3));
						contact.setPhoneNumber(rs.getString(4));
						contact.setEmailAddress(rs.getString(5));

						return contact;
					}

				}

		);

	}

}
