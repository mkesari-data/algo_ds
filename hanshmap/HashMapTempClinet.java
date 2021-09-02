package com.hanshmap;

public class HashMapTempClinet {

	public static void main(String[] args) {
		CustomHashMapImpl<Integer,String> hm=new CustomHashMapImpl<Integer,String>();
		hm.put(100, "mohan");
		hm.put(101, "venkat");
		hm.put(102, "raj");
		hm.put(200, "mohan2");
		
		System.out.println("hm.get(100)"+hm.get(100));
		System.out.println("hm.get(101)"+hm.get(101));
		System.out.println("hm.get(102)"+hm.get(102));
		System.out.println("hm.get(200)"+hm.get(200));
	}
}
