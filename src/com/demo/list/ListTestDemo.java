package com.demo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * 		//Hetrogenous 
		//Automaticall grow the size
		//1. The root interface in the collection hierarchy.
		//2. A collection represents a group of objects, known as its elements. 
		//3. Some collections allow duplicate elements and others do not. 
		//4. Some are ordered and others unordered.
 * 
 * 
 * @author Vajpai
 *
 */
public class ListTestDemo {

	public static void main(String[] args) {
		
		List elements = new ArrayList();
		elements.add("one");
		elements.add("two");
		elements.add("three");
		elements.add("four");
		//Integer value = new Integer(10);
		//elements.add(Integer.valueOf(1000));
		elements.add(Integer.valueOf(1000));
		//elements.add(2, "welcome");
		System.out.println("Size--->"+ elements.size());
		
		List elements1 = new ArrayList();
		elements1.add("one");
		elements1.add("two1");
		
		//elements.addAll(1, elements1);
		//elements.clear();
		if(elements.containsAll(elements1)){
			System.out.println("--True");
		} else{
			System.out.println("--False----");
		}
		System.out.println(elements);
		String fourthElement = (String)elements.get(2);
		System.out.println("fourthElement--->" + fourthElement );
		int index = elements.indexOf("four");
		System.out.println("---index--->" + index );
		Iterator iterator = elements.iterator();
		while(iterator.hasNext()){
			System.out.println("Iterarator-->" + iterator.next());
		}
		
		
		List<Integer> values = new ArrayList<>();
		values.add(100);
		values.add(101);
		values.add(102);
		values.add(103);
		for (Integer value : values) {
			if(value.intValue() == 102){
				//break;
				values.remove(value);
				
			} 
			System.out.println("foreach--->"+ value);
		}
		System.out.println("---end foreach---"+ values);
		for (int i = 0; i < values.size(); i++) {
			Integer integer = values.get(i);
			//System.out.println("for--->"+ integer);
		}
		
		//elements.addAll()
		//elements.remove(index)
		//elements.removeAll(c);
		
	

	}

}
