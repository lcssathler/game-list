package com.devsuperior.gamelist.services;

import com.devsuperior.gamelist.dto.GameListDTO;
import com.devsuperior.gamelist.entities.GameList;
import com.devsuperior.gamelist.projections.GameMinProjection;
import com.devsuperior.gamelist.repositories.GameListRepository;
import com.devsuperior.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).collect(Collectors.toList());
    }
    @Transactional
    public void move(Long idList, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(idList);
        GameMinProjection gameToAlocate = list.remove(sourceIndex);
        list.add(destinationIndex, gameToAlocate);
        
        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);
        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(idList, list.get(i).getId(), i);
        }
    }
}
