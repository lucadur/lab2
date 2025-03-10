import com.sun.jdi.connect.Connector;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Je suis un jeu de chiffre et je tente de deviner le nombre entre 1 et 100");
        System.out.println("Veuillez entrer votre chiffre:");

        Scanner scanner = new Scanner(System.in);

        while (guess != targetNumber) {
            guess = scanner.nextInt();
            if (guess > targetNumber) {
                System.out.println("Votre chiffre est trop grand");
            } else if (guess < targetNumber) {
                System.out.println("Votre chiffre est trop petit");
            } else if (guess == targetNumber) {
                System.out.println("Bravo!");
                break;
            }
            System.out.println("Veuillez entrer un autre chiffre:");
        }
        scanner.close();
    }
}