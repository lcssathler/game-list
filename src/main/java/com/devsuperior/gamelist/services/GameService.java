package com.devsuperior.gamelist.services;

import com.devsuperior.gamelist.dto.GameMinDTO;
import com.devsuperior.gamelist.entities.Game;
import com.devsuperior.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameMinDTO(game)).collect(Collectors.toList());
    }
}
