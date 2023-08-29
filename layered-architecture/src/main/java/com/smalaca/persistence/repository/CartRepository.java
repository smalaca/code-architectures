package com.smalaca.persistence.repository;

import com.smalaca.persistence.entity.Cart;

import java.util.UUID;

public class CartRepository {
    public boolean existsById(UUID cartId) {
        return false;
    }

    public Cart findById(UUID cartId) {
        return null;
    }

    public void save(Cart cart) {

    }
}
