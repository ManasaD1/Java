import java.util.*;

public class test36 {
    public static void main(String[] args) {
        int[] a = { 3, 1, 7, 7, 1, 7, 7, 1, 4, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int pairs = 0;
        for (int count : map.values()) {
            pairs += count / 2;
        }
        System.out.println(pairs);

    }
}
