package com.stream;

import java.util.ArrayList;
import java.util.List;

/*
 * use stream to loop through each Halloween object
 */
public class Halloween {
  private String candy;
  private int amount;
  
  
public Halloween(String candy, int amount) {
	super();
	this.candy = candy;
	this.amount = amount;
}

public String getCandy() {
	return candy;
}
public void setCandy(String candy) {
	this.candy = candy;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
  
@Override
public String toString() {
	return "Halloween [candy=" + candy + ", amount=" + amount + "]";
}

public static void main(String[] args) {
	List<Halloween> list = new ArrayList<Halloween>();
	list.add(new Halloween("M&M", 5));
	list.add(new Halloween("Crunch", 10));
	list.add(new Halloween("Lollipop", 4));
	list.add(new Halloween("Sour Patch", 3));
	
	list.stream().forEach(System.out::println);
			
			
	
}
}
