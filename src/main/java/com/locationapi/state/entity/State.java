package com.locationapi.state.entity;


import com.locationapi.country.entity.Country;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "state_table")
public class State {

    @Id()
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stateId;

    @Column(name ="name")
    private String stateName;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}
