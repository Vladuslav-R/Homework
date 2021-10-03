package by.minsk.epam.javaweb.radkevich.lesson1.basketBall;


import java.util.Arrays;

public class Basket {
    public Ball[] balls;

    public Basket(int totalBalls) {
        balls = new Ball[totalBalls];
        for (int i = 0; i < totalBalls; i++) {
            balls[i] = new Ball();
        }
    }

    public int getBlueBallsWeight() {
        int sum = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].color == BallColor.BLUE) {
                sum += balls[i].weight;
            }
        }
        return sum;
    }

    public int getBlueBallsCount() {
        int sum = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].color == BallColor.BLUE) {
                sum++;
            }


        }
        return sum;
    }

    @Override
    public String toString() {
        return Arrays.toString(balls);
    }
}

