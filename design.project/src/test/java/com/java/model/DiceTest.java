package com.java.model;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

class DiceTest {
    @Mock
    Dice diceMock;
    @Test
    void roll() {
        Assert.assertTrue("Dice is working",diceMock.roll()>=1||diceMock.roll()<=6);
        Assert.assertFalse("Dice is not working",diceMock.roll()<0||diceMock.roll()>6);
    }
}