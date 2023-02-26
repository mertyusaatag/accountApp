package com.spring.account.dto;

import com.spring.account.model.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDto {
    private String id;

    private TransactionType transactionType = TransactionType.INITAL;

    private BigDecimal amount;

    private LocalDateTime localDateTime;
}
