//1. Expand window using right pointer.
//2. If duplicate exists, shrink window using left pointer until valid.
//3. Store current window characters in HashSet for fast duplicate checking.
//4. Update maximum length after every valid window.
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