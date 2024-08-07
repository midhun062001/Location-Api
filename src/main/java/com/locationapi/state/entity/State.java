package com.locationapi.state.entity;


import com.locationapi.country.entity.Country;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "state_table")
public class State {

    @Id()
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stateId;

    @Column(name ="name")
    private String stateName;

    @Column(name = "capital")
    private String stateCapital;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public State(String stateName, String stateCapital, Country country) {
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.country = country;
    }

}
