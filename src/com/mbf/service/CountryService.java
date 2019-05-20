package com.mbf.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbf.model.Country;
import com.mbf.repository.CountryRepository;

@Service
public class CountryService {
	 
	 @Autowired
	 CountryRepository countryRepository;
	 
	 @Transactional
	 public List getAllCountries() {
	  List countries=new ArrayList();
	  Iterable countriesIterable=countryRepository.findAll();
	  Iterator countriesIterator=countriesIterable.iterator();
	  while(countriesIterator.hasNext())
	  {
	   countries.add(countriesIterator.next());
	  }
	  return countries;
	 }
	 @Transactional
	 public Country getCountry(int id) {
	  return countryRepository.findOne(id);
	 }
	 
	 @Transactional
	 public void addCountry(Country country) {
		 System.out.println("country name in service class "+country.getCountryName());
	  countryRepository.save(country);
	 }
	 @Transactional
	 public void updateCountry(Country country) {
	  countryRepository.save(country);
	 
	 }
	 
	 @Transactional
	 public void deleteCountry(int id) {
	  countryRepository.delete(id);
	 }

	
	 }

