// Convert 0 → -1 and 1 → +1 so equal 0s and 1s become sum = 0.
//Used HashMap to store the first index where each prefix sum appears.
//If the same sum appears again, calculate subarray length using i - previousIndex.
//Keep updating max length and return it as the answer.
class FindMaxLength {
    public int findMaxLength(int[] nums) {
       HashMap <Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       int sum=0,max=0;
       
       for(int i=0;i<nums.length;i++)
       {

      if(nums[i]==0)
        sum+=-1;
      else sum+=1;
       if(map.containsKey(sum))
           {
      int len=i-map.get(sum);
      max=Math.max(len,max);
           }
       else
       map.put(sum, i);   
       } 
      
    return max; 
    }
}