class VariablesDemo2{

	int age2 = 20; //Instance Variable 
	
	static int age3 = 30; // static variable

	public static void main(String[] args){
		//static int age4 = 30; // static variable // Staic variables cannot be created iside static method.

		int age = 10; //local variable
		
		System.out.println(age);	
		VariablesDemo2 obj = new VariablesDemo2();
	//	System.out.println(obj.age); //local variable ccannot be accessed using object
	//	System.out.println(VariablesDemo2.age); //local variable cannot be called using class name
	
		//System.out.println(age2);	//Instance variable cannot be accessed directly
		System.out.println(obj.age2);
		//System.out.println(VariablesDemo2.age2); //Instance variablecannot be access using class namre.
	
		
		System.out.println(age3);	
		System.out.println(obj.age3);
		System.out.println(VariablesDemo2.age3); 
	}
}