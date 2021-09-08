package ru.itis.afarvazov.services;

import ru.itis.afarvazov.dto.CartItemDto;
import ru.itis.afarvazov.dto.CartWithItemsDto;
import ru.itis.afarvazov.models.CartItem;
import ru.itis.afarvazov.models.Product;

import java.util.List;

public interface ProductsService {

    List<Product> getAllProducts();
    List<Product> getProductsByTitle(String title);
    List<Product> getProductsByCategory(String category);
    Product getProductById(Long id);
    void addProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(Product product);

    void orderComplete(CartWithItemsDto cartWithItemsDto);
}
