package com.example.prueba.demo.repository;

import com.example.prueba.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepo extends JpaRepository<Category, Integer> {
}
