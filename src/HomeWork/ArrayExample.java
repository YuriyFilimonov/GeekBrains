package HomeWork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        for (int i = 0; i < 3; i++) {
            int y = -1;
            System.out.println("y = " + y);
            y++;
            System.out.println("y = " + y);
        }

        String[] arr = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(arr));

        double templateDouble = 12.1354678578862;

        System.out.println("Template double: " + templateDouble);
        double newDouble = new BigDecimal(templateDouble).setScale(3, RoundingMode.UP).doubleValue();

//        double newDouble = new BigDecimal(templateDouble).setScale(3, RoundingMode.UP).doubleValue();

        System.out.println("New double: " + newDouble);

    }
}
