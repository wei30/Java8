package com.exception;

public class AssertionExample {
  public static void main(String[] args) {
	assert args.length < 3 : "argument is less than 3";
}
}
