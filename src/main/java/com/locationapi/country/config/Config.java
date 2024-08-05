package com.locationapi.country.config;
import com.locationapi.country.service.CountryMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CountryMapper country(){
        return new CountryMapper();
    }
}
