package com.jpa.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id", nullable = false)
    private Long playerId;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String nacionality;
    private Integer age;
    private String position;


    @OneToMany
    private List<Club> clubs;
}