package com.matera.bootcamp.digitalwallet.Repository;

import com.matera.bootcamp.digitalwallet.Model.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Integer, Address> {
}
