package com.mbf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mbf.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
