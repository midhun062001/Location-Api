package com.locationapi.state.controller;


import com.locationapi.state.dto.StateRequestDto;
import com.locationapi.state.dto.StateResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class StateController {

    @PostMapping("/save-state")
    public List<StateResponseDto> saveAllState(MultipartFile file){

    }
}
