package ru.itis.afarvazov.services;

import org.springframework.stereotype.Service;
import ru.itis.afarvazov.dto.CartItemDto;
import ru.itis.afarvazov.models.Cart;
import ru.itis.afarvazov.models.CartItem;
import ru.itis.afarvazov.repositories.CartItemsRepository;

import java.util.List;

@Service
public class CartItemsServiceImpl implements CartItemsService {

    private final CartItemsRepository repository;

    public CartItemsServiceImpl(CartItemsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CartItem> getCartItemsForCart(Cart cart) {
        return repository.findByCart(cart);
    }

    @Override
    public void createCartItem(CartItem cartItem) {
        repository.save(cartItem);
    }

    @Override
    public void editCartItem(CartItem cartItem) {
        repository.save(cartItem);
    }

    @Override
    public void deleteCartItem(CartItem cartItem) {
        repository.delete(cartItem);
    }

    @Override
    public CartItemDto createCartItem(CartItemDto cartItemDto, Cart cart) {
        CartItem cartItem = CartItem.builder()
                .product(cartItemDto.getProduct())
                .cart(cart)
                .price(cartItemDto.getProduct().getPrice() * cartItemDto.getAmount())
                .amount(cartItemDto.getAmount())
                .build();
        cart.getCartItems().add(cartItem);
        return CartItemDto.from(repository.save(cartItem));
    }

}
