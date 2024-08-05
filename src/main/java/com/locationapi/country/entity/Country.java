package com.locationapi.country.entity;

import com.locationapi.country.dto.CountryRequestDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "country_mst")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "c_code" , nullable = false)
    private String countryCode;

    @Column(name = "c_name", nullable = false, unique = true)
    private String countryName;

    private String capital;


    public Country( String countryCode,String countryName, String capital){

        this.countryCode = countryCode;
        this.countryName = countryName;
        this.capital = capital;
    }
}
