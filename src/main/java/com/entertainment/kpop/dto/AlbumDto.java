package com.entertainment.kpop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlbumDto {
    private String name;

    private String releaseDate;

    private int artistId;
}
