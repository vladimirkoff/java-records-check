package com.example.lab2java.service;

import com.example.lab2java.repository.entity.User;
import java.util.List;

public interface UserService {

  List<User> getAllUsers();

  User getUserById(Long id);

  User createUser(User user);

  void deleteUser(Long id);
}
