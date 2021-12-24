package com.bridgelabz.hashmap;

public class MyLinklist<K> {
	public   Inode head;
    public   Inode tail;

    public MyLinklist(){
            this.head = null;
            this.tail = null;
        }
    public void add(Inode myNode) {
        if(this.tail == null){
            this.tail=myNode;
        }
        if(this.head== null){
            this.head=myNode;

        }else{
            Inode tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
         }
        }
     public void append(Inode myNode){
        if(this.head == null){
            this.head=myNode;
        }
        if(this.tail== null){
            this.tail=myNode;
        }else{
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
        }
     
     public void insert(Inode<K> myNode ,Inode<K> newNode){
        Inode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
        }
     
     public Inode pop(){
        Inode<K> tempNode = this.head;
        this.head = head.getNext();
       return tempNode;
        }
     
     public Inode<K> popLast(){
    	 Inode<K> tempNode = head;
    	 while(!tempNode.getNext().equals(tail)) {
    		 tempNode = tempNode.getNext();
    		 
    	 }
    	  this.tail = tempNode;
    	  tempNode = tempNode.getNext();
    	  return tempNode;
     }
     public void size(){
        int counter = 1;
        Inode tempNode = this.head;
        while(tempNode != this.tail) {
            if (tempNode.getNext() == null) {

            } else {
                tempNode = tempNode.getNext();
                counter++;
            }

        }
            System.out.println("Size of current Linked List is: "+counter);
        }
     public Inode<K> search(K key) {
            Inode<K> tempNode = head;
            while(tempNode != null && tempNode.getNext() !=null) {
                if (tempNode.getKey().equals(key)) {
                    return tempNode;
                    
                }
                tempNode=tempNode.getNext();
            }
            return null;
        }
      public void insertUsingKey(Inode myNode,Inode value){
            Inode tempNode = this.head;
            while(tempNode != null ) {
                if (myNode.getKey() == tempNode.getKey()) {
                    Inode temp =tempNode.getNext();
                    tempNode.setNext(value);
                    tempNode = tempNode.getNext();
                    tempNode.setNext(temp);
                    break;
                }
                tempNode=tempNode.getNext();
            }
        }
      public void deleteKey(Inode myNode ){
            Inode tempNode = this.head;
            while(tempNode != null ) {
                if (myNode.getKey() == tempNode.getKey()) {
                    Inode temp =tempNode.getNext();
                    //tempNode= null;
                    Inode demoNode = this.head;
                    demoNode = demoNode.getNext();
                    demoNode.setNext(temp);
                    break;
                }
                tempNode=tempNode.getNext();
            }
        }
    public  void printMyNodes(){
        System.out.println("My Nodes:" + head);

    }
      
    @Override
    public String toString() {
    	return "MyLinklistNodes{"+ head +'}';
    }
}
