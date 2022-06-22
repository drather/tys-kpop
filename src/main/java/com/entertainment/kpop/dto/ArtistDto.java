package com.entertainment.kpop.dto;

import com.entertainment.kpop.domain.Agency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArtistDto {
    private String name;

    private Date debutData;

    private String img;

    private String description;

    private Agency agency;
}
