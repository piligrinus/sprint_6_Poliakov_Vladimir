package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionGetEatTest {
   private String sex = "Самка";
   List<String> lionEat = List.of("Животные", "Птицы", "Рыба");
  @Mock
  Feline feline;

  @Test
   public void getLionEat() throws Exception {
      Mockito.when(feline.getFood("Хищник")).thenReturn(lionEat);
      Lion lion = new Lion(sex,feline);
      List<String> actualLionFood = lion.getFood();
      List<String> expectedLionFood = lionEat;
      assertEquals(expectedLionFood,actualLionFood);
  }


}



