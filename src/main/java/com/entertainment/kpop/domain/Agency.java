package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String ceo;

    @Column(nullable = false, length = 100)
    private String address;

    private String img;

    public Agency setAgency(String name, String ceo, String address, String img) {
        this.name = name;
        this.ceo = ceo;
        this.address = address;
        this.img = img;

        return this;
    }
}
