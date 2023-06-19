package com.example;

import org.junit.Test;

public class LionNegativeTest {

        @Test(expected = Exception.class)

    public void getSexException() throws Exception {
         new Lion("Лев");



    }
}
