package com.example.prueba.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "inventory")
public class Inventory  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer inventory_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    private Store store_id;
    @ManyToOne
    @JoinColumn(name = "film_id",nullable = false, foreignKey = @ForeignKey(name = "FK_Film-Inventary"))
    private Film film_id;
}
