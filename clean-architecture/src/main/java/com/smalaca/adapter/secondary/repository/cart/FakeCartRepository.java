package com.smalaca.adapter.secondary.repository.cart;

import com.smalaca.entities.cart.Cart;
import com.smalaca.usecases.cart.CartRepository;

import java.util.UUID;

public class FakeCartRepository implements CartRepository {
    public boolean existsById(UUID cartId) {
        return false;
    }

    public Cart findById(UUID cartId) {
        return null;
    }

    public void save(Cart cart) {

    }
}
