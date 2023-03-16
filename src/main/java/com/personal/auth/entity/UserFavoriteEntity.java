package com.personal.auth.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_favorite")
public class UserFavoriteEntity {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "idUser", column = @Column(name = "id_user")),
            @AttributeOverride(name = "idArticle", column = @Column(name = "id_article"))
    })
    private UserFavoriteId userFavoriteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idUser")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idArticle")
    private ArticleEntity article;

    public UserFavoriteEntity(UserFavoriteId userFavoriteId) {
        this.userFavoriteId = userFavoriteId;
    }

    public UserFavoriteId getUserFavoriteId() {
        return userFavoriteId;
    }

    public void setUserFavoriteId(UserFavoriteId userFavoriteId) {
        this.userFavoriteId = userFavoriteId;
    }
}

