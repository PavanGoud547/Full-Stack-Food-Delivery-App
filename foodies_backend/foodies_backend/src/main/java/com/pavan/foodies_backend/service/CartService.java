package com.pavan.foodies_backend.service;

import com.pavan.foodies_backend.dto.CartRequest;
import com.pavan.foodies_backend.dto.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
