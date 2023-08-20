package com.jpa.persistance.repository;

import com.jpa.persistance.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClubCrudRepository extends JpaRepository<Club, Long> {

}
