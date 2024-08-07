package com.locationapi.country.service;

import com.locationapi.country.dto.CountryRequestDto;
import com.locationapi.country.dto.CountryResponseDto;
import com.locationapi.country.entity.Country;
import com.locationapi.country.repository.CountryRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CountryServiceImpl {

    private final CountryRepository repository;
    private final CountryMapper mapper;
    private final ExcelConverter excelConverter;


    public CountryServiceImpl(
            CountryRepository repository,
            CountryMapper mapper,
            ExcelConverter excelConverter
    ) {
        this.repository = repository;
        this.mapper = mapper;
        this.excelConverter = excelConverter;
    }


    public CountryResponseDto saveCountry(CountryRequestDto dto) {
       Country savedCountry = repository.save(mapper.toCountry(dto));
       return mapper.toResponseDto(savedCountry);
    }



    public List<CountryResponseDto> saveAllCountry(MultipartFile files) throws IOException {

            List<Country> countryList = excelConverter.excelToCountryList(files);
            repository.saveAllAndFlush(countryList);
            return countryList.stream()
                    .map(mapper::toResponseDto)
                    .toList();

    }

    public List<CountryResponseDto> findAll(){
        return repository.findAll().stream()
                .map(mapper::toResponseDto)
                .toList();
    }

}
