package com.locationapi.state.dto;

import com.locationapi.country.entity.Country;

public record StateResponseDto (
        Integer stateId,
        String stateName,
        String stateCapital,
        Country country
){
}
