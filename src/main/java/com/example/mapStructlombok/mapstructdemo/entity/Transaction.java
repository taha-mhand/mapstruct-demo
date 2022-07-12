package com.example.mapStructlombok.mapstructdemo.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private Long id;
    @Builder.Default
    private String uuid = UUID.randomUUID().toString();
    private BigDecimal total;
}
