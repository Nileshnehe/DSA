    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;

    public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                if (map.containsKey(complement)) {
                    return new int[] {map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            return new int[] {};
        }

        public static void main(String[] args) {
            TwoSum solver = new TwoSum();

            int[] nums = {2, 7, 11, 15};
            int target = 9;

            int[] result = solver.twoSum(nums, target);
            System.out.println("Output Indexes: " + Arrays.toString(result));
            // System.out.println("Output Indexes: " + result);

        }
    }



// Why this is a great  solution:
// Time Complexity: O(n) - We only pass through the array exactly one time.

// Space Complexity: O(n) - In the absolute worst-case scenario (where the match is at the very end of a massive array), we would store almost every element in the Hash Map.     