package com.example.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
public class MarketPrice {
    @Id
    private String ticker;

    @Column(precision = 20, scale = 8)
    private BigDecimal lastPrice;

    private Instant updatedAt = Instant.now();
}
