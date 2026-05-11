class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int right;
        int left=0;
          int maxCount=0;
          for(right=0;right<s.length();right++)
          {
            char c=s.charAt(right);
          while(set.contains(c))
         {
            set.remove(s.charAt(left));
          left++;
                  
         } 
         set.add(c);
         maxCount=Math.max( maxCount,right-left+1);

          }
    
   return maxCount;
    }

}