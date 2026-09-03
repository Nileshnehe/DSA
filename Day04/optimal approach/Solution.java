class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Base cases: products with nothing next to them start at 1
        prefix[0] = 1;
        suffix[n-1] = 1;

        // 1. Calculate all Prefix products (Left to Right)
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // 2. Calculate all Suffix products (Right to Left)
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // 3. Combine them into the final answer array
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}
