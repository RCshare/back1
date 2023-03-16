package com.personal.auth.controller;

import com.personal.auth.entity.UserFavoriteEntity;
import com.personal.auth.service.UserFavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/userFavorite")
public class UserFavoriteController {

    private final UserFavoriteService userFavoriteService;

    @Autowired
    public UserFavoriteController(UserFavoriteService userFavoriteService) {
        this.userFavoriteService = userFavoriteService;
    }

    @GetMapping("/user/{idUser}")
    public ResponseEntity<List<UserFavoriteEntity>> getUserFavoritesByIdUser(@PathVariable Long idUser) {
        List<UserFavoriteEntity> userFavorites = userFavoriteService.getUserFavoritesByIdUser(idUser);
        return ResponseEntity.ok(userFavorites);
    }
}

