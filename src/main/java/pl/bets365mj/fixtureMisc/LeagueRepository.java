package pl.bets365mj.fixtureMisc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {
    League findLeagueById(int id);
    League findByApiId(int id);

}
