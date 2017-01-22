import java.util.*;
import java.lang.*;
import java.util.*;
import java.io.*;
  
  
class AdamNumber
{
      int CountNumberOfDigits(int n)
      {
         int numdgits = 0;
         do
         {
            n = n / 10;
            numdgits++;
         }
         while (n > 0);
         return numdgits;
      }
 
      int ReverseNumber(int n)
      {
         int i = 0, result = 0;
         int numdigits = CountNumberOfDigits(n);
         for (i = 0; i < numdigits; i++)
         {
            result *= 10;
            result += n % 10;
            n = n / 10;
         }
         return result;
      }
  
      public static void main(String[] args)
      {      
         System.out.println("Enter the total numbers:");
         AdamNumber an = new AdamNumber();
         int i, n, rn;
         int sn, rsn, rrsn;
         System.out.println("List of Adam Numbers under 1000\n");
         for (i = 10; i < 1000; i++)
         {
            n = i;
            rn = an.ReverseNumber(i);
            if (n == rn)
               continue;
            sn = n * n;
            rsn = rn * rn;
            rrsn = an.ReverseNumber(rsn);
            if (rrsn == sn)
            {
               System.out.format("%3d\n", n);
            }
         } 
      }
}