package com.jpa.persistance.repository;

import com.jpa.persistance.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerCrudRepository extends JpaRepository<Player, Long> {
}
