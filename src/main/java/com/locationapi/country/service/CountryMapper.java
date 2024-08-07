package com.locationapi.country.service;

import com.locationapi.country.dto.CountryRequestDto;
import com.locationapi.country.dto.CountryResponseDto;
import com.locationapi.country.entity.Country;


public class CountryMapper {

    public Country toCountry(CountryRequestDto dto){
        return new Country(
                dto.countryCode(),
                dto.countryName(),
                dto.countryStd(),
                dto.capital()
        );
    }

    public CountryResponseDto toResponseDto(Country country){
        return new CountryResponseDto(
                country.getId(),
                country.getCountryCode(),
                country.getCountryName(),
                country.getCountryStd(),
                country.getCapital()
        );
    }

}
