package com.jpa.web.controller;

import com.jpa.domain.service.PlayerService;
import com.jpa.persistance.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private static final String DEFAULT_PAGE = "0";
    private static final String DEFAULT_ELEMENTS = "7";

    @Autowired
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping
    public ResponseEntity<Page<Player>> getAll(
            @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_ELEMENTS) int elements
            ) {

        try {
            return ResponseEntity.ok(playerService.getAllPageable(page, elements));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Player>> getById(@RequestParam Long id) {

        try {
            return ResponseEntity.ok(playerService.getById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/asc")
    publilsc ResponseEntity<Page<Player>> getAllAsc(
            @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_ELEMENTS) int elements
    ) {
        try {
            return ResponseEntity.ok(playerService.getAllAsc(page, elements));

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
