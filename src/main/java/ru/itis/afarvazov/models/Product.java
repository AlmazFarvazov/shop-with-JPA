package ru.itis.afarvazov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double price;
    private Integer availableQuantity;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    public enum Category {
        FOOD, ELECTRONICS, CLOTHES, SPORT
    }

}
