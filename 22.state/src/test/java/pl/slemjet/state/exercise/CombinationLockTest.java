package pl.slemjet.state.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationLockTest {

    @Test
    public void testSuccess()
    {
        CombinationLock cl = new CombinationLock(new int[]{1, 2, 3, 4});
        assertEquals("LOCKED", cl.status);

        cl.enterDigit(1);
        assertEquals("1", cl.status);

        cl.enterDigit(2);
        assertEquals("12", cl.status);

        cl.enterDigit(3);
        assertEquals("123", cl.status);

        cl.enterDigit(4);
        assertEquals("OPEN", cl.status);
    }

    @Test
    public void testFailure()
    {
        CombinationLock cl = new CombinationLock(new int[]{1, 2, 3});

        assertEquals("LOCKED", cl.status);

        cl.enterDigit(1);
        assertEquals("1", cl.status);

        cl.enterDigit(2);
        assertEquals("12", cl.status);

        cl.enterDigit(5);
        assertEquals("ERROR", cl.status);
    }

}