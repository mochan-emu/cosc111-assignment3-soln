

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SumIntegersTest.
 *
 */
public class SumIntegersTest
{
    @Test
    public void TestSum5()
    {
        assertEquals(15, SumIntegers.SumIntegers(5));
    }
    
    @Test
    public void TestSum0()
    {
        assertEquals(0, SumIntegers.SumIntegers(0));
    }
    
    @Test
    public void TestSum1()
    {
        assertEquals(1, SumIntegers.SumIntegers(1));
    }
    
    @Test
    public void TestSum10()
    {
        assertEquals(55, SumIntegers.SumIntegers(10));
    }
}
