package com.knoldus.car.cart.controller;

import com.knoldus.car.cart.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestParam Long carId, @RequestParam int quantity) {
        cartService.addToCart(carId, quantity);
        return ResponseEntity.ok("Car added to cart.");
    }

    @PostMapping("/remove")
    public ResponseEntity<String> removeFromCart(@RequestParam Long carId, @RequestParam int quantity) {
        cartService.removeFromCart(carId, quantity);
        return ResponseEntity.ok("Car removed from cart.");
    }
}