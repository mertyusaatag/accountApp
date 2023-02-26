package com.spring.account.dto.converter;

import com.spring.account.dto.TransactionDto;
import com.spring.account.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from) {
        return new TransactionDto(from.getId(),from.getTransactionType(),from.getAmount(),from.getLocalDateTime());
    }
}
