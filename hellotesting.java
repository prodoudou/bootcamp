import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class hellotesting {

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

        }
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }
        return sum;
    }

    public static int approach1(int[] nums) {
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                sum += i + 1;
        }
        return sum;
    }

    public static int numberOfMatches(int n) {
        int matches = 0;
        int team = n;
        while (team > 1) {
            matches += team / 2;
            team = team % 2 == 0 ? team / 2 : team / 2 + 1;
        }
        return matches;
    }

    public static double isPerfectSquare(int num) {
        // Math.sqrt
        double guess = num / 2.0;

        while (guess * guess - num < 0.0001) {
            guess = (guess + num / guess) / 2.0;
        }

        return guess;

    }

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word : words1)
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        for (String word : words2)
            map2.put(word, map2.getOrDefault(word, 0) + 1);

        int count = 0;
        for (String word : words1)
            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1)
                count++;
        return count;
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(10);
        priorityQueue.add(15);
        priorityQueue.add(5);
        priorityQueue.add(20);

        System.out.println(priorityQueue);
        // System.out.println(priorityQueue.poll());

        int[] num1 = new int[] { 1, 2, 3, 2 };

        System.out.println(sumOfUnique(num1));
        System.out.println(approach1(num1));

        System.out.println(numberOfMatches(7));

        System.out.println(isPerfectSquare(16));

        String[] words1 = new String[] { "leetcode", "is", "amazing", "as", "is" };
        String[] words2 = new String[] { "amazing", "leetcode", "is" };
        System.out.println("");
        System.out.println(countWords(words1, words2));

        HashMap<String, Integer> hashmap = new HashMap<>();
        System.out.println("test");

        // List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        // int target = 2;
        // countPairs(nums, target);
        System.out.println(countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2));
    }
}
