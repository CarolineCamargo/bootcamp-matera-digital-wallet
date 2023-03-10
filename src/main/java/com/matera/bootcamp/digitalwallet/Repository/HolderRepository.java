package com.matera.bootcamp.digitalwallet.Repository;

import com.matera.bootcamp.digitalwallet.Model.Entity.Holder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolderRepository extends JpaRepository<Holder, Integer> {
}
