package com.sardyka.guber.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taxt_company")
public class TaxiCompany {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String address;
	
	private Integer rate;

	public TaxiCompany(Long id, String name, String address, Integer rate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rate = rate;
	}

	public TaxiCompany() {
	}

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

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "TaxiCompany [id=" + id + ", name=" + name + ", address=" + address + ", rate=" + rate + "]";
	}

}
