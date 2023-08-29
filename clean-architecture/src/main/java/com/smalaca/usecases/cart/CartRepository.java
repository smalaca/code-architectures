package com.smalaca.usecases.cart;

import com.smalaca.entities.cart.Cart;

import java.util.UUID;

public interface CartRepository {
    boolean existsById(UUID cartId);

    Cart findById(UUID cartId);

    void save(Cart cart);
}
