package com.smalaca.adapter.primary.rest.cart;

import com.smalaca.core.applicationservice.cart.CartApplicationService;
import com.smalaca.core.applicationservice.cart.CartDto;
import com.smalaca.core.applicationservice.cart.ProductDto;

import java.util.UUID;

public class CartController {
    private final CartApplicationService cartApplicationService;

    public CartController(CartApplicationService cartApplicationService) {
        this.cartApplicationService = cartApplicationService;
    }

    public void addProduct(UUID cartId, ProductDto productDto) {
        cartApplicationService.addProduct(cartId, productDto);
    }

    public void removeProduct(UUID cartId, UUID productId) {
        cartApplicationService.removeProduct(cartId, productId);
    }

    public void moveProduct(UUID fromId, UUID toId, UUID productId) {
        cartApplicationService.moveProduct(fromId, toId, productId);
    }

    public CartDto display(UUID cartId) {
        return cartApplicationService.display(cartId);
    }
}
