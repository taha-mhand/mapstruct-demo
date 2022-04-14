package com.example.mapStructlombok.mapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceDto {

    private String id;
    private String taxId;
    private String viewLink;
    private String downloadLink;
}
