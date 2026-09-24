
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class test32 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        test32 solver = new test32();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
