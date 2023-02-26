package com.spring.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private TransactionType transactionType = TransactionType.INITAL;

    private BigDecimal amount;

    private LocalDateTime localDateTime;

    //Bir Transactionun tek bir accountu olur.
    @ManyToOne(fetch = FetchType.LAZY,optional = false , cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;

    public Transaction(BigDecimal amount,Account account) {
        this.amount = amount;
        this.localDateTime = LocalDateTime.now();
        this.account = account;
    }
}
