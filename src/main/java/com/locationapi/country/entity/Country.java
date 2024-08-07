package com.locationapi.country.entity;

import com.locationapi.state.entity.State;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "country_mst")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "c_code" )
    private String countryCode;

    @Column(name = "c_name",  unique = true)
    private String countryName;

    @Column(name = "c_std" )
    private String countryStd;

    private String capital;

    @OneToMany(mappedBy = "country")
    List<State> states;

    public Country(String countryCode, String countryName, String countryStd, String capital) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryStd = countryStd;
        this.capital = capital;
    }

}
