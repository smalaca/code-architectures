package com.smalaca.service;

import com.smalaca.dto.CartDto;
import com.smalaca.dto.ProductDto;
import com.smalaca.embedded.CartItem;
import com.smalaca.entity.Cart;
import com.smalaca.repository.CartRepository;

import java.util.UUID;

public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addProduct(UUID cartId, ProductDto productDto) {
        Cart cart = cartRepository.findById(cartId);
        CartItem cartItem = asCartItem(productDto);
        cart.add(cartItem);
        cartRepository.save(cart);
    }

    private CartItem asCartItem(ProductDto productDto) {
        return null;
    }

    public void removeProduct(UUID cartId, UUID productId) {
        Cart cart = cartRepository.findById(cartId);
        cart.removeItemFor(productId);
        cartRepository.save(cart);
    }

    public void moveProduct(UUID fromId, UUID toId, UUID productId) {
        Cart from = cartRepository.findById(fromId);
        Cart to = cartRepository.findById(toId);
        CartItem cartItem = from.removeItemFor(productId);
        to.add(cartItem);
        cartRepository.save(from);
        cartRepository.save(to);
    }

    public CartDto findById(UUID cartId) {
        Cart cart = cartRepository.findById(cartId);
        return asCartDto(cart);
    }

    private CartDto asCartDto(Cart cart) {
        return null;
    }
}
