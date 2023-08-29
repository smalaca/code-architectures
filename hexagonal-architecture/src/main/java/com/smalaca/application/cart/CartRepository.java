package com.smalaca.application.cart;

import java.util.UUID;

public interface CartRepository {
    boolean existsById(UUID cartId);

    Cart findById(UUID cartId);

    void save(Cart cart);
}
