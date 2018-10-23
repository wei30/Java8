package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * use sorted() to sort the list by amount of candies and forEach() as 
 * terminal operation to print out the list in order.
 */
public class HalloweenCandiesSortedByAmount{
  private String candy;
  private int amount;
  
  
public HalloweenCandiesSortedByAmount(String candy, int amount) {
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
	List<HalloweenCandiesSortedByAmount> list = new ArrayList<HalloweenCandiesSortedByAmount>();
	list.add(new HalloweenCandiesSortedByAmount("M&M", 5));
	list.add(new HalloweenCandiesSortedByAmount("Crunch", 10));
	list.add(new HalloweenCandiesSortedByAmount("Lollipop", 4));
	list.add(new HalloweenCandiesSortedByAmount("Sour Patch", 3));
	System.out.println(list);
	System.out.println("In order List by comparing to the amount of candies");
	list.stream().sorted((x1,x2)-> x1.getAmount() - x2.getAmount()).forEach(System.out::println);;
	
			
}
	
}
