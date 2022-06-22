package com.entertainment.kpop.domain;

import com.entertainment.kpop.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Integer id;

    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(length = 100)
    private String position;

    private String img;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Artist artist;

    public Member setMember(String name, Integer age, Gender gender, String position, String img, Artist artist) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.img = img;
        this.artist = artist;

        return this;
    }
}
