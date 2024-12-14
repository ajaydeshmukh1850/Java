import java.util.*;

class LinkedListDemo{
	public static void main (String[] args) {
		
		
	   List<String> list =new LinkedList<String>();
		
		list.add("ajay");
		list.add("ajay");
		list.add("ajay");
		
		for(int i=0;i<list.size(); i++) {
			
			System.out.println(i+" "+list.get(i));
		}
		for(String name : list) {
			
			System.out.println(name);
			
		}
		System.out.println("2nd index : "+list.get(2));
	}

	
}
