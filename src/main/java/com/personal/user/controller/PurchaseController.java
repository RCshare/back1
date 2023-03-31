package com.personal.user.controller;


import com.personal.user.entity.Category;
import com.personal.user.entity.User;
import com.personal.user.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping("/purchasedArticlesByCategory")
    public ResponseEntity<List<Category>> getPurchasedArticlesByCategory() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();

        List<Category> purchasedArticlesByCategory = purchaseService.getPurchasedArticlesByCategory(user);

        return ResponseEntity.ok(purchasedArticlesByCategory);
    }

}
