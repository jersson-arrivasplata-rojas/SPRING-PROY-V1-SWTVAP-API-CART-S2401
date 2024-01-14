package com.jersson.arrivasplata.swtvap.api.cart.business.implementation;

import com.jersson.arrivasplata.swtvap.api.cart.business.service.CartService;
import com.jersson.arrivasplata.swtvap.api.cart.enums.Status;
import com.jersson.arrivasplata.swtvap.api.cart.exception.CustomException;
import com.jersson.arrivasplata.swtvap.api.cart.model.Cart;
import com.jersson.arrivasplata.swtvap.api.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Flux<Cart> getAllCarts() {
        return Flux.fromIterable(cartRepository.findAll());
    }

    public Mono<Cart> getCartById(Long id) {
        return Mono.just(cartRepository.findById(id)
                .orElseThrow(() -> new CustomException("Cart not found with id: " + id)));
    }

    public Mono<Cart> createCart(Cart cart) {
        // Lógica para crear un nuevo carto
        if (cart.getCode() == null || cart.getCode().isEmpty()) {
            throw new CustomException("Cart name is required.");
        }
        // Resto de la lógica para crear un carto
        return Mono.just(cartRepository.save(cart));
    }

    public Mono<Cart> updateCart(Cart cart) {
        // Lógica para actualizar un carto
        if (cart.getCode() == null || cart.getCode().isEmpty()) {
            throw new CustomException("Cart name is required.");
        }
        // Resto de la lógica para actualizar un carto
        return Mono.just(cartRepository.save(cart));
    }

    public Mono<Void> deleteCartById(Long id) {
        // Lógica para eliminar un carto
        Optional<Cart> cart = cartRepository.findById(id);
        if (!cart.isPresent()) {
            throw new CustomException("Cart not found with id: " + id);
        }
        // Resto de la lógica para eliminar un cart
        cartRepository.deleteById(id);

        return Mono.empty();
    }

    public Cart getCartByName(String name) {
        // Implementación para recuperar el carto por nombre desde el repositorio
        return cartRepository.findByCode(name);
    }
}