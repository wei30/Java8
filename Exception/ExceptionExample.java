package com.exception;

public class ExceptionExample {
	public void check() throws IOException{
		System.out.print("throw IOException");
	}
		
		
	
  public static void main(String[] args) throws IOException{
	ExceptionExample e = new ExceptionExample();
	  e.check();
	  

}
}
