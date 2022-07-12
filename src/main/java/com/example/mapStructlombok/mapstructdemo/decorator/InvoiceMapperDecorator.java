package com.example.mapStructlombok.mapstructdemo.decorator;


import com.example.mapStructlombok.mapstructdemo.dto.InvoiceDto;
import com.example.mapStructlombok.mapstructdemo.entity.Invoice;
import lombok.Setter;
import com.example.mapStructlombok.mapstructdemo.mapper.InvoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Setter
public abstract class InvoiceMapperDecorator implements InvoiceMapper {

    @Autowired
    @Qualifier("delegate")
    private InvoiceMapper delegate;


    @Override
    public InvoiceDto invoiceToInvoiceDto(Invoice invoice) {
        InvoiceDto dto = delegate.invoiceToInvoiceDto(invoice);

        dto.setDownloadLink(invoice.getId() + " downloadInvoice");
        dto.setViewLink(invoice.getId() + " viewInvoice");
        return dto;
    }

}
