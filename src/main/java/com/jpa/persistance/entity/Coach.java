package com.jpa.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor  @AllArgsConstructor
@Table(name = "coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coach_id", nullable = false)
    private Long coachId;

    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String nacionality;
    private Integer age;
}