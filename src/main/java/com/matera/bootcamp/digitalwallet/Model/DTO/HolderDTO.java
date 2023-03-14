package com.matera.bootcamp.digitalwallet.Model.DTO;

import com.matera.bootcamp.digitalwallet.Model.Entity.Account;
import com.matera.bootcamp.digitalwallet.Model.Entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HolderDTO {

    private Integer id;

    private String name;

    private String cpfOrCnpj;

    private String phone;

    private LocalDate brithDate;

    private Address address;

    private List<Account> accounts;

}
