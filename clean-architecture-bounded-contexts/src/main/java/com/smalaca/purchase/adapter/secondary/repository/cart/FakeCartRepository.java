package com.smalaca.purchase.adapter.secondary.repository.cart;

import com.smalaca.purchase.entities.cart.Cart;
import com.smalaca.purchase.usecases.cart.CartRepository;

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
