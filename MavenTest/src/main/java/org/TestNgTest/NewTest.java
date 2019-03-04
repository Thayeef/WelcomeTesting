package org.TestNgTest;

import org.testng.annotations.Test;

public class NewTest {
	
	int a=40;
	int b=10;
	
	
  @Test
  public void add() {
	  System.out.println("addition-->"+ (a+b) );
  }
  @Test
  public void sub() {
	  System.out.println("subtra-->"+ (a-b) );
  }
  @Test
  public void mul() {
	  System.out.println("mul-->"+ (a*b) );
  }
  @Test
  public void div() {
	  System.out.println("div-->"+ (a/b) );
  }
}
