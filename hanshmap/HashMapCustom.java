package com.hanshmap;

public class HashMapCustom<K,V>{
	
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		
		Entry(K key,V value,Entry<K,V> next){
			this.key=key;
			this.value=value;
			this.next=next;
		}
	}

	Entry<K,V>[] table=null;
	private static int CAPACITY=10;
	public static int SIZE=0;
	
	public HashMapCustom() {
		table=new Entry[CAPACITY];
	}

	public HashMapCustom(int size) {
		CAPACITY=size;
		table=new Entry[CAPACITY];
	}
	
	public void put(K key, V value) {
		if(key==null) 
			return;
	
		int KeyBucketIndex=hashCode(key);
		Entry<K,V> e=new Entry<K,V>(key,value,null);
		Entry existing=table[KeyBucketIndex];
		if(existing==null) {
			table[KeyBucketIndex]=e;
			++SIZE;
		}else {
			while(existing!=null) {
				if(existing.key==key) {
					existing.value=value;
					return;
				}else {
					existing=existing.next;
				}
			}
			existing.next=e;
			++SIZE;
		}
	}
	
	public V get(K key) {
		if(key==null)
			return null;
		int KeyBucketIndex=hashCode(key);
		Entry firstNodeInIndex=table[KeyBucketIndex];
		while(firstNodeInIndex!=null) {
			if(firstNodeInIndex.key==key)
				return (V)firstNodeInIndex.value;
			firstNodeInIndex=firstNodeInIndex.next;
		}
		return null;
	}
	
	private int hashCode(K key) {
		return Math.round(key.hashCode()%CAPACITY);
	
		
	}
	
	
	
	
	
}