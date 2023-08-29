package com.smalaca.purchase.adapter.primary.rest.cart;

import com.smalaca.purchase.entities.cart.CartItem;
import com.smalaca.purchase.query.cart.CartDto;
import com.smalaca.purchase.query.cart.CartQueryService;
import com.smalaca.purchase.usecases.cart.CartUseCases;

import java.util.UUID;

public class CartController {
    private final CartUseCases cartUseCases;
    private final CartQueryService cartQueryService;

    public CartController(CartUseCases cartUseCases, CartQueryService cartQueryService) {
        this.cartUseCases = cartUseCases;
        this.cartQueryService = cartQueryService;
    }

    public void addProduct(UUID cartId, ProductDto productDto) {
        cartUseCases.addProduct(cartId, asCartItem(productDto));
    }

    private CartItem asCartItem(ProductDto productDto) {
        return null;
    }

    public void removeProduct(UUID cartId, UUID productId) {
        cartUseCases.removeProduct(cartId, productId);
    }

    public void moveProduct(UUID fromId, UUID toId, UUID productId) {
        cartUseCases.moveProduct(fromId, toId, productId);
    }

    public CartDto display(UUID cartId) {
        return cartQueryService.findById(cartId);
    }
}
