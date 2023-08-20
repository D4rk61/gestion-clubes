package com.jpa.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "foot_ball_association")
public class FootBallAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;
    private String name;
    private String country;
    private String ceo;

    @OneToMany(targetEntity = Club.class,
    fetch = FetchType.LAZY, mappedBy = "footBallAssociation")
    private List<Club> clubs;
}