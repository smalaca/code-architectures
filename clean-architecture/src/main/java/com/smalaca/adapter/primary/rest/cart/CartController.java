package com.smalaca.adapter.primary.rest.cart;

import com.smalaca.entities.cart.Cart;
import com.smalaca.entities.cart.CartItem;
import com.smalaca.usecases.cart.CartUseCases;

import java.util.UUID;

public class CartController {
    private final CartUseCases cartUseCases;

    public CartController(CartUseCases cartUseCases) {
        this.cartUseCases = cartUseCases;
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
        Cart cart = cartUseCases.findById(cartId);
        return asCartDto(cart);
    }

    private CartDto asCartDto(Cart cart) {
        return null;
    }
}
