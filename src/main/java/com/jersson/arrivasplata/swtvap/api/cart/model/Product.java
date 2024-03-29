package com.jersson.arrivasplata.swtvap.api.cart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jersson.arrivasplata.swtvap.api.cart.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "swtvap_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long productId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "name", length = 200)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "name_en", length = 200)
    private String nameEn;

    @Column(columnDefinition = "TEXT")
    private String descriptionEn;


    @Column(name = "price", precision = 50, scale = 10)
    private BigDecimal price;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "stock_min")
    private Long stockMin;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    @Column(columnDefinition = "TEXT")
    private String otherDetailsEn;

    @Enumerated(EnumType.ORDINAL)
    private Status status;
}