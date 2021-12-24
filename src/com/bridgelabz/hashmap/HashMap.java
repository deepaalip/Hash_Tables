package com.bridgelabz.hashmap;

public class HashMap <K, V>{
	
	MyLinklist<K> myLinklist;
	
	
	public HashMap () {
		this.myLinklist = new MyLinklist<>();
		
	}
   public V get(K key) {
	   MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinklist.search(key);
	   return (myMapNode == null) ? null : myMapNode.getValue();
	   
	   
   }
	
   public  void add(K key,  V value) {
	   MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinklist.search(key);
	   if (myMapNode == null) {
		   myMapNode = new MyMapNode<>(key, value);
		   this.myLinklist.append(myMapNode);
	   }
	   else {
		   myMapNode.setValue(value);
	   }
   }
   
   public void printHashMap()
   {
	   myLinklist.printMyNodes();
   }
   
   @Override
   public String toString() {
	   return "MyHashmapNodes{" + myLinklist+'}';
   }
}
