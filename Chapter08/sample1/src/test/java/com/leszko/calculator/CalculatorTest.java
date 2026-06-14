package com.leszko.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     private Calculator calculator = new Calculator();

     @Test
     public void testSum() throws Exception {
          assertEquals(5, calculator.sum(2, 3));
          assertEquals(10, calculator.sum(7, 3));
          CalculatorController controller = new CalculatorController();

          java.lang.reflect.Field field =
             CalculatorController.class.getDeclaredField("calculator");
          field.setAccessible(true);
          field.set(controller, calculator);

          assertEquals("5", controller.sum(2, 3));
     }
}
