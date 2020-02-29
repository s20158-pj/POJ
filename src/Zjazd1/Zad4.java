/*
Piramid from letters
Patryk Klimek
 */
import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letter = 'a';
        int number = 1;
        System.out.println("Podaj wielkość piramidy: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= number / 2; k++) {
                System.out.print((char) (letter + k) + " ");
            }
            for (int j = number / 2 - 1; j >= 0; j--) {
                System.out.print((char) (letter + j) + " ");
            }
            number = number + 2;
            letter = 'a';
            System.out.println();
        }

    }

}
