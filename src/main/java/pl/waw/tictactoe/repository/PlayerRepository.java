package pl.waw.tictactoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.waw.tictactoe.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
