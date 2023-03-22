package com.personal.security.service;

import com.personal.security.entity.*;
import com.personal.security.repository.PurchaseItemRepository;
import com.personal.security.repository.PurchaseRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final PurchaseItemRepository purchaseItemRepository;


    public Map<Category, List<Article>> getPurchasedArticlesByCategory(User user) {
        Map<Category, List<Article>> result = new HashMap<>();

        // Récupérer la liste des achats de l'utilisateur
        List<Purchase> purchases = purchaseRepository.findByBuyer(user);

        // Pour chaque achat, récupérer la liste des articles achetés par catégorie
        for (Purchase purchase : purchases) {
            List<PurchaseItem> purchaseItems = purchaseItemRepository.findByPurchase(purchase);
            for (PurchaseItem purchaseItem : purchaseItems) {
                Article article = purchaseItem.getArticle();
                if (article != null && article.getCategory() != null) {
                    Category category = article.getCategory();
                    List<Article> articlesInCategory = result.computeIfAbsent(category, k -> new ArrayList<>());
                    articlesInCategory.add(article);
                }
            }
        }

        return result;
    }

}