package com.example.prueba.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
@Table(name = "film")
public class Film  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer film_id;

    private String title;
    private String description;
    private Integer year;
    private LocalDateTime rental_duration;
    private Float rating;

    private String duration;
    private Float rental_price;

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDateTime getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(LocalDateTime rental_duration) {
        this.rental_duration = rental_duration;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Float getRental_price() {
        return rental_price;
    }

    public void setRental_price(Float rental_price) {
        this.rental_price = rental_price;
    }
}
