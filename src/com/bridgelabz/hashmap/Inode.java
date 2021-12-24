package com.bridgelabz.hashmap;

 
	public interface Inode<K> {
        K getKey();
        void setKey();

        Inode getNext();
        void setNext(Inode<K> tempNode);
}

