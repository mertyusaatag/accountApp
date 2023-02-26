package com.spring.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id = "";

    private BigDecimal balance;

    public Account(BigDecimal balance, LocalDateTime creationDate, Customer customer) {
        this.balance = balance;
        this.creationDate = creationDate;
        this.customer = customer;
    }

    private LocalDateTime creationDate;

    // Bir account'un sadece 1 customer'i olur.
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id" , nullable = false)
    private Customer customer;

    // Bir account'un birden fazla transactionu olur
    @OneToMany(mappedBy = "account",fetch =FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Transaction> transaction = new ArrayList<>();

}
