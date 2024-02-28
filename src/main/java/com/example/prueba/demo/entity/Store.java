package com.example.prueba.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "store")
public class Store  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer store_id;
    private String address;
}
