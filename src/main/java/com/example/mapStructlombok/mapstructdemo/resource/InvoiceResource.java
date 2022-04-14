package com.example.mapStructlombok.mapstructdemo.resource;

import com.example.mapStructlombok.mapstructdemo.dto.InvoiceDto;
import com.example.mapStructlombok.mapstructdemo.entity.Invoice;
import com.example.mapStructlombok.mapstructdemo.mapper.InvoiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class InvoiceResource {


    private final InvoiceMapper invoiceMapper;

    @GetMapping(value = "", produces = {"application/json"})
    public InvoiceDto test()  {
        Invoice invoice = Invoice.builder().id("1").taxId("taxId").downloadLink("link").viewLink("viewLink").build();
        return invoiceMapper.invoiceToInvoiceDtoWithLink(invoice);
    }
}
