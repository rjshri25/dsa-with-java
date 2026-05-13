//HashSet and Adjacent elements sum 
class FindSubarrays( {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0,count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum=nums[i]+nums[i+1];
            if(set.contains(sum))
              return true;
             else
              set.add(sum);
            
        }
    return false;
    } 
}