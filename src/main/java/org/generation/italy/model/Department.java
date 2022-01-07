package org.generation.italy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
	//identifico che sto per comunicare id con log (big int nel database)
	@Id
	//strategia per dire alla colonna che è un auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String name;
	private String address;
	private String phone;
	private String email;
	private String website;
	@Column(name="head_of_department")
	private String headOfDepartment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHead(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	
}
