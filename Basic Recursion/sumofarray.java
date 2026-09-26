class Solution {
    public int arraySum(int[] nums) {
        return sum(nums, 0);
    }

    public int sum(int[] nums, int i) {
        if (i == nums.length) {
            return 0;
        }

        return nums[i] + sum(nums, i + 1);
    }
}