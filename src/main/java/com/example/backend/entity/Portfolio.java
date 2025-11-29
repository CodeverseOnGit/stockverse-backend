package com.example.backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userUuid;

    @Column(nullable = false, precision = 20, scale = 4)
    private BigDecimal balanceTokens = BigDecimal.valueOf(1000000.0);

    private Instant updatedAt = Instant.now();

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PortfolioItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public BigDecimal getBalanceTokens() {
        return balanceTokens;
    }

    public void setBalanceTokens(BigDecimal balanceTokens) {
        this.balanceTokens = balanceTokens;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<PortfolioItem> getItems() {
        return items;
    }

    public void setItems(List<PortfolioItem> items) {
        this.items = items;
    }
}
