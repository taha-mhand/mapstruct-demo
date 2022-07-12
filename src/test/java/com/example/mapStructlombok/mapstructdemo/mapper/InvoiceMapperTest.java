package com.example.mapStructlombok.mapstructdemo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mapStructlombok.mapstructdemo.dto.InvoiceDto;
import com.example.mapStructlombok.mapstructdemo.entity.Invoice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(classes = {InvoiceMapperImpl_.class, InvoiceMapperImpl.class})
public class InvoiceMapperTest {
    
    @Autowired
    InvoiceMapper invoiceMapper;

    @Test
    public void testInvoiceToInvoiceDto() {
        //Given
        Invoice invoice = Invoice.builder()
        .id("1597536")
        .downloadLink("https://download.org/")
        .viewLink("https://view.org/")
        .taxId("258746")
        .build();

        //When
        InvoiceDto invoiceDto = invoiceMapper.invoiceToInvoiceDto(invoice);

        //Then
        assertThat(invoiceDto, notNullValue());
        assertThat(invoice.getDownloadLink(), is(invoice.getId() + " downloadInvoice"));
        assertThat(invoice.getViewLink(), is(invoice.getId() + " viewInvoice"));
    }
}
