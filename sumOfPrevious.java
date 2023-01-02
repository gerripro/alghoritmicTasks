class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int num = 0; num < length; num++) {
            int currentNum = nums[num];
            int numToAdd = currentNum;
            if (num != 0) {
                numToAdd = currentNum + result[num-1];
            }
            result[num] = numToAdd;
        }
        return result;
    }
}
