package com.example.mapStructlombok.mapstructdemo.entity;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
    private int id;
    private int name;
}
