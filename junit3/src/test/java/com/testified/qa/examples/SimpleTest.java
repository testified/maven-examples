package com.testified.qa.examples;

import com.testified.qa.examples.Simple;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SimpleTest extends TestCase {

  Simple simple;

  public SimpleTest(String name) {
    super(name);
  }

  protected void setUp() throws Exception {
    simple = new Simple(1, "one");
  }

  protected void tearDown() throws Exception {
    simple = null;
  }

  public void testSimple() {
    Assert.assertNotNull(simple);
  }

  public void testGetNum() {
    Assert.assertEquals(simple.getNum(), 1);
  }

  public void testGetVal() {
    Assert.assertEquals(simple.getVal(), "one");
  }

  public void testGetTotals() {
    Assert.assertTrue(Simple.getTotals() > 0);
  }

}
