package com.janbask.collectionExamples;
import java.util.HashMap;
import java.util.Map;

public class HM {
	
	
	public static void main(String[] args) {
//SYNTAX- HashMap<Data Type> hashmapname= new HashMpa<Datatype>();		
		
	HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap  
	
	   //map.put(key, value)
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");  
	   map.put(3,"Apple");  
	   
	 //  System.out.println(map);
	   
	   System.out.println(map.get(1));
	   
	   
	       
		
		  System.out.println("Iterating Hashmap..."); 
		  for(Map.Entry m : map.entrySet()){
			  System.out.println(m.getKey()+" "+m.getValue()); }
		  
	}
}
