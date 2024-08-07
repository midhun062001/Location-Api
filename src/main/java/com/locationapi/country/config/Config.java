package com.locationapi.country.config;
import com.locationapi.country.entity.Country;
import com.locationapi.country.service.CountryMapper;
import com.locationapi.country.service.CountryServiceImpl;
import com.locationapi.country.service.ExcelConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CountryMapper countryMapper(){
        return new CountryMapper();
    }



    @Bean
    public ExcelConverter converter(){
        return new ExcelConverter();
    }
}
