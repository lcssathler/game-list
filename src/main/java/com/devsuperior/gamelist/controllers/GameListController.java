package com.devsuperior.gamelist.controllers;

import com.devsuperior.gamelist.dto.GameListDTO;
import com.devsuperior.gamelist.dto.GameMinDTO;
import com.devsuperior.gamelist.dto.ReplacementDTO;
import com.devsuperior.gamelist.services.GameListService;
import com.devsuperior.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> all = gameListService.findAll();
        return all;
    }

    @GetMapping(value = "/{idList}/games")
    public List<GameMinDTO> findByList(@PathVariable Long idList) {
        return gameService.findByList(idList);
    }


    @PostMapping(value = "/{idList}/replacement")
    public void move(@PathVariable Long idList, @RequestBody ReplacementDTO body) {
        gameListService.move(idList, body.getSourceIndex(), body.getDestinationIndex());
    }
}
