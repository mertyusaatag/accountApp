package com.spring.account.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDto {
    private String id;

    private BigDecimal balance;

    private LocalDateTime creationDate;

    private AccountCustomerDto customer;

    private List<TransactionDto> transactions;


    }
