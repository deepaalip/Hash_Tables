package com.bridgelabz.hashmap;



public class MyMapNode<K , V > implements Inode <K> {
     K key;
     V  value;
     MyMapNode <K , V> next;
	
	public MyMapNode(K key , V value){
	this.key =key;
	this.value = value;
    next=null;
	}
	@Override
	public K getKey() {
		
		return key;
	}

	public void setKey(K key) {
	
		this.key=key;
	}


	public Inode<K>getNext() {
		// TODO Auto-generated method stub
		return next;
	}

    public V getValue() {
		return value;
	}

	
	public void setValue(V value) {
	     this.value=value;
	}
	     
	
	public void setNext(Inode<K> next) {
		this.next =(MyMapNode<K, V>) next;
		
	}
	@Override
    public String toString() {
    	StringBuilder MyMapNodeString = new StringBuilder();
    	MyMapNodeString.append("MyMapNode{" + "K=")
    .append(key).append("V=").append(value).append('}');
    	if(next != null) 
    		MyMapNodeString.append("->").append(next);
    	     return MyMapNodeString.toString();
    }
	@Override
	public void setKey() {
		// TODO Auto-generated method stub
		
	}
}

	
	



