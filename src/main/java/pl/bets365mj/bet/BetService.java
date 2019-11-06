package pl.bets365mj.bet;

import pl.bets365mj.fixture.Fixture;

import java.util.List;

public interface BetService {

    Bet save(Bet bet);
    Bet findById(Integer betId);
    List<Bet> findAllByCouponId(int id);
    List<Bet> findAllByEventMatchday(int id);
    List<Bet> findAllByEvent(Fixture fixture);
    void updateBets(Fixture fixture);
}