package com.entertainment.kpop.dto;

import com.entertainment.kpop.domain.Album;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {
    private Integer track;

    private String name;

    private Integer title;

    private Date playTime;

    private Album album;
}
