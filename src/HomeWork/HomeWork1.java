package HomeWork;

class HomeWork1{
    public static void main(String[] args) { //Задание 1. Пустой проект с методом "main"

        System.out.println("Задание 1.\nПустой проект с методом \"main\"");
        System.out.println("public static void main(String[] args) {}\n");

        //Задание 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte bt = (byte) Math.round(Math.random() *255 - 128);
        short sh = (short) Math.round(Math.random() *64000 - 32000);
        int i = (int) Math.round(Math.random() * 2000000000 - 1000000000);
        long l = Math.round(Math.random() * 2000000000 - 1000000000);
        float fl = (float) Math.random() * 2000000000 - 1000000000;
        double db = Math.random() * 2000000000 - 1000000000;
        char ch = (char) ('A' + Math.round(Math.random() * 64));
        boolean flag = false;
        String[][] s = {//Ссылочная переменная двухмерного массива строк
                {"byte", "short", "int", "long", "float", "double", "char", "boolean", "String"},
                {"bt", "sh", "i", "l", "f", "d", "ch", "flag", "s"}
        };

        System.out.println("Задание 2.\nПеременные примитивных типов");
        System.out.println("type\tvariable\tvalue");
        System.out.println(s[0][0] + "\t" + s[1][0] + "\t\t\t" + bt);
        System.out.println(s[0][1] + "\t" + s[1][1] + "\t\t\t" + sh);
        System.out.println(s[0][2] + "\t\t" + s[1][2] + "\t\t\t" + i);
        System.out.println(s[0][3] + "\t" + s[1][3] + "\t\t\t" + l);
        System.out.println(s[0][4] + "\t" + s[1][4] + "\t\t\t" + fl);
        System.out.println(s[0][5] + "\t" + s[1][5] + "\t\t\t" + db);
        System.out.println(s[0][6] + "\t" + s[1][6] + "\t\t\t" + ch);
        System.out.println(s[0][7] + "\t" + s[1][7] + "\t\t" + flag + "\n");

        System.out.println("Значения ссылочной переменной двухмерного массива строк");
        for (int j = 0; j<s[0].length; j++){
            System.out.println(s[0][j] + "\t\t" + s[1][j]);
        }
        System.out.println();

        //Нескучная инициализация переменных для Задания 3
        float a = Math.round(Math.random() * 200 - 100); //Округлил для красоты вывода результата
        float b = Math.round(Math.random() * 200 - 100);
        float c = Math.round(Math.random() * 200 - 100);
        float d = Math.round(Math.random() * 200 - 100);

        System.out.println("Задание 3.\nРешение арифметического выражения");
        System.out.println(a + "*(" + b + " + (" + c + "/" + d + ")) = " + ariphExp(a, b, c, d) + "\n");

        //Нескучная инициализация переменных для Задания 4
        int e = (int) Math.round(Math.random() * 15); //Переменной можно присвоить другое имя, но так выгдядит понятнее
        int f = (int) Math.round(Math.random() * 15);

        System.out.println("Задание 4.\nРешение арифметического выражения с оператором ветвления");
        System.out.println(e + " + " + f + " = " + (e+f) + " Значение метода summIf = " + summIf(e, f) + "\n");

        //Для задания 5 подойдет переменная i
        System.out.println("Задание 5.\nПроверка знака целого числа");
        numSign(i);

        //Для задания 6 подойдет переменная i
        System.out.println("Задание 6.\nПроверка знака целого числа с использованием вывода методом булевого значения");
        if (negativNum(i))
            System.out.println("Метод \"negativNum\" получил отрицательное число: " + i + "\n");
        else
            System.out.println("Метод \"negativNum\" получил положительное число: " + i + "\n");

        //Для задания 7 создадим переменную из массива имен и выберем случайтое имя
        String[] nameRandom = {"Александр", "Борис", "Владимир", "Георгий", "Дмитрий"};
        int indName = (int) Math.round(Math.random() * 4);
        String helloName = nameRandom[indName];
        System.out.println("Задание 7.\nВ приветствие добавим случайное имя из массива имен");
        helloName(helloName);

        //Нескучная инициализация переменной для Задания 8
        int y = (int) Math.round(Math.random() * 2100); //Здесь мы получим случайный год от 0 до 2100
        System.out.println("Задание 8.\nСлучайно выбирается значение года от 0 до 2100 включительно.\nМетод " +
                "\"leanYear\" определяет является он високосным или нет.");
        leatYear(y);
    }

    /* Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.*/
    private static float ariphExp(float a, float b, float c, float d){
        return a*(b + c/d);
    }

    /* Задание 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
    лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
    */
    private static boolean summIf(int e, int f){
        if((e + f < 10) || (e + f > 20))
            return false;
        else
            return true;
    }

    /*Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом*/
    private static void numSign(int g){
        if(g < 0)
            System.out.println("Метод \"numSign\" получил отрицательное число: " + g + "\n");
        else
            System.out.println("Метод \"numSign\" получил положительное число: " + g + "\n");
    }

    /*Задание 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное*/
    private static boolean negativNum(int h){
        if(h < 0) {
            return true;
        }
        return false;
    }

    /*Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен
    вывести в консоль сообщение «Привет, указанное_имя!»*/
    private static void helloName(String str){
        System.out.println("Привет " + str + "!\n");
    }

    /*Задание 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный*/
    private static void leatYear(int y){
        if((y >= 400) && (y%400 == 0))
            System.out.println("Год " + y + " является високосным");
        else if ((y >= 100) && (y%100 == 0))
            System.out.println("Год " + y + " не является високосным");
        else if ((y >= 4) && (y%4 == 0))
            System.out.println("Год " + y + " является високосным");
        else
            System.out.println("Год " + y + " не является високосным");
    }
}