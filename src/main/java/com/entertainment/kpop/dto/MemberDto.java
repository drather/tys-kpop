package com.entertainment.kpop.dto;

import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String name;

    private Integer age;

    private Gender gender;

    private String position;

    private String img;

    private Artist artist;
}
