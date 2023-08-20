package com.jpa.domain.service;

import com.jpa.persistance.entity.Player;
import com.jpa.persistance.repository.IPlayerCrudRepository;
import com.jpa.persistance.repository.IPlayerPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private final IPlayerCrudRepository playerCrudRepository;
    @Autowired
    private final IPlayerPageRepository playerPageRepository;

    public PlayerService(IPlayerCrudRepository playerCrudRepository, IPlayerPageRepository playerPageRepository) {
        this.playerCrudRepository = playerCrudRepository;
        this.playerPageRepository = playerPageRepository;
    }


    public Page<Player> getAllPageable(int page, int size) {
        Pageable pageRequest = PageRequest.of(page, size);

        return this.playerPageRepository.findAll(pageRequest);

    }


    public Optional<Player> getById(Long id) {
        try {
            return this.playerCrudRepository.findById(id);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public Page<Player> getAllAsc(int page, int size) {
        Pageable pageRequest = PageRequest.of(page, size);

        try {
            return this.playerPageRepository.findAllByOrderByFirstNameAsc(pageRequest);
        } catch (Exception e) {
            return null;
        }
    }
}
