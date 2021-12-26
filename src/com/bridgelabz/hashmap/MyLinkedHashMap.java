package com.bridgelabz.hashmap;

import java.util.ArrayList;

public class MyLinkedHashMap<K,V>{
	
	    private final int numBuckets;
	    ArrayList<MyLinklist<K>> myBucketArray;
	    public MyLinkedHashMap(){
	        this.numBuckets = 10;
	        this.myBucketArray = new ArrayList<>(numBuckets);
	        for (int i = 0; i < numBuckets; i++)
	            this.myBucketArray.add(null);
	    }
	    private int getBucketIndex(K key){
	        int hashCode = Math.abs(key.hashCode());
	        int index = hashCode % numBuckets;
	        System.out.println("Key: "+key+" hashcode: "+hashCode+" index: " +index);
	        return index;
	    }
	    public V get(K key){
	        int index = this.getBucketIndex(key);
	        MyLinklist<K> myLinklist = this.myBucketArray.get(index);
	        if(myLinklist == null) return null;
	        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>)myLinklist.search(key);
	        return (myMapNode == null)? null : myMapNode.getValue();
	    }
	    public  void add(K key, V value) {
	        int index = this.getBucketIndex(key);
	        MyLinklist<K> myLinklist = this.myBucketArray.get(index);
	        if(myLinklist == null){
	            myLinklist = new MyLinklist<>();
	            this.myBucketArray.set(index,myLinklist);
	        }
	        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) myLinklist.search(key);
	        if(myMapNode == null){
	            myMapNode = new MyMapNode<>(key,value);
	            myLinklist.append(myMapNode);
	        }else {
	            myMapNode.setValue(value);
	        }

	    }

}
