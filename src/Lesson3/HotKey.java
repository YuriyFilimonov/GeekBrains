package Lesson3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotKey {
    public static void main(String[] args) {
        List<String[]> hotKeys = new ArrayList<String[]>();
        hotKeys.add(new String[] {"one", "tow", "three"});
        hotKeys.add(new String[] {"for", "five", "six"});
        hotKeys.add(new String[] {"seven", "eight", "nine"});

        for (String[] key : hotKeys) System.out.println(Arrays.toString(key));

    }
}

