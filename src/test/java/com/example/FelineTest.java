package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
       feline.eatMeat();
       Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyTest() {
        String actualResultGetFamilyFeline = feline.getFamily();
        assertEquals("Кошачьи",actualResultGetFamilyFeline);
    }



    @Test
    public void WithoutArgumentGetKittensTest() {
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens(1);
    }
}