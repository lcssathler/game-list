package com.devsuperior.gamelist.repositories;

import com.devsuperior.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
