package com.spring.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Collection;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;
    private String surname;


    // Bir customer birden fazla hesap açabilir.
    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Account> account;

    public Set<Account> getAccounts() {
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }

}
