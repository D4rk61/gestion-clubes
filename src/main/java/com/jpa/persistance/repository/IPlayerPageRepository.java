package com.jpa.persistance.repository;

import com.jpa.persistance.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerPageRepository extends ListPagingAndSortingRepository<Player, Long> {

    Page<Player> findAll(Pageable pageable);

    // ordena por el nombre
    Page<Player> findAllByOrderByFirstNameAsc(Pageable pageable);
}
