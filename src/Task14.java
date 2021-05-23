public class Task14 {

    public static void main(String[] agrs) {
        long a = 7893823445l;
        long sum = 0l;
        do {
            sum = sum + a % 10;
            a = a / 10;
        } while (a != 0);

        System.out.println(sum);

    }
}
