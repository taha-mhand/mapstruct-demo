package mapper;


import decorator.InvoiceMapperDecorator;
import dto.InvoiceDto;

import entity.Invoice;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
@DecoratedWith(InvoiceMapperDecorator.class)
public interface InvoiceMapper {

    InvoiceDto invoiceToInvoiceDtoWithLink(Invoice invoice);
}
