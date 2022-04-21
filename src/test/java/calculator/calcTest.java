package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class calcTest {

  @Test
  public void additionTest() {
    calc cal=new calc();
    assertEquals(cal.addition(10, 15), 25); 
  }

  @Test
  public void substractionTest() {
	  calc cal=new calc();
	  assertEquals(cal.substraction(15, 10), 5); 
  }
}
