// Fixed Sliding Window
// 1. Create first window of size k
// 2. Slide window by:
//    - removing left element
//    - adding next right element
// 3. Track maximum average
class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        int sum=0;
        int left=0,right=k-1;
        for(int i=left;i<=right;i++)
            {
             sum+=nums[i];
            }
            avg=(double) sum/k;
        while(right<nums.length-1)
        {
            sum-=nums[left];
             left++;
            right++;
            sum+=nums[right];
            avg=Math.max(avg,(double)sum/k);

            
        }
        return avg;

    }
}