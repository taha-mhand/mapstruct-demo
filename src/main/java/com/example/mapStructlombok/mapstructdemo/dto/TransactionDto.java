package com.example.mapStructlombok.mapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {

    private String uuid;
    private Long totalInCents;
}
