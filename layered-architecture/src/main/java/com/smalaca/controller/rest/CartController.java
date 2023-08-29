package com.smalaca.controller.rest;

import com.smalaca.business.service.CartService;
import com.smalaca.controller.dto.CartDto;
import com.smalaca.controller.dto.ProductDto;
import com.smalaca.persistence.embedded.CartItem;
import com.smalaca.persistence.entity.Cart;

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
