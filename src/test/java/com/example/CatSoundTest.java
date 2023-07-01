package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatSoundTest {
    private Feline feline;

    @Test
    public void getCatSound(){
    Cat cat = new Cat(feline);
    String expectedCatSound = cat.getSound();
    String actualCatSound = "Мяу";
    assertEquals(expectedCatSound,actualCatSound);
}
}