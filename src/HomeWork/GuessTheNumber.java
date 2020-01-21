package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"");
        System.out.println("Генерируется случайное число от 0 до 9. Угадайте число за 3 попытки");
        int nextOver, n = 3;

        do {
            int randomNumber = random.nextInt(9);
            for (int i = 0; i < n; i++) {
                if (comparison(sc, randomNumber, i)) break;
                if (i == (n - 1)) System.out.println("Вы проиграли. Загадано число: " + randomNumber);
            }
            System.out.print("Повторить игру еще раз? 0 - нет, да - любое другое число: ");
            nextOver = sc.nextInt();
        } while (nextOver != 0);

    }

    private static boolean comparison(Scanner sc, int randomNumber, int i) {
        int variant;
        System.out.println("Раунд " + (i + 1));
        System.out.print("Введите число от 0 до 9: ");
        variant = sc.nextInt();
        if (variant < randomNumber)
            System.out.println("Число " + variant + " меньше заданного!");
        else if (variant > randomNumber)
            System.out.println("Число " + variant + " больше заданного!");
        else {
            System.out.println("Вы угадали с " + (i + 1) + " попыток. Загадано число " + randomNumber);
            return true;
        }
        return false;
    }
}