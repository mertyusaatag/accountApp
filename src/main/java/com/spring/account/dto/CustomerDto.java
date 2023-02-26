package com.spring.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {
 private String id;

 private String name;

 private  String surname;

 private Set<CustomerAccountDto> accounts;


}
