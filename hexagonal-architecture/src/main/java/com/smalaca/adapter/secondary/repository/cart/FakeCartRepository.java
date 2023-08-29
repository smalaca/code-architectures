package com.smalaca.adapter.secondary.repository.cart;

import com.smalaca.application.cart.Cart;
import com.smalaca.application.cart.CartRepository;

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
