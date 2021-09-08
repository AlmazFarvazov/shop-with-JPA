package ru.itis.afarvazov.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Customer owner;
    private Double totalPrice;
    private Boolean active;

    @JsonBackReference
    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

}
