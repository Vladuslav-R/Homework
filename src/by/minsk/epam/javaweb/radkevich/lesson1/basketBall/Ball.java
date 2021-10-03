package by.minsk.epam.javaweb.radkevich.lesson1.basketBall;

import java.util.concurrent.ThreadLocalRandom;

public class Ball {
  public int weight;
  public BallColor color;

  public Ball() {
    weight = ThreadLocalRandom.current().nextInt(1, 10);
    color = (weight % 2 == 0) ? BallColor.RED : BallColor.BLUE;
  }

  @Override
  public String toString() {
    return "{" + color + "," + weight + "}";
  }
}