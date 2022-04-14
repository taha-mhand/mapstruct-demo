package com.example.mapStructlombok.mapstructdemo.mapper;


import com.example.mapStructlombok.mapstructdemo.decorator.InvoiceMapperDecorator;
import com.example.mapStructlombok.mapstructdemo.dto.InvoiceDto;

import com.example.mapStructlombok.mapstructdemo.entity.Invoice;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
@DecoratedWith(InvoiceMapperDecorator.class)
public interface InvoiceMapper {

    InvoiceDto invoiceToInvoiceDtoWithLink(Invoice invoice);
}
