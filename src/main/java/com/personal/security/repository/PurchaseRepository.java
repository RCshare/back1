package com.personal.security.repository;

import com.personal.security.entity.Category;
import com.personal.security.entity.Purchase;
import com.personal.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findByBuyer(User user);

}