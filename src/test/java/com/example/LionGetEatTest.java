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
  @Mock
  Feline feline;

  @Test
   public void getLionEat() throws Exception {
      Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
      Lion lion = new Lion(feline);
      List<String> actualLionFood = lion.getFood();
      List<String> expectedLionFood = List.of("Животные", "Птицы", "Рыба");
      assertEquals(expectedLionFood,actualLionFood);
  }


}



