class Student5{
	int id ;
	String name;
	
	Student5(int i, String n){
		
		id = i;
		name = n;
	}
	
	void show(){
		System.out.println(id+" "+name);
	}
	
     public static void main(String[] args)
	 {
		
		Student5 obj1 = new Student5(10 ,"Ajay");
		Student5 obj2 = new Student5(4 , "Vijay");
	
	obj1.show();
	obj2.show();
}
}