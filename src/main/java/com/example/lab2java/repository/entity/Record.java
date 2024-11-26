package com.example.lab2java.repository.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {

  private Long id;
  private Long userId;
  private Long categoryId;
  private LocalDateTime createdAt;
  private Double amount;
}
