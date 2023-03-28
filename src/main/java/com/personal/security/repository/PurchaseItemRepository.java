package com.personal.security.repository;

import com.personal.security.entity.Purchase;
import com.personal.security.entity.PurchaseItem;
import com.personal.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long> {

    List<PurchaseItem> findByPurchase(Purchase purchase);

}
