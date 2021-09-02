package com.hanshmap;

public interface CustomMap<K,V> {

	void put(K key,V value);
	
	V get(K key);
	
	default void display() {
		
	}
	
	/**
	 * getKeys
	 * getValues
	 * getEntries
	 */
}
