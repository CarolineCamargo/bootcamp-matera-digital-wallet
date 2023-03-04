package com.matera.bootcamp.digitalwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Integer, TransactionRepository> {
}
