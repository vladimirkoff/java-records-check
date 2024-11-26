package com.example.lab2java.repository.stub;

import com.example.lab2java.repository.CategoryRepository;
import com.example.lab2java.repository.entity.Category;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositoryStub implements CategoryRepository {

  private final List<Category> categories = new ArrayList<>();
  private final AtomicLong idGenerator = new AtomicLong();

  public List<Category> findAll() {
    return categories;
  }

  public Optional<Category> findById(Long id) {
    return categories.stream().filter(category -> category.getId().equals(id)).findFirst();
  }

  public Category save(Category category) {
    category.setId(idGenerator.incrementAndGet());
    categories.add(category);
    return category;
  }

  public void deleteById(Long id) {
    categories.removeIf(category -> category.getId().equals(id));
  }
}