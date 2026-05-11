//First window → calculate initial vowels
//Then slide window:
//remove left character
//add right character
//update max
class MaxVowels {
    public int maxVowels(String s, int k) {
        int left=0;int right=k-1;
        int count=0;
        int maxCount;
        if (k > s.length()) return 0;
        for(int i=left;i<=right;i++)
        {
            char c=s.charAt(i);
            if( c=='a' || c =='e'|| c == 'i'|| c == 'o'|| c == 'u' )
              count++;
             
        }
         maxCount = count;
      
     while(right<s.length()-1)
     {
      char c=s.charAt(left);
      if(c=='a' || c =='e'|| c == 'i'|| c == 'o'|| c == 'u' )
        count--;
      left++;
      right++;
      c=s.charAt(right);
      if(c=='a' || c =='e'|| c == 'i'|| c == 'o'|| c == 'u')
      count++;

       maxCount = Math.max(maxCount, count); 

     } 
      return maxCount;     
             }

}