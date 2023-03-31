package com.personal.user.repository;

import com.personal.user.entity.Purchase;
import com.personal.user.entity.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long> {

    List<PurchaseItem> findByPurchase(Purchase purchase);

}
