package com.example.lab2java.service;

import com.example.lab2java.repository.entity.Record;
import java.util.List;

public interface RecordService {

  List<Record> getRecordsByUserId(Long userId);

  List<Record> getRecordsByCategoryId(Long categoryId);

  Record getRecordById(Long id);

  Record createRecord(Record record);

  void deleteRecord(Long id);
}
