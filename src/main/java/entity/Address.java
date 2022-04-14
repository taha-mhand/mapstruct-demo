package entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private int id;
    private String street;
    private String postalCode;
    private String county;
    private String city;
    private String number;
}
