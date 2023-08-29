package com.smalaca.purchase.query.cart;

import java.util.UUID;

public class CartQueryRepository {
    boolean existsById(UUID cartId) {
        return false;
    }

    CartDto findById(UUID cartId) {
        return null;
    }
}
