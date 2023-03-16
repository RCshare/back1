package com.personal.auth.service;

import com.personal.auth.entity.UserFavoriteEntity;
import com.personal.auth.repository.UserFavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFavoriteService {

    private final UserFavoriteRepository userFavoriteRepository;

    @Autowired
    public UserFavoriteService(UserFavoriteRepository userFavoriteRepository) {
        this.userFavoriteRepository = userFavoriteRepository;
    }

    public List<UserFavoriteEntity> getUserFavoritesByIdUser(Long idUser) {
        return userFavoriteRepository.findByUserFavoriteIdUserId(idUser);
    }
}
