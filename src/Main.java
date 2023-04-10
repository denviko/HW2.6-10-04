import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> words = new ArrayList<>(List.of("abc", "abc", "bcd", "bcd", "a", "b"));

    public static void main(String[] args) {
        Task4();
    }

    public static void Task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }

    }

    public static void Task2() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;


        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }

        }


    }
    public static void Task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    public static void Task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());

    }

}




