package by.minsk.epam.javaweb.radkevich.task2.basketBall;

public class Program {

    public static void main(String[] args) {

        {
            System.out.println("1");
        }

        Basket basket = new Basket(10);
        System.out.println(basket);

        System.out.println(basket.getBlueBallsWeight());
        System.out.println(basket.getBlueBallsCount());
    }
}
