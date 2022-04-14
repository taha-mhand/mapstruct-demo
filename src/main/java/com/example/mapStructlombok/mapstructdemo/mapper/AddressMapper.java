package com.example.mapStructlombok.mapstructdemo.mapper;

import com.example.mapStructlombok.mapstructdemo.dto.AddressDto;
import com.example.mapStructlombok.mapstructdemo.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDto mapAddressToAddressDto(Address address);
    Address mapAddressDtoToAddress(AddressDto addressDto);

    //Collections
    List<AddressDto> addressToAddressDto(List<Address> addresses);
    Set<AddressDto> addressToAddressDto(Set<Address> addresses);
    Map<String,AddressDto> addressToAddressDto(Map<String,Address> addresses);

    //streams
    Set<AddressDto> addressToAddressDto(Stream<Address> addressStream);
    List<AddressDto> addressStreamToAddressDto(Stream<Address> addressStream);

    //update
    @Mapping(target = "id", ignore = true)
    void updateAddressDto(@MappingTarget AddressDto target, Address input);
}
