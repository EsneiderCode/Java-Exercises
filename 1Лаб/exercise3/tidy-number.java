public class Solution
{
    public static boolean tidyNumber(int number)
    {
      int previous = 10;

        while (number>0)
        {
            int rem = number % 10;
            number /= 10;
            if (rem > previous)
               return false;
            previous = rem;
        }
 
      
        return true; // Do your magic!
    }
}
