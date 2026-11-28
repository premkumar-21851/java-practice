class Solution {
    public boolean isStrictlyPalindromic(int n) {
       for(int base =2;base<=n-2;base++)
       {
           int num=n;
           String result="";

           while(num>0)
           {
               int rem = num%10;
               result+=rem;

               num=num/base;
           }
           String reverse = new StringBuilder(result).reverse().toString();

           if(!(result.equals(reverse)))
               return false;
       } 

       return true;
    }
}