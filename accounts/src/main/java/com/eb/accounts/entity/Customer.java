package com.eb.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity /* Telling Spring to treat this class as a table */
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity {

    @Id /* Primary Key */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id") /* not necessary, just for reference */
    private Long customerId;

    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;

}
