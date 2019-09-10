package pl.coderslab.sportsbet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.sportsbet2.model.sportEvent.Team;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Team findTeamById(int id);
    Team findTeamByName(String name);
    List<Team> findAll();
}
