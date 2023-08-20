package com.jpa.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "club_id", nullable = false)
    private Long clubId;
    private String name;

    @OneToOne(targetEntity = Coach.class,
            cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coach_id", referencedColumnName = "coach_id", nullable = false)
    private Coach coach;

    @OneToMany(fetch = FetchType.LAZY,
            targetEntity = Player.class)
    private List<Player> players;


    @ManyToOne(targetEntity = FootBallAssociation.class)
    private FootBallAssociation footBallAssociation;
}