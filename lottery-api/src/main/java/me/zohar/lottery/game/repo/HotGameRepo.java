package me.zohar.lottery.game.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import me.zohar.lottery.game.domain.HotGame;

public interface HotGameRepo extends JpaRepository<HotGame, String>, JpaSpecificationExecutor<HotGame> {

	List<HotGame> findTop5By();
}
