package by.minsk.epam.javaweb.radkevich.lesson1.basketBall;

public class Program {
    public static void main(String[] args) {
        Basket basket = new Basket(10);
        System.out.println(basket);

        System.out.println(basket.getBlueBallsWeight());
        System.out.println(basket.getBlueBallsCount());
    }
}
