class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Base case: There is nothing to the left of the first element
        ans[0] = 1; 

        // Step 1: Directly store prefix products into the ans array
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }   

        // Step 2: Traverse backwards and calculate suffix on the fly
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;      // Multiply existing prefix by current suffix
            suffix *= nums[i];     // Update suffix by including current number for the next left element
        }

        return ans;
    }
}
