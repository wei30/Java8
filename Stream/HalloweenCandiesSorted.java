package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * use sorted() to sort the list by name and forEach() as 
 * terminal operation to print out the list in order.
 */
public class HalloweenCandiesSorted{
  private String candy;
  private int amount;
  
  
public HalloweenCandiesSorted(String candy, int amount) {
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
	List<HalloweenCandiesSorted> list = new ArrayList<HalloweenCandiesSorted>();
	list.add(new HalloweenCandiesSorted("M&M", 5));
	list.add(new HalloweenCandiesSorted("Crunch", 10));
	list.add(new HalloweenCandiesSorted("Lollipop", 4));
	list.add(new HalloweenCandiesSorted("Sour Patch", 3));
	System.out.println(list);
	System.out.println("Inorder List by comparing to the name");
	list.stream().sorted((x1,x2)-> x1.candy.compareTo(x2.candy)).forEach(System.out::println);;
	
			
}		
}
