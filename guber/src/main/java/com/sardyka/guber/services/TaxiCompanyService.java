package com.sardyka.guber.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sardyka.guber.beans.TaxiCompany;

public interface TaxiCompanyService extends CrudRepository<TaxiCompany, Long>{

	List<TaxiCompany> findByName(String string);

}
