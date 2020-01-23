package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random randomWord = new Random();

        boolean flag = false;
        System.out.println("Игра \"Угадай слово\"");

        do {
            int indexRandomWord = randomWord.nextInt(words.length - 1);
            String referens = words[indexRandomWord];
            System.out.println("Перед Вами - массив слов, из которвых генератор случайных чисел выбрал одно слово.");
            System.out.println(Arrays.toString(words));

            System.out.print("Какое слово загадал генератор? Напишите: ");
            Scanner scanWord = new Scanner(System.in);
            String guessWord = scanWord.next();
            scanWord.close();
            System.out.println(guessWord + "\t" + referens);

            wordComparison(referens, guessWord);
        } while (flag);
    }

    private static void wordComparison(String referens, String guessWord) {
        if (guessWord.equals(referens)) System.out.println("Вы угадали! Сгенерированное слово: " + referens);
        else {
            int j = 0;
            char gw;
            char ref;
            System.out.println("Не угадали");
            System.out.println("Посмотрим, есть ли в Вашем и сгенерированном словах совпадающие буквы?");
            System.out.print("Вот результат сравнения: ");
            for (int i = 0; i < 15; i++) {
                if (i < guessWord.length() && i < referens.length()) {
                    gw = guessWord.charAt(i);
                    ref = referens.charAt(i);
                    if (gw == ref) {
                        System.out.print(gw);
                        j++;
                    } else System.out.print('#');
                } else System.out.print('#');
            }
            System.out.println("\nСовпадающих букв: " + j);
            System.out.print("Желаете продолжить угадывать слово? Да - 1/нет - любая клавиша");
            Scanner scanChoice = new Scanner(System.in);
            int choiceContinue = scanChoice.nextInt();
            scanChoice.close();
            if (choiceContinue == 1) wordComparison(referens, guessWord);
        }
    }
}
