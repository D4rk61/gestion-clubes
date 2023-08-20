package com.jpa.persistance.repository;

import com.jpa.persistance.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoachCrudRepository extends JpaRepository<Coach, Long> {

}
