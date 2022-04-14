package com.example.mapStructlombok.mapstructdemo.mapper;

import com.example.mapStructlombok.mapstructdemo.entity.Address;
import com.example.mapStructlombok.mapstructdemo.entity.Customer;
import com.example.mapStructlombok.mapstructdemo.entity.DeliveryAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface DeliveryAddressMapper {

    @Mapping(source = "customer.firstName", target = "forename")
    @Mapping(source = "customer.lastName", target = "surname")
    @Mapping(source = "address.street", target = "street")
    @Mapping(source = "address.postalCode", target = "postalCode")
    @Mapping(source = "address.county", target = "county")
    DeliveryAddress from(Customer customer, Address address);
}
