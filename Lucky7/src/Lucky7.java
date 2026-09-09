import java.util.Random;
import java.util.Scanner;
public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int bank = 5;
        String input = "";
        Random rng = new Random();
            int num1;
            int num2;
            int num3;

        System.out.println("Current Bank Balace: " + bank + " Euros");
        System.out.println();

        while (bank > 0) {
            System.out.println("GAMBLING TIME!!!");
            System.out.println("1 Euro / Game");
            System.out.println("Press Enter to Play!");
                in.nextLine();
                bank--;

            num1 = rng.nextInt(10) + 1;
            num2 = rng.nextInt(10) + 1;
            num3 = rng.nextInt(10) + 1;
                System.out.println(num1 + " " + num2 + " " + num3);

                if (num1 == 7 && num2 == 7 && num3 == 7) {
                    System.out.println("MEGA JACKPOT!!!");
                    System.out.println("MEGA JACKPOT!!!");
                    System.out.println("MEGA JACKPOT!!!");

                    System.out.println("Payout: 100 Euros!");
                        bank = bank + 100;
                    System.out.println();
                } else
                    if (num1 == 7 && num2 == 7 || num1 == 7 && num3 == 7 || num2 == 7 && num3 == 7) {
                        System.out.println("Jackpot!!!");

                        System.out.println("Payout: 10 Euros");
                            bank = bank + 10;
                        System.out.println();
                    } else
                        if (num1 == 7 || num2 == 7 || num3 == 7) {
                            System.out.println("You Win!");

                            System.out.println("Payout: 3 Euros!");
                                bank = bank + 3;
                            System.out.println();
                        } else {
                            System.out.println("You Lose");
                            System.out.println();
                }
                System.out.println("Current Bank Balace: " + bank + " Euros");
                    if (bank == 0) {
                        System.out.println("You Lost All Your Money and Went Homeless :(");
                        System.out.println("G A M E  O V E R");
                        break;
                    }
;                System.out.println("Play Again? y/n");
                    input = in.nextLine();
                        if (input.equals("n")) {
                            break;
            }
        }
    }
}
