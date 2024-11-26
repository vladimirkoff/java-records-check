package com.example.lab2java.web;

import com.example.lab2java.repository.entity.Category;
import com.example.lab2java.service.CategoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

  private final CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> getAllCategories() {
    return ResponseEntity.ok(categoryService.getAllCategories());
  }

  @GetMapping("/{categoryId}")
  public ResponseEntity<Category> getCategoryById(@PathVariable Long categoryId) {
    return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
  }

  @PostMapping
  public ResponseEntity<Category> createCategory(@RequestBody Category category) {
    return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.createCategory(category));
  }

  @DeleteMapping("/{categoryId}")
  public ResponseEntity<Void> deleteCategory(@PathVariable Long categoryId) {
    categoryService.deleteCategory(categoryId);
    return ResponseEntity.noContent().build();
  }
}