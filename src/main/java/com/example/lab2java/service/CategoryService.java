package com.example.lab2java.service;

import com.example.lab2java.repository.entity.Category;
import java.util.List;

public interface CategoryService {

  List<Category> getAllCategories();

  Category getCategoryById(Long id);

  Category createCategory(Category category);

  void deleteCategory(Long id);
}
