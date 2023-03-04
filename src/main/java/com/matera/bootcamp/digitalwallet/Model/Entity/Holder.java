package com.matera.bootcamp.digitalwallet.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Holder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String cpfOrCnpj;

    private String phone;

    private LocalDate brithDate;

    @OneToOne
    private Address address;

    @OneToMany
    private List<Account> accounts;
}
