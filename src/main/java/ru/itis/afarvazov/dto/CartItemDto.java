package ru.itis.afarvazov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.afarvazov.models.CartItem;
import ru.itis.afarvazov.models.Product;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartItemDto {

    private Product product;
    private Integer amount;

    public static CartItemDto from(CartItem cartItem) {
        return CartItemDto.builder()
                .product(cartItem.getProduct())
                .amount(cartItem.getAmount())
                .build();
    }

    public static List<CartItemDto> from(List<CartItem> cartItems) {
        return cartItems.stream().map(CartItemDto::from).collect(Collectors.toList());
    }

}
