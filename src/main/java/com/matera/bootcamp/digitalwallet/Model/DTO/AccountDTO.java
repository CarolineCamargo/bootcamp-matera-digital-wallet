package com.matera.bootcamp.digitalwallet.Model.DTO;

import com.matera.bootcamp.digitalwallet.Model.Entity.Holder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private Integer id;

    private int agency;

    private int number;

    private BigDecimal balance;

    private Holder holder;
}
