
/**
 * An application that asks for an integer and then sums up all
 * the numbers until that number.
 **/
 
import java.util.*;

public class SumIntegers
{
    public static int SumIntegers (int n)
    {
        int sum = 0;
        for (int i=0; i<=n; i++)
        {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int N = kb.nextInt();
        int sumN = SumIntegers(N);
        System.out.println("The sum of " + N + " integers is " + sumN + ".");
    }
}
