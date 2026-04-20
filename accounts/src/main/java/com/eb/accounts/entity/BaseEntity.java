package com.eb.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass /* This class will be the superclass of all classes in this entity package */
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @ToString
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false) /* this field will not be updated when I update my record */
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false) /* this field will not be updated when I update my record */
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false) /* this field will be null when first inserted */
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false) /* this field will be null when first inserted */
    private String updatedBy;
}
