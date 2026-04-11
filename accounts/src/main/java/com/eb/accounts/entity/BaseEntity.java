package com.eb.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass /* This class will be the superclass of all classes in this entity package */
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false) /* this field will not be updated when I update my record */
    private LocalDateTime createdAt;

    @Column(updatable = false) /* this field will not be updated when I update my record */
    private String createdBy;

    @Column(insertable = false) /* this field will be null when first inserted */
    private LocalDateTime udpatedAt;

    @Column(insertable = false) /* this field will be null when first inserted */
    private String updatedBy;
}
