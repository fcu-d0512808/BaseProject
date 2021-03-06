package com.github.d0512808;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void add() throws Exception {
        // Arrange
        Main main = new Main();
        int x = 2;
        int y = 3;
        int exceptSum = 5;
        // Act
        int actualSum = main.add(x, y);
        // Assert
        Assert.assertEquals(exceptSum, actualSum);
    }

}
