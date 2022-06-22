package com.entertainment.kpop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Integer id;

    private Integer track;

    @Column(length = 100)
    private String name;

    private Integer title;

    @Temporal(TemporalType.TIME)
    private Date playTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Album album;

}
