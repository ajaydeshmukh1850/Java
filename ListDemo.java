//import java.util.L1ist;
import java.util.*;

class ListDemo{

	public static void main(String[] args){
	
		List<String> list =new LinkedList<String>();
		list.add("Aj1");
		list.add("Aj1");
		list.add("Pm3");
		list.add(null);
		list.add("fslkg");
		
	
		for(int i=0;i<list.size();i++){
			System.out.println(i+" "+list.get(i));
		}
		
		for(String name : list){
			System.out.println(name);
		}
		
		System.out.println("4ith index : "+list.get(4));
	
	}


}