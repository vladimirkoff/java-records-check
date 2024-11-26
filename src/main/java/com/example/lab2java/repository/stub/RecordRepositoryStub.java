package com.example.lab2java.repository.stub;

import com.example.lab2java.repository.RecordRepository;
import com.example.lab2java.repository.entity.Record;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class RecordRepositoryStub implements RecordRepository {

  private final List<Record> records = new ArrayList<>();
  private final AtomicLong idGenerator = new AtomicLong();

  public List<Record> findAll() {
    return records;
  }

  public Optional<Record> findById(Long id) {
    return records.stream().filter(record -> record.getId().equals(id)).findFirst();
  }

  public List<Record> findByUserId(Long userId) {
    return records.stream().filter(record -> userId.equals(record.getUserId()))
        .collect(Collectors.toList());
  }

  public List<Record> findByCategoryId(Long categoryId) {
    return records.stream().filter(record -> categoryId.equals(record.getCategoryId()))
        .collect(Collectors.toList());
  }

  public Record save(Record record) {
    record.setId(idGenerator.incrementAndGet());
    record.setCreatedAt(LocalDateTime.now());
    records.add(record);
    return record;
  }

  public void deleteById(Long id) {
    records.removeIf(record -> record.getId().equals(id));
  }
}
