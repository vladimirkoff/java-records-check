package com.example.lab2java.repository;

import com.example.lab2java.repository.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {

  List<User> findAll();

  Optional<User> findById(Long id);

  User save(User user);

  void deleteById(Long id);
}
