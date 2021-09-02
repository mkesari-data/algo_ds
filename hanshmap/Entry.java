package com.hanshmap;

public class Entry<K,V>{

	K key;
	V value;
	Entry next;
	
	Entry(K key, V value){
		this.key=key;
		this.value=value;
	}
}
