package com.smalaca.core.domainservice.cart;

import com.smalaca.core.domain.cart.Cart;

import java.util.UUID;

public interface CartRepository {
    boolean existsById(UUID cartId);

    Cart findById(UUID cartId);

    void save(Cart cart);
}
