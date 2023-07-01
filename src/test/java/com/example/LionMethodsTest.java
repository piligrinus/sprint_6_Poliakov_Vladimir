package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LionMethodsTest {
    private String sex = "Самка";
    @Test
    public void getKittingCountTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex,feline);
        int actualLionCountKittens = lion.getKittens();
        int expectedLionCountKittens = 1;
        assertEquals(expectedLionCountKittens,actualLionCountKittens);
    }

}
