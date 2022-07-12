package com.example.mapStructlombok.mapstructdemo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mapStructlombok.mapstructdemo.dto.AddressDto;
import com.example.mapStructlombok.mapstructdemo.entity.Address;
import com.github.javafaker.Faker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(classes = AddressMapperImpl.class)
public class AddressMapperTest {
    
    @Autowired
    AddressMapper addressMapper;

    @Test
    public void testMapAddressToAddressDto() {
        //Given
        Faker faker = new Faker();
        Address address = Address.builder()
        .id(faker.number().randomDigit())
        .city(faker.address().city())
        .county(faker.address().country())
        .number(faker.address().buildingNumber())
        .street(faker.address().streetName())
        .postalCode(faker.address().zipCode())
        .build();

        //When
        AddressDto addressDto = addressMapper.mapAddressToAddressDto(address);

        //Then
        assertThat(addressDto, notNullValue());
        assertThat(addressDto.getId(), is(address.getId()));
        assertThat(addressDto.getCity(), is(address.getCity()));
        assertThat(addressDto.getCounty(), is(address.getCounty()));
        assertThat(addressDto.getStreet(), is(address.getStreet()));
        assertThat(addressDto.getPostalCode(), is(address.getPostalCode()));
    }
}
