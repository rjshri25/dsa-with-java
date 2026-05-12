//Used Prefix Sum approach by continuously adding previous cumulative sum to current element.
//Updated the original array in-place to store running sums efficiently.
//Achieved O(n) time complexity without recalculating sums repeatedly.
class RunningSum {
    public int[] runningSum(int[] nums) {
        int runningSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
         nums[i]+=runningSum;
         runningSum=nums[i];
        }
return nums;
    }
}