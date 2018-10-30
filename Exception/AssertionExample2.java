package com.exception;

public class AssertionExample2 {
	enum Car{
		TWOWHEEL, FOURWHEEL, NOWHEEL
		}
	public int getDeliveryTimeInDays() {
		Car status = Car.TWOWHEEL;
	    switch (status) {
	        case TWOWHEEL: return 5;
	        case FOURWHEEL: return 2;
		case NOWHEEL: return 3;
	        default:
	        	assert false: "failed";
	    }
	    return 1;
	}	
		
	
  public static void main(String[] args) {
	AssertionExample2 example = new AssertionExample2();
	System.out.println(example.getDeliveryTimeInDays());

}
}
