package com.entertainment.kpop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyDto {
    private String name;

    private String ceo;

    private String address;

    private String img;
}
