package com.spring.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountCustomerDto {
    private String id;
    private String name;

    private String surname;

}
