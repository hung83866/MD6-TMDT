package com.example.tmdt.model;

import javax.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    AppUser appUser;
    @ManyToOne
    Product product;

    public Cart() {
    }

    public Cart(Long id, AppUser appUser, Product product) {
        this.id = id;
        this.appUser = appUser;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
