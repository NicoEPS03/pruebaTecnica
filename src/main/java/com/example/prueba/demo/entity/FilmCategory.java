package com.example.prueba.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "film_category")
public class FilmCategory  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer filmcategoria_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private Film film_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id",nullable = false, foreignKey = @ForeignKey(name = "FK_Film-Category"))
    private Category category_id;
}
