import java.util.*;

public class Dice implements Rollable {

  int numberOfSides;

  public Dice(int numberOfSides) {
    this.numberOfSides = numberOfSides;
  }

  public int roll(){
    int tempStore = randomNumber(1, this.numberOfSides);
    return tempStore;
  }

  private int randomNumber(int min, int max){
    Random rand = new Random();
    int result = rand.nextInt((max - min) + 1) + min;
    return result;
  }
}
