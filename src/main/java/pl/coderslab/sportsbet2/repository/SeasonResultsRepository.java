package pl.coderslab.sportsbet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.sportsbet2.model.sportEvent.Season;
import pl.coderslab.sportsbet2.model.sportEvent.SeasonResult;

import java.util.List;

@Repository
public interface SeasonResultsRepository extends JpaRepository<SeasonResult, Integer> {

//    @Query("select r from Result r where r.season=?1 order by r.points desc, (r.getGoalsScoredHome+r.goalsScoredAway) desc")
//    List<SeasonResult> findAllBySeasonAndSort(Season season, Sort points);
    List<SeasonResult> findAllBySeasonOrderByPointsDesc(Season season);
}
