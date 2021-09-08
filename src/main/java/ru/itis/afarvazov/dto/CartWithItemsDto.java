package ru.itis.afarvazov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartWithItemsDto {
    private Double totalPrice;
    List<CartItemDto> cartItemDtos;
}
