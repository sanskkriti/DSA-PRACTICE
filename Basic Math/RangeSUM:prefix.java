class NumArray {
    private int[] prefixSum;
    //prefix sum formula prefixsum[i] =  prefixsum[i+1] + arr[i]
    // Constructor: Build prefix sum
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1]; // +1 to store sum before index 0
        prefixSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    // Query: O(1) time
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
