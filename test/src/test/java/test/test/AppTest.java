package test.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
	System.out.println("it is true");
        assertTrue( true );
    }

    @Test
    public void shouldFail()
    {
	System.out.println("it is false");
        assertTrue( false );
    }
    
    @Test
    public void shouldBla()
    {
	System.out.println("blaaa");
        assertTrue( true );
    }

}
