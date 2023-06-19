package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LionMethodsTest {
    @Test
    public void getKittingCountTest(){
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int actualLionCountKittens = lion.getKittens();
        int expectedLionCountKittens = 1;
        assertEquals(expectedLionCountKittens,actualLionCountKittens);
    }

}
