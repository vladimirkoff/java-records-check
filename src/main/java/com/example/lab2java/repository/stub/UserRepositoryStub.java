package com.example.lab2java.repository.stub;

import com.example.lab2java.repository.UserRepository;
import com.example.lab2java.repository.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryStub implements UserRepository {

  private final List<User> users = new ArrayList<>();
  private final AtomicLong idGenerator = new AtomicLong();

  public List<User> findAll() {
    return users;
  }

  public Optional<User> findById(Long id) {
    return users.stream().filter(user -> user.getId().equals(id)).findFirst();
  }

  public User save(User user) {
    user.setId(idGenerator.incrementAndGet());
    users.add(user);
    return user;
  }

  public void deleteById(Long id) {
    users.removeIf(user -> user.getId().equals(id));
  }
}
