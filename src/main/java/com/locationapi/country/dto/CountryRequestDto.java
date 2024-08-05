package com.locationapi.country.dto;


import jakarta.persistence.Column;

public record CountryRequestDto(
        String countryCode,
        String countryName,
        String capital
) {
}
