package com.example.lab2java.service.impl;

import com.example.lab2java.repository.entity.Category;
import com.example.lab2java.repository.CategoryRepository;
import com.example.lab2java.service.CategoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;

  @Override
  public List<Category> getAllCategories() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getCategoryById(Long id) {
    return categoryRepository.findById(id).orElse(null);
  }

  @Override
  public Category createCategory(Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public void deleteCategory(Long id) {
    categoryRepository.deleteById(id);
  }
}
