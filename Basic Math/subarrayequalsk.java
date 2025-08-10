class Solution {
    public int subarraySum(int[] nums, int k) {
    int [] prefixsum = new int [nums.length+1];
    for (int i =0;i<nums.length;i++)
    {
        prefixsum[i+1] = prefixsum[i]+nums[i];
    }
    int count =0;
    for (int start = 0; start<nums.length;start++)
    {
        for (int end = start; end<nums.length;end++)
        {
            if(prefixsum[end+1]- prefixsum[start]==k)
            count++;
        }
    }
    
   return count;
}
}
