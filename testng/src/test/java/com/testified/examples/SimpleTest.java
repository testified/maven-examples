package com.testified.examples;

import com.testified.qa.examples.Simple;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SimpleTest {
  Simple simple;

  @BeforeTest
  public void beforeTest() {
    simple = new Simple(1, "one");
  }

  @AfterTest
  public void afterTest() {
    simple = null;
  }

  @Test(enabled = true)
  void testSimple() {
    assertNotNull(simple);
  }

  @Test(enabled = true)
  void testGetNum() {
    assertEquals(simple.getNum(), 1);
  }

  @Test(enabled = true)
  void testGetVal() {
    assertEquals(simple.getVal(), "one");
  }

  @Test(enabled = true)
  void testGetTotals() {
    assertTrue(Simple.getTotals() > 0);
  }

}
