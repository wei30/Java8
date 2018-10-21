package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * use stream to filter out pieces of candy that is less than 4
 * Use findAny() to find if there is any Halloween Object that has at least 4 piece of candies
 * findAny() return Optional
 */
public class HalloweenFindFirst {
  private String candy;
  private int amount;
  
  
public HalloweenFindFirst(String candy, int amount) {
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
	List<HalloweenFindFirst> list = new ArrayList<HalloweenFindFirst>();
	list.add(new HalloweenFindFirst("M&M", 5));
	list.add(new HalloweenFindFirst("Crunch", 10));
	list.add(new HalloweenFindFirst("Lollipop", 4));
	list.add(new HalloweenFindFirst("Sour Patch", 3));
	
	Optional<HalloweenFindFirst> first = list.stream().filter(x -> x.amount > 4).findFirst();
	System.out.println(first);
			
			
	
}
}
