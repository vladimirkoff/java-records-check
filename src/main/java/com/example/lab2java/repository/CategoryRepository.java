package com.example.lab2java.repository;

import com.example.lab2java.repository.entity.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

  List<Category> findAll();

  Optional<Category> findById(Long id);

  Category save(Category category);

  void deleteById(Long id);
}
