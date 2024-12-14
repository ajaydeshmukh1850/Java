/*class Bike{  // -- class


Bike() // --- main method 
{

System.out.println(" bike seal");

}
public static void main (String[] args){// calling default constructor

Bike obj = new Bike();  // create object

}
}
/*/


Class Student{
	int id ;
	String name;
	
	Student(int i, String n){
		
		id = i;
		name = n;
	}
	
	void show(){
		System.out.println(id+" "+name);
	}
	
	public Static void main(String[] args ){
		
		Student obj1 = new Student(10 , Ajay);
		Student obj2 = new Student(4 , Vijay);
	}
	obj1.show();
	obj2.show();
}