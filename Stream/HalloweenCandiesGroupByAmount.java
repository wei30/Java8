package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * use collect() as the terminal operation 
 * use groupingBy to group the list according the number of candies
 */
public class HalloweenCandiesGroupByAmount{
  private String candy;
  private int amount;
  
  
public HalloweenCandiesGroupByAmount(String candy, int amount) {
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
	List<HalloweenCandiesGroupByAmount> list = new ArrayList<HalloweenCandiesGroupByAmount>();
	list.add(new HalloweenCandiesGroupByAmount("M&M", 4));
	list.add(new HalloweenCandiesGroupByAmount("Crunch", 10));
	list.add(new HalloweenCandiesGroupByAmount("Lollipop", 4));
	list.add(new HalloweenCandiesGroupByAmount("Sour Patch", 3));
	list.add(new HalloweenCandiesGroupByAmount("Dove", 3));
	System.out.println(list);
	System.out.println("In order List by comparing to the amount of candies");
	list.stream().collect(Collectors.groupingBy(HalloweenCandiesGroupByAmount::getAmount, Collectors.toList()));;
	System.out.println(list);
			
}
	
}
