package com.example.prueba.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categoria")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer category_id;
    private String name;
    private String description;
}
