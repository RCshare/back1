package com.personal.security.controller;


import com.personal.security.entity.Article;
import com.personal.security.entity.Category;
import com.personal.security.entity.User;
import com.personal.security.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping("/purchasedArticlesByCategory")
    public ResponseEntity<Map<Category, List<Article>>> getPurchasedArticlesByCategory() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();

        Map<Category, List<Article>> purchasedArticlesByCategory = purchaseService.getPurchasedArticlesByCategory(user);

        return ResponseEntity.ok(purchasedArticlesByCategory);
    }
}
