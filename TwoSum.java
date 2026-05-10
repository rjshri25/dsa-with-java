//Two pointer technique
//Opposite direction pointer
// Since array is sorted:
// if sum is greater than target -> move right pointer left
// if sum is smaller than target -> move left pointer right
class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
         int sum= numbers[left]+numbers[right]  ;
         if(sum==target)
           return new int[]{left+1,right+1};
          else if(sum>target)
           right--;
           else
           left++;        

        }
        return new int[]{};
    }
}