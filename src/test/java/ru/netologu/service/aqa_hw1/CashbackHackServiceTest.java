package ru.netologu.service.aqa_hw1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    CashbackHackService cashBackHack = new CashbackHackService();

    @Test
    public void RemainLessThanBoundary() {
        int amount = 500;
        int expected = 500;
        int actual = cashBackHack.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RemainEqualToBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHack.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RemainGreaterThanBoundary() {
        int amount = 1500;
        int expected = 500;
        int actual = cashBackHack.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}