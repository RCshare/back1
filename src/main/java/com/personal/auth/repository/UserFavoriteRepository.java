package com.personal.auth.repository;

import com.personal.auth.entity.UserFavoriteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFavoriteRepository extends JpaRepository<UserFavoriteEntity, Long> {
    List<UserFavoriteEntity> findByUserFavoriteIdUserId(Long idUser);
}
