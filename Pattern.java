
/**
 * Print out patterns in multiplication.
 *
 */

public class Pattern
{
    public static long power_int(int a, int n)     
    {        
        // Answer         
        long answer = 1;                

        for (int iter=0; iter<n; ++iter)         
        {            
            answer *= a;        
        }
        return answer;
}

    // Returns a number with all ones of length n 
    public static long getOnes(int n) 
    {
        long number = 0; 
        for (int i=0; i<n; i++) 
        {
            number += power_int(10, i);
        } 
        return number;
    }
    
    public static void main(String[] args)
    {
        for (int i=1; i<10; i++)
        {
            long ones = getOnes(i);
            System.out.println(ones + "*" + ones + " = " + ones*ones);
        }
        System.out.println();
        for (int i=1; i<10; i++)
        {
            long ones = getOnes(i);
            long twos = 2*ones;
            long threes = 3*ones;
            System.out.println(twos + "+" + "(" + threes + ")^2 = " 
                + (twos + threes*threes));
        }
    }
}
