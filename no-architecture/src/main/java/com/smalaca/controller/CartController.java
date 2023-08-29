package com.smalaca.controller;

import com.smalaca.dto.CartDto;
import com.smalaca.dto.ProductDto;
import com.smalaca.exception.CartException;
import com.smalaca.repository.CartRepository;
import com.smalaca.service.CartService;

import java.util.UUID;

public class CartController {
    private final CartService cartService;
    private final CartRepository cartRepository;

    public CartController(CartService cartService, CartRepository cartRepository) {
        this.cartService = cartService;
        this.cartRepository = cartRepository;
    }

    public void addProduct(UUID cartId, ProductDto productDto) {
        if (cartRepository.existsById(cartId)) {
            cartService.addProduct(cartId, productDto);
        } else {
            throw new CartException();
        }
    }

    public void removeProduct(UUID cartId, UUID productId) {
        if (cartRepository.existsById(cartId)) {
            cartService.removeProduct(cartId, productId);
        } else {
            throw new CartException();
        }
    }

    public void moveProduct(UUID fromId, UUID toId, UUID productId) {
        if (cartRepository.existsById(fromId) && cartRepository.existsById(toId)) {
            cartService.moveProduct(fromId, toId, productId);
        } else {
            throw new CartException();
        }
    }

    public CartDto display(UUID cartId) {
        if (cartRepository.existsById(cartId)) {
            return cartService.findById(cartId);
        } else {
            throw new CartException();
        }
    }
}
