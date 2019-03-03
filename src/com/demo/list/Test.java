package com.demo.list;

public class Test {

	public static void main(String[] args) {
		int[] marks = {36,40,60,100};//similar elements
		int[] array = new int[]{10,30,80,70,30};
		int[] elements = new int[3];
		elements[2] = 300;
		//fixed length. if the element added greater than the index length then it throws ArryIndexoutOfBound exceptions
		//Automaitcally grow array is not possible.
		//elements[4] = 400;
		System.out.println("----end-----");
		
		//Wrapper class ---> boxing and unboxing
		int total = 10;
		//passing null causes Exception in thread "main" java.lang.NumberFormatException: null
		//Integer value = new Integer(null);//boxing
		Integer value = new Integer(100);
		System.out.println("--Integer-class ----"+value);
		System.out.println("-primitve int----"+value.intValue());
		/*Double -- doble
		float -- Float
		long -- Long*/
		
		//Hetrogenous 
		//Automaticall grow the size
		//1. The root interface in the collection hierarchy.
		//2. A collection represents a group of objects, known as its elements. 
		//3. Some collections allow duplicate elements and others do not. 
		//4. Some are ordered and others unordered.
		
		
		
		
		
		
		
		
		

	}

}
