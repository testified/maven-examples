package com.testified.qa.examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleTest {
  Simple simple;

  @BeforeEach
  void setUp() throws Exception {
    simple = new Simple(1, "one");
  }

  @AfterEach
  void tearDown() throws Exception {
    simple = null;
  }

  @Test
  void testSimple() {
    assertNotNull(simple);
  }

  @Test
  void testGetNum() {
    assertEquals(simple.getNum(), 1);
  }

  @Test
  void testGetVal() {
    assertEquals(simple.getVal(), "one");
  }

  @Test
  void testGetTotals() {
    assertTrue(Simple.getTotals() > 0);
  }

}
