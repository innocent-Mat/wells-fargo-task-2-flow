package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(nullable = false)
    private Client client;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private LocalDate createdDate;

    protected Portfolio() {
    }

    public Portfolio(
            Client client,
            String portfolioName,
            LocalDate createdDate) {

        this.client = client;
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}