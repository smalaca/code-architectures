package com.smalaca.purchase.usecases.cart;

import com.smalaca.purchase.entities.cart.Cart;
import com.smalaca.purchase.entities.cart.CartItem;

import java.util.UUID;

public class CartUseCases {
    private final CartRepository cartRepository;

    public CartUseCases(CartRepository cartRepository) {
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
}
