package com.locationapi.country.repository;

import com.locationapi.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
