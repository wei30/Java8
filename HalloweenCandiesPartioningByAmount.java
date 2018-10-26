package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * use collect() as the terminal operation 
 * use groupingBy to group the list according the number of candies
 */
public class HalloweenCandiesPartioningByAmount{
  private String candy;
  private int amount;
  
  
public HalloweenCandiesPartioningByAmount() {
	super();
}

public HalloweenCandiesPartioningByAmount(String candy, int amount) {
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
	List<HalloweenCandiesPartioningByAmount> list = new ArrayList<HalloweenCandiesPartioningByAmount>();
	list.add(new HalloweenCandiesPartioningByAmount("M&M", 4));
	list.add(new HalloweenCandiesPartioningByAmount("Crunch", 10));
	list.add(new HalloweenCandiesPartioningByAmount("Lollipop", 4));
	list.add(new HalloweenCandiesPartioningByAmount("Sour Patch", 3));
	list.add(new HalloweenCandiesPartioningByAmount("Dove", 3));
	System.out.println(list);
	HalloweenCandiesPartioningByAmount x = new HalloweenCandiesPartioningByAmount();
	
	//Predicate<Boolean> predicate = x.amount > 3;
	System.out.println("In order List by comparing to the amount of candies");
	Map<Boolean, List<HalloweenCandiesPartioningByAmount>> map = list.stream().collect(Collectors.partitioningBy(y -> y.getAmount()>3));
	System.out.println(map);
			
}
	
}
