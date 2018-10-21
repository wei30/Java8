package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * use stream to filter out pieces of candy that is less than 4
 * Use count() to find out the number of object left after filter
 * count() return type long
 */
public class HalloweenCandies {
  private String candy;
  private int amount;
  
  
public HalloweenCandies(String candy, int amount) {
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
	List<HalloweenCandies> list = new ArrayList<HalloweenCandies>();
	list.add(new HalloweenCandies("M&M", 5));
	list.add(new HalloweenCandies("Crunch", 10));
	list.add(new HalloweenCandies("Lollipop", 4));
	list.add(new HalloweenCandies("Sour Patch", 3));
	
	long numOfCandies = list.stream().filter(x -> x.amount > 4).count();
	System.out.println("Number of Types of Candies Left " + numOfCandies);
			
			
	
}
}
