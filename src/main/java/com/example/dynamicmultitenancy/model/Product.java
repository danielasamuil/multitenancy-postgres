package com.example.dynamicmultitenancy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "tbl_product")
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Size(max = 50)
    @Column(name = "product_name",nullable = false)
    private String productName;

    @Size(max = 10)
    @Column(name = "quantity",nullable = false)
    private String quantity;

    @Size(max = 3)
    @Column(name = "size",nullable = false,unique = true)
    private String size;
}
