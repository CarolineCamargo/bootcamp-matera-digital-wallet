package com.matera.bootcamp.digitalwallet.Repository;

import com.matera.bootcamp.digitalwallet.Model.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Integer, Account> {
}
