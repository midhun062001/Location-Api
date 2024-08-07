package com.locationapi.state.dto;

import com.locationapi.country.entity.Country;

public record StateRequestDto(
        String stateName,
        String stateCapital,
        Country country
) {
}
