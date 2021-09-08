package ru.itis.afarvazov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.afarvazov.models.Cart;
import ru.itis.afarvazov.models.CartItem;

import java.util.List;

public interface CartItemsRepository extends JpaRepository<CartItem, Long> {

    List<CartItem> findByCart(Cart cart);

}
