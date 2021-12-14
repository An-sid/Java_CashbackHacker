package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class CashbackHackServiceTest {
    CashbackHackService cashServ = new CashbackHackService();

    public void whenAmountOnBoundary() {
        int expected = 0;
        int actual = cashServ.remain(2000);
        assertEquals(actual, expected);
    }

    public void whenAmountIsNull() {
        int expected = 1000;
        int actual = cashServ.remain(0);
        assertEquals(actual, expected);
    }

    public void whenAmountIsAvrg() {
        int expected = 500;
        int actual = cashServ.remain(500);
        assertEquals(actual, expected);
    }

    public void whenAmountIsUnderBoundary() {
        int expected = 1;
        int actual = cashServ.remain(999);
        assertEquals(actual, expected);
    }

    public void whenAmountIsAboveBoundary() {
        int expected = 999;
        int actual = cashServ.remain(1001);
        assertEquals(actual, expected);
    }
}