package player.actual;

import player.Choice;
import player.Player;
import player.Strategy;

import java.util.List;

import static player.Choice.STOP;
import static player.Choice.BID;
import static player.Strategy.THE_FAR_AWAYS;

public class TheFarAwaysPlayer extends Player {
  @Override
  public float play(float bid) {
    Choice result = Choice.random();
    if (result == Choice.BID) {
      return bid + 5f;
    } else {
      return bid + 0f;
    }
  }

  @Override
  public Strategy getStrategy() {
    return THE_FAR_AWAYS;
  }
}
