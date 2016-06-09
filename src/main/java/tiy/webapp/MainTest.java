package tiy.webapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Tisha868 on 6/3/16.
 */
public class MainTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void makeChocolateTest1() throws Exception {
        Main test = new Main();

        int small = 4 ;

        int big = 1;

        int goal = 9;

        ChocolateSolution actualValue = test.makeChocolate(small, big, goal);

        assertEquals(4, actualValue.smalls);

    }



    @Test

    public void makeChocolateTest2() throws Exception { //
        Main test = new Main();

        int small = 4 ;

        int big = 1;

        int goal = 10;

        ChocolateSolution actualValue = test.makeChocolate(small, big, goal);

        assertEquals(-1, actualValue.smalls);
        assertEquals(-1, actualValue.bigs);

    }



    @Test

    public void makeChocolateTest3() throws Exception {

        Main test = new Main();

        int small = 4 ;

        int big = 1;

        int goal = 7;

        ChocolateSolution actualValue = test.makeChocolate(small, big, goal);

        assertEquals(2, actualValue.smalls);
        assertEquals(1, actualValue.bigs);

    }



    @Test

    public void makeChocolateTest4() throws Exception {
        Main test = new Main();

        int small = 6 ;

        int big = 2;

        int goal = 10;

        ChocolateSolution actualValue = test.makeChocolate(small, big, goal);

        assertEquals(0, actualValue.smalls);
        assertEquals(2, actualValue.bigs);

    }

}