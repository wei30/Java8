package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class RemoveList {
	
	
	public static List method1(List<String> list){
		List<String> list2 = new ArrayList<String>();
		for(String i: list){
			if(i != "Student_4"){
				list2.add(i);
			}
		}
		return list2;
	}
	
	public static List method2(List<String>list, Predicate<String> p){
		List<String>list2 = new ArrayList<String>();
		for(String i: list){
			if(p.test(i)){
				list2.add(i);
			}
		}
		return list2;
	}
	
public static void main(String[] args) {
	List<String>list = Arrays.asList("Student_1", "Student_2", "Student_3", "Student_4", "Student_5", "Student_6");
	Predicate<String> student = (s) -> s != "Student_4";
	System.out.println(method1(list));
	System.out.println(method2(list,student));
}
}
