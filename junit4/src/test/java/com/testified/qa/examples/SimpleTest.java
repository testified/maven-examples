package com.testified.qa.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.testified.qa.examples.Simple;

public class SimpleTest {
  Simple simple;

  @Before
  public void setUp() throws Exception {
    simple = new Simple(1, "one");
  }

  @After
  public void tearDown() throws Exception {
    simple = null;
  }

  @Test
  public void testSimple() {
    assertNotNull(simple);
  }

  @Test
  public void testGetNum() {
    assertEquals(simple.getNum(), 1);
  }

  @Test
  public void testGetVal() {
    assertEquals(simple.getVal(), "one");
  }

  @Test
  public void testGetTotals() {
    assertTrue(Simple.getTotals() > 0);
  }

}
