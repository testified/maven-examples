package com.testified.qa.examples;

public class Simple {
  private int num;
  private String val;
  private static int simpleCounter = 0;

  public Simple(int num, String val) {
    this.num = num;
    this.val = val;
    simpleCounter++;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }

  public static int getTotals() {
    return simpleCounter;
  }

  @Override
  public String toString() {
    return "Simple [num=" + num + ", val=" + val + "]";
  }
}
