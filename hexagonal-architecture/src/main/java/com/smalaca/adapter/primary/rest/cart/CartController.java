package com.smalaca.adapter.primary.rest.cart;

import com.smalaca.application.cart.Cart;
import com.smalaca.application.cart.CartItem;
import com.smalaca.application.cart.CartService;

import java.util.UUID;

public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    public void addProduct(UUID cartId, ProductDto productDto) {
        cartService.addProduct(cartId, asCartItem(productDto));
    }

    private CartItem asCartItem(ProductDto productDto) {
        return null;
    }

    public void removeProduct(UUID cartId, UUID productId) {
        cartService.removeProduct(cartId, productId);
    }

    public void moveProduct(UUID fromId, UUID toId, UUID productId) {
        cartService.moveProduct(fromId, toId, productId);
    }

    public CartDto display(UUID cartId) {
        Cart cart = cartService.findById(cartId);
        return asCartDto(cart);
    }

    private CartDto asCartDto(Cart cart) {
        return null;
    }
}
