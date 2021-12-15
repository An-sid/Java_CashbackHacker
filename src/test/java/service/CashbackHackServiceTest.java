package service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashServ = new CashbackHackService();

    @Test
    public void whenAmountOnBoundary() {
        int expected = 0;
        int actual = cashServ.remain(2000);
        assertEquals(expected, actual);
    }

    @Test
    public void whenAmountIsNull() {
        int expected = 1000;
        int actual = cashServ.remain(0);
        assertEquals(expected, actual);
    }

    @Test
    public void whenAmountIsAvrg() {
        int expected = 500;
        int actual = cashServ.remain(500);
        assertEquals(expected, actual);
    }

    @Test
    public void whenAmountIsUnderBoundary() {
        int expected = 1;
        int actual = cashServ.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void whenAmountIsAboveBoundary() {
        int expected = 999;
        int actual = cashServ.remain(1001);
        assertEquals(expected, actual);
    }

}