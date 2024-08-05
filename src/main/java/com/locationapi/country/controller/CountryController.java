package com.locationapi.country.controller;

import com.locationapi.country.dto.CountryRequestDto;
import com.locationapi.country.dto.CountryResponseDto;
import com.locationapi.country.service.CountryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private CountryServiceImpl countryService;

    public CountryController(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }


    @PostMapping(path = "/save-country")
    public CountryResponseDto saveCountry(@RequestBody CountryRequestDto dto){
        return countryService.saveCountry(dto);
    }

    @GetMapping("/get-all")
    public List<CountryResponseDto> findAll(){
        return countryService.findAll();
    }

}
