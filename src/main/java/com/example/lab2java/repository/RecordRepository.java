package com.example.lab2java.repository;

import com.example.lab2java.repository.entity.Record;
import java.util.List;
import java.util.Optional;

public interface RecordRepository {

  List<Record> findAll();

  List<Record> findByUserId(Long userId);

  List<Record> findByCategoryId(Long categoryId);

  Optional<Record> findById(Long id);

  Record save(Record record);

  void deleteById(Long id);
}
