package com.locationapi.state.service;

import com.locationapi.state.dto.StateRequestDto;
import com.locationapi.state.dto.StateResponseDto;
import com.locationapi.state.entity.State;

public class StateMapper {

    public State toState(StateRequestDto dto){
        return new State(
                dto.stateName(),
                dto.stateCapital(),
                dto.country()
        );
    }

    public StateResponseDto toResponseState(State state){
        return new StateResponseDto(
                state.getStateId(),
                state.getStateName(),
                state.getStateCapital(),
                state.getCountry()
        );
    }

}
