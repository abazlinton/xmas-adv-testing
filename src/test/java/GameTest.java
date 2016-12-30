import org.junit.*;
import static org.junit.Assert.*;

import org.mockito.*;
import static org.mockito.Mockito.*;


public class GameTest {

  Game game;
  Rollable dice;
  Rollable spyDice;

  @Before
  public void before(){
    dice = new Dice(6);
    spyDice = Mockito.spy(dice);
    game = new Game(spyDice);
  }

  @Test
  public void testTakeTurn(){
    Mockito.when(spyDice.roll()).thenReturn(2);
    assertEquals(false, game.nextTurn());
  }

  @Test
  public void testTakeTurn2(){
    Mockito.when(spyDice.roll()).thenReturn(3);
    assertEquals(true, game.nextTurn());
  }

}
