package com.eb.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity /* Telling Spring to treat this class as a table */
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name="customer_id") /* not necessary, just for reference */
    private Long customerId;

    @Column(name="account_number")
    @Id /* Primary Key */
    private Long accountNumber;

    @Column(name="account_type")
    private String accountType;

    @Column(name="branch_address")
    private String branchAddress;

}
