package com.example.lab2java.service.impl;

import com.example.lab2java.repository.entity.Record;
import com.example.lab2java.repository.RecordRepository;
import com.example.lab2java.service.RecordService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecordServiceImpl implements RecordService {

  private final RecordRepository recordRepository;

  @Override
  public List<Record> getRecordsByUserId(Long userId) {
    return recordRepository.findByUserId(userId);
  }

  @Override
  public List<Record> getRecordsByCategoryId(Long categoryId) {
    return recordRepository.findByCategoryId(categoryId);
  }

  @Override
  public Record getRecordById(Long id) {
    return recordRepository.findById(id).orElse(null);
  }

  @Override
  public Record createRecord(Record record) {
    return recordRepository.save(record);
  }

  @Override
  public void deleteRecord(Long id) {
    recordRepository.deleteById(id);
  }
}
