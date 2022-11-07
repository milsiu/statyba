package com.eshop.statyba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "VARCHAR(36)", updatable = false)
    UUID id;
    @NotNull
    String categoryId;
    double salesPrice;
    double purchasePrice;
    String name;
    String description;
}





