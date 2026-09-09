import java.util.Random;
import java.util.Scanner;
public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Random rng = new Random();
            int num1;
            int num2;
            int num3;

        num1 = rng.nextInt(10) + 1;
        num2 = rng.nextInt(10) + 1;
        num3 = rng.nextInt(10) + 1;

        System.out.println(num1 + " " + num2 + " " + num3);
            if (num1 == 7 || num2 == 7 || num3 == 7) {
                System.out.println("Winner!");
            } else {
                System.out.println("You Lose");
            }

    }
}
