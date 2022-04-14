package mapper;

import dto.CertificateDto;
import entity.Certificate;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CertificateMapper {

    Certificate certificateDtoToCertificate(CertificateDto certificateDto);
    CertificateDto certificateToCertificateDto(Certificate certificate);
}
