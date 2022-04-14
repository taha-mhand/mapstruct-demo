package com.example.mapStructlombok.mapstructdemo.mapper;

import com.example.mapStructlombok.mapstructdemo.dto.CertificateDto;
import com.example.mapStructlombok.mapstructdemo.entity.Certificate;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CertificateMapper {

    Certificate certificateDtoToCertificate(CertificateDto certificateDto);
    CertificateDto certificateToCertificateDto(Certificate certificate);
}
