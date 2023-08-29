package com.smalaca.core.applicationservice.cart;

import com.smalaca.core.domain.cart.Cart;
import com.smalaca.core.domain.cart.CartItem;
import com.smalaca.core.domainservice.cart.CartDomainService;

import java.util.UUID;

public class CartApplicationService {
    private final CartDomainService cartService;

    public CartApplicationService(CartDomainService cartService) {
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
