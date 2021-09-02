package com.dp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		 HashMap<Integer, Integer> hm
         = new HashMap<Integer, Integer>();

     // Adding elements to above LinkedHashMap
     // Custom inputs
		 hm.put(1, 8);
		 hm.put(2, 6);
		 hm.put(3, 7);
		 hm.put(4, 2);
		 hm.put(5, 5);
		 System.out.println(hm);
		 
		 CustomComparator cm= new CustomComparator();
		 TreeMap<Integer, Integer> tm=new TreeMap<Integer,Integer>();
		 //TreeMap<Integer, Integer> tm=new TreeMap<Integer,Integer>(cm);
		 Set<Integer>  keys= hm.keySet();
		 for(Integer t:keys) {
			 tm.put(t, hm.get(t));
		 }
		 System.out.println(tm);
		 
		 String s="abc";
		 System.out.println(	 s.indexOf('a'));
		 System.out.println(	 s.indexOf('b'));
		 System.out.println(	 s.indexOf('c'));
		 System.out.println(	 s.indexOf('d'));
	
	}
}

class CustomComparator implements Comparator<Object>{
	@Override
	public int compare(Object o1,Object o2) {
		int firstNumber=(int)o1;
		int secondNumber=(int)o2;
		if(firstNumber==secondNumber)
			return 0;
		else if(firstNumber>secondNumber)
			return 1;
		else return -1;
	}
}
