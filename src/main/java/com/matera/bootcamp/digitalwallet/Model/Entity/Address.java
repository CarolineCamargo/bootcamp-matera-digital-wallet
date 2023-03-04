package com.matera.bootcamp.digitalwallet.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String number;
    private String district;
    private String complement;
    private String cep;
    private String city;
    private String state;
    private String country;
    @OneToOne
    private Holder holder;
}
