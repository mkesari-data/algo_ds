package com.hanshmap;

public class CustomHashMapImpl<K,V> implements CustomMap<K, V> {

	class Entry<K,V>{

		K key;
		V value;
		Entry next;
		
		Entry(K key, V value){
			this.key=key;
			this.value=value;
		}
	}
	
	static int hashMapMaxSize=10;
	 int size=0;	
	Entry<K,V>[] hmArray=new Entry[hashMapMaxSize];
   
	
	/**
	 * 
	 * 1. if key==null -> return invalid. 
	 * 2. else
	 *      Create Entry object with Key and Value. 
	 *      Get the key hashcode and % hashmap size. 
	 *      insert the entry object in the index which calculated in above step , if that inex is empty. 
	 *      otherise :
	 *         get the node and traverse until last position and insert at last position. 
	 *      
	 * 
	 */
	@Override
	public void put(K key, V value) {
		if(key==null)
			return;
		Entry<K, V> e=new Entry<K,V>(key,value);
		int keyIndex=calculateHashCode(key);
		
		Entry<K,V> e1=hmArray[keyIndex];
		
		if(e1==null) {
			hmArray[keyIndex]=e;
		}
		else {
			/*
			 * 
			 * Develop linked list iteration code. 
			 */
			Entry<K,V> temp=e1;
			boolean isKeyExist=false;
			while(temp.next!=null) {
				/**
				 * if processing node key and input key matches , simply update the input value to thsi node. 
				 */
				if(temp.key.equals(key)) {
					temp.value=value;
					isKeyExist=true;
					break;
				}
				
				temp=temp.next;
			}
			if (!isKeyExist)
				temp.next = e;
		}
	}

	private int calculateHashCode(K key) {
		return key.hashCode()%hashMapMaxSize;
	}
	
	/**
	 * if key ==null -> return 
	 * else:
	 *    get key hashcode and index
	 *    get node value from the index location. 
	 *    if node value is null , return null 
	 *    else
	 *       traverse the all nodes in that index , whenever key matches return that value. 
	 *       if it reaches end of the list without match , then also return null. 
	 */
	
	@Override
	public V get(K key) {
		if(key==null)
			return null;
		
		int keyIndex=calculateHashCode(key);
		Entry<K,V> e1=hmArray[keyIndex];
		
		if(e1==null)
			return null;
		else {
			/**
			 * traverse all the nodes. 
			 */
			
			Entry<K,V> temp=e1;
			while (temp != null) {
				if (temp.key.equals(key)) {
					return temp.value;
				}
				temp = temp.next;
			}
		}
				
		return null;	
		
	}

}
