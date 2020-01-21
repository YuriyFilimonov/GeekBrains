package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*Task 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0 */
        System.out.println("Task 1.");
        System.out.println("Задать целочисленный массив, состоящий из элементов 0 и 1.");
        System.out.println("С помощью цикла и условия заменить 0 на 1, 1 на 0.");

        Scanner scanner = new Scanner(System.in); // Займем пользователя какой-то работой
        int numbArr;
        while (true){
            System.out.print("Задайте длину массива от 2 до 20: ");
            numbArr = scanner.nextInt();
            if (numbArr >= 2 && numbArr <= 20)
                break;
        }

        int[] arr1 = new int[numbArr]; //Объявляем массив

        for (int i = 0; i < numbArr; i++) //Заполняем его числами 0 и 1
            arr1[i] = (int) Math.round(Math.random());

        System.out.println("Исходный массив: " + Arrays.toString(arr1));

        for (int i = 0; i < numbArr; i++) { //Трансформируем массив
            if (arr1[i] == 0)
                arr1[i] = 1;
            else
                arr1[i] = 0;
        }

//        arr1[i] = arr1[i] == 1? 0:1;

        System.out.println("Трансформированный массив: " + Arrays.toString(arr1));
        System.out.println();

        /* Task 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями:
        0 3 6 9 12 15 18 21 */
        System.out.println("Task 2.");
        System.out.println("Задать пустой целочисленный массив размером 8.");
        System.out.println("С помощью цикла заполнить его значениями: 0 3 6 9 12 15 18 21");

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = i * 3;

        System.out.println("Массив заполнен: " + Arrays.toString(arr2));
        System.out.println();

        /* Task 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        пройти по нему циклом, и числа меньшие 6 умножить на 2 */
        System.out.println("Task 3.");
        System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],");
        System.out.println("пройти по нему циклом, и числа меньшие 6 умножить на 2.");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //Создаем

        System.out.println("Исходный массив: " + Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++){ //Преобразуем
            if (arr3[i] < 6)
                arr3[i] *= 2;
        }

        System.out.println("Трансформированый массив: " + Arrays.toString(arr3));
        System.out.println();

        /* Task 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами */
        System.out.println("Task 4.");
        System.out.println("Создать квадратный двумерный целочисленный массив.");
        System.out.println("С помощью цикла(-ов) заполнить его диагональные элементы единицами.");

        int[][] arr4 = new int[numbArr][numbArr]; //Используем уже инициализированную переменную numbArr
        for (int i = 0, j = arr4.length - 1; i < arr4.length; i++, j--){ //Вставляем по диагоналям 1
            arr4[i][i] = 1;
            arr4[i][j] = 1;
        }

        System.out.println("Массив заполнен:");
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4.length; j++)
                System.out.print(arr4[i][j] + "\t");
            System.out.println();
        }
        System.out.println();

        /* Task 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы. */
        System.out.println("Task 5.");
        System.out.println("Задать одномерный массив и найти в нем минимальный и максимальный элементы.");

        int[] arr5 = new int[numbArr]; //Используем уже инициализированную переменную numbArr
        arrFill(arr5); //Заполняем массив случайными числами с помощью метода
        int min = 10, max = 0;
        int minCount = -1, maxCount = -1;
        for (int i = 0; i < arr5.length; i++) { //В цикле ищем значения min и max
//            if (arr5[i] < min) {
//                min = arr5[i];
//                minCount = i;
//            }
//            if (arr5[i] > max) {
//                max = arr5[i];
//                maxCount = i;
//            }
            min = Math.min(min, arr5[i]);
            max = Math.max(max, arr5[i]);
        }

        System.out.println("Массив заполнен: " + Arrays.toString(arr5));
        System.out.println("Минимальное значение - " + min + " и находится в элементе № " + minCount);
        System.out.println("Максимальное значение - " + max + " и находится в элементе № " + maxCount);
        System.out.println();

        /* Task 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
        true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
        checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
        символами ||, эти символы в массив не входят. */
        //Переформатируя задачу можно проводить экспериментальные исследования по теории вероятности
        System.out.println("Task 6.");
        System.out.println("Задать метод, осуществляющий поиск равенства суммы левой и правой части массива.");
        System.out.println("Граница левой и правой части массива может проходить в любом месте массива");

        for (int i = 2; i < 11; i++) {
            int[] arr6 = new int[i]; //Создаем и заполняем массив с помощью метода
            arrFill(arr6);
            System.out.println("Вариант массива из " + i + " элементов: " + Arrays.toString(arr6));
            if (summLeftRight(arr6)) //Если нашли равенство с помощью метода
                System.out.println("Массив имеет равенство сумм левой и правой части\n");
            else //Если равенства нет
                System.out.println("Равенства сумм левой и правой части массива не обнаружено\n");
        }

        /* Task 7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        или отрицательным), при этом метод должен сместить все элементы массива на n позиций. */
        System.out.println("Task 7.");
        System.out.println("Написать метод, которому на вход подается одномерный массив и число n,");
        System.out.println("при этом метод должен сместить все элементы массива на n позиций.");

        int n;
        while (true){
            System.out.print("Задайте число от -10 до +10, на которое будет сдвинут массив: ");
            n = scanner.nextInt();
            if (n >= -10 && n <= 10)
                break;
        }
        scanner.close();

        int[] arr7 = new int[numbArr]; //Создаем исходный массив
        arrFill(arr7); //Заполняем исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(arr7));
        int[] arr7rewind; //Создаем пустой массив для вложения в него трансформированного массива
        arr7rewind = rewind(arr7, n); //Передаем ссылку на трансформированный массив с помощью метода
        if (n > 0)
            System.out.println("Элементы массива смещены вправо на " + n + " шагов: " + Arrays.toString(arr7rewind));
        else  if (n < 0)
            System.out.println("Элементы массива смещены влево на " + n + " шагов: " + Arrays.toString(arr7rewind));
        else
            System.out.println("Элементы массива не смещены: " + Arrays.toString(arr7rewind));
    }

    // Task 5. Метод. Заполнение массива случайными числами
    private static void arrFill(int[] array){
        for (int i = 0; i < array.length; i++)
            array[i] = (int) Math.round(Math.random() * 10);
    }

    // Task 6. Метод. Поиск равенства сумм левой и правой частей массива
    private static boolean summLeftRight(int[] array){
        int summLeft = 0;
        for (int i = 0; i < array.length; i++){
            int summRight = 0;
            summLeft += array[i];
            for (int j = i + 1; j < array.length; j++)
                summRight += array[j];
            if (summLeft == summRight)
                return true;
        }
        return false;
    }

    // Task 7. Метод. Прокрутка массива на n шагов.
    private static int[] rewind(int[] array, int n) { //В метод добавлен целочисленный аргумент - количество итераций
        if (n > 0) {
            for (int i = 0; i < Math.abs(n)%array.length; i++) {
                int t = array[0];
                int step;
                array[0] = array[array.length - 1];
                for (int j = 1; j < array.length; j++) {
                    step = array[j];
                    array[j] = t;
                    t = step;
                }
                System.out.println("На шаге " + (i + 1) + " массив: " + Arrays.toString(array));
            }
        } else if (n < 0){
            for (int i = 0; i < Math.abs(n)%array.length; i++) {
                int t = array[array.length - 1];
                int step;
                array[array.length - 1] = array[0];
                for (int j = array.length-2; j >= 0 ; j--) {
                    step = array[j];
                    array[j] = t;
                    t = step;
                }
                System.out.println("На шаге " + (i + 1) + " массив: " + Arrays.toString(array));
            }
        }
        return array;
    }
}
