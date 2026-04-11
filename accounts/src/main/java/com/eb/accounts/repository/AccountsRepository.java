package com.eb.accounts.repository;

import com.eb.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional /* atomicity: Any partial change is not allowed (will be rolled back) */
    @Modifying /* Tells Spring Data JPA that this is a write operation (INSERT/UPDATE/DELETE), By default, Spring Data assumes repository methods are read-only queries */
    void deleteByCustomerId(Long customerId);
}
