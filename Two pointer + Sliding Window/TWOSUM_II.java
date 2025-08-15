class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right = numbers.length-1;
        
        while(left<right)
        {
        int sum = numbers[left] + numbers[right];
        

        if(sum == target)
        {
           return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++; // need bigger sum
            } else {
                right--; // need smaller sum
            }
        }

     return new int[]{-1, -1}; // not found case (shouldn't happen in LC 167)
    }
}
    
