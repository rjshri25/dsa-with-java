class PivotIndex {
    public int pivotIndex(int[] nums) {

     int n=nums.length;
     int suffix[]=new int[n];
     int prefix[]=new int[n]; 
   
     prefix[0]=0;
     for(int i=1;i<n;i++)
     {
        prefix[i]=nums[i-1]+prefix[i-1];
     }

     suffix[n-1]=0;
     for(int i=n-2;i>=0;i--)
     {
     suffix[i]=suffix[i+1]+nums[i+1];

     }

     for(int i=0;i<nums.length;i++)
     {
        if(prefix[i]==suffix[i])
          return i;
     }
     return -1;
    }
}