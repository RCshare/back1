package com.personal.security.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq")
    @SequenceGenerator(name = "article_seq", sequenceName = "article_seq", allocationSize = 1)
    private Integer id;

    private String name;
    private String description;
    private Double price;

    @JsonIgnore
    @ManyToOne
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "article")
    private List<PurchaseItem> purchaseItems;

}
