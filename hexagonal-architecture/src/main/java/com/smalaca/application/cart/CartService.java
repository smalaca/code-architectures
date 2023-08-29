package com.smalaca.application.cart;

import java.util.UUID;

public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addProduct(UUID cartId, CartItem cartItem) {
        if (cartRepository.existsById(cartId)) {
            Cart cart = cartRepository.findById(cartId);
            cart.add(cartItem);
            cartRepository.save(cart);
        } else {
            throw new CartException();
        }
    }

    public void removeProduct(UUID cartId, UUID productId) {
        if (cartRepository.existsById(cartId)) {
            Cart cart = cartRepository.findById(cartId);
            cart.removeItemFor(productId);
            cartRepository.save(cart);
        } else {
            throw new CartException();
        }
    }

    public void moveProduct(UUID fromId, UUID toId, UUID productId) {
        if (cartRepository.existsById(fromId) && cartRepository.existsById(toId)) {
            Cart from = cartRepository.findById(fromId);
            Cart to = cartRepository.findById(toId);
            CartItem cartItem = from.removeItemFor(productId);
            to.add(cartItem);
            cartRepository.save(from);
            cartRepository.save(to);
        } else {
            throw new CartException();
        }
    }

    public Cart findById(UUID cartId) {
        if (cartRepository.existsById(cartId)) {
            return cartRepository.findById(cartId);
        } else {
            throw new CartException();
        }
    }
}
