package com.locationapi.country.controller;

import com.locationapi.country.dto.CountryRequestDto;
import com.locationapi.country.dto.CountryResponseDto;
import com.locationapi.country.service.CountryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private CountryServiceImpl countryService;

    @Autowired
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

    @PostMapping("/save-all-country")
    public List<CountryResponseDto> saveAllCountry(@RequestParam("file") MultipartFile files){
        try {
            return countryService.saveAllCountry(files);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
