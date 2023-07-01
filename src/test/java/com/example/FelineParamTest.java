package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
  private final int sendingKittenCount;
  private final int returnKittenCount;

  public  FelineParamTest (int sendingKittenCount,int returnKittenCount) {
      this.sendingKittenCount = sendingKittenCount;
      this.returnKittenCount = returnKittenCount;
  }
@Parameterized.Parameters
public static Object[][] getIntData(){
      return new Object[][]{
              {0,0},
              {2,2},
              {10,10},
      };
}
    @Test
    public void getKittensTest() {
      Feline feline = new Feline();
        int actualKittenCount = feline.getKittens(sendingKittenCount);
        int expectedKittenCount = returnKittenCount;
        assertEquals(expectedKittenCount,actualKittenCount);
    }
}
