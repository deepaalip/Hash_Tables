package com.bridgelabz.hashmap;

public class HashMapMain {
	
  public static void main(String[] args) {
	  
    String sentence = "To be or not to be" ;
    HashMap<String, Integer> HashMap = new HashMap<>();
    String[] words = sentence.toLowerCase().split( "   ");{
    for (String word : words) {
    	Integer value = HashMap.get(word);
    	if(value == null) {
    		value =1;
    	}
    	else {
    		value = value + 1;
    	}
    	HashMap.add(word, value);
    	
    }
    
  
    System.out.println(HashMap);
    
  
    
    }
 }
}