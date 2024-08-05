package com.locationapi.country.service;

import com.locationapi.country.dto.CountryRequestDto;
import com.locationapi.country.dto.CountryResponseDto;
import com.locationapi.country.entity.Country;
import com.locationapi.country.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl {

    private CountryRepository repository;
    private CountryMapper mapper;

    public CountryServiceImpl(
            CountryRepository repository,
            CountryMapper mapper
    ) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CountryResponseDto saveCountry(CountryRequestDto dto) {
       Country savedCountry = repository.save(mapper.toCountry(dto));
       return mapper.toResponseDto(savedCountry);
    }

    public List<CountryResponseDto> findAll(){
        return repository.findAll().stream()
                .map(mapper::toResponseDto)
                .toList();
    }

}
