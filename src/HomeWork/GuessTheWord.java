package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        //Создаем массив типа String
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random randomWord = new Random(); //Запускаем объект Random
        Scanner scanWord = new Scanner(System.in); //Запускаем объект Scaner
        String flag; //Флаг продолжения игры. Выбран тип String, чтобы можно было нажимать на любую клавишу

        System.out.println("Игра \"Угадай слово\"");

        do {
            int indexRandomWord = randomWord.nextInt(words.length - 1);
            String referens = words[indexRandomWord];

            wordComparison(words, referens, scanWord); //Метод выполняет условие игры

            System.out.print("Желаете продолжить игру? Да - 1/нет - любая клавиша: ");
            flag = scanWord.next();
        } while (flag.equals("1"));
        scanWord.close();
    }

    private static String getWord(String[] words, String referens, Scanner scanWord) {
        System.out.println("Перед Вами - массив слов, из которых генератор случайных чисел выбрал одно слово.");
        System.out.println(Arrays.toString(words));

        System.out.print("Какое слово загадал генератор? Напишите: ");
        String guessWord = scanWord.next();
        System.out.println(guessWord + "\t" + referens); //Подсказка для теста
        return guessWord;
    }

    private static void wordComparison(String[] words, String referens, Scanner scanWord) {
        String guessWord = getWord(words, referens, scanWord); //Метод принимает ответы игрока
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
            System.out.print("Желаете продолжить угадывать слово? Да - 1/нет - любая клавиша: ");
            String choiceContinue = scanWord.next();
            //Хотел где-то втиснуть рекурсию. С таким функционалом не очень удобно, зато рекурсия работает.
            if (choiceContinue.equals("1")) wordComparison(words, referens, scanWord);
        }
    }
}
