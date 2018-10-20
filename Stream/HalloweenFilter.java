package com.stream;

import java.util.ArrayList;
import java.util.List;

/*
 * use stream to filter out pieces of candy that is less than 4
 */
public class HalloweenFilter {
  private String candy;
  private int amount;
  
  
public HalloweenFilter(String candy, int amount) {
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
	List<HalloweenFilter> list = new ArrayList<HalloweenFilter>();
	list.add(new HalloweenFilter("M&M", 5));
	list.add(new HalloweenFilter("Crunch", 10));
	list.add(new HalloweenFilter("Lollipop", 4));
	list.add(new HalloweenFilter("Sour Patch", 3));
	
	list.stream().filter(x -> x.amount > 4).forEach(System.out::println);
			
			
	
}
}
