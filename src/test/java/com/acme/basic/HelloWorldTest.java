package com.acme.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }

  @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        HelloWorld tester = new HelloWorld(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0));
        assertEquals(0, tester.multiply(0, 10));
        assertEquals(0, tester.multiply(0, 0));
    }
}
