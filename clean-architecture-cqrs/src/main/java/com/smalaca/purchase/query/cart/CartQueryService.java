package com.smalaca.purchase.query.cart;

import java.util.UUID;

public class CartQueryService {
    private final CartQueryRepository cartQueryRepository;

    public CartQueryService(CartQueryRepository cartQueryRepository) {
        this.cartQueryRepository = cartQueryRepository;
    }

    public CartDto findById(UUID cartId) {
        if (cartQueryRepository.existsById(cartId)) {
            return cartQueryRepository.findById(cartId);
        } else {
            throw new CartQueryException();
        }
    }
}
