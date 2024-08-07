package com.locationapi.country.dto;

import jakarta.persistence.Column;

public record CountryResponseDto(
        Integer id,
        String countryCode,
        String countryName,
        String countryStd,
        String capital
) {
}
