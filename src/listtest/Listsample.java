package listtest;

import java.util.ArrayList;
import java.util.List;

public class Listsample 
{
public static void main(String[] args)
{
	List<Integer> li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(10);
	
	System.out.println(li);
	int size=li.size();
	System.out.println(size);
	
	int indexof=li.indexOf(20);
	System.out.println(indexof);
	
	int lastindexof=li.lastIndexOf(10);
	System.out.println(lastindexof);
	
	Integer integer=li.get(2);
	System.out.println(integer);
	
	List li1=new ArrayList();
	li1.add(10);
	li1.add("Java");
	li1.add(84.54f);
	li1.add(40);
	li1.add("SQL");
	li1.add(10);
	System.out.println();
	System.out.println(li1);
	 
	
	boolean contain=li.contains(30);
	System.out.println(contain);
	
	//to replace
	
	li.set(3,4444);
	System.out.println(li);
	
	li.remove(4);
	System.out.println(li);
	
	Object object=li1.get(3);
	System.out.println(object);
	
    for (int i=0;i<li.size();i++)
    {
    	System.out.println(li.get(i));
    }
    
    System.out.println("==================");
    
    
    for(Object x:li1)
    {
    	System.out.println(x);
    }
    
    
    for (int i = 0; i < args.length; i++) {
		
	}
    
}
}
