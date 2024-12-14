class Simple{

    int age2 = 25; //instance variable

    static int age3 = 24; //static variable

	public static void main(String args[]){

    		int age = 20; //local variable

	
    	System.out.println("local variable : "+age);
	//System.out.println("Local variable : "+Simple.age); //local variable cannot be accesed by class name
	//System.out.println("local variable : "+obj.age); //local variable cannot be accessed using object.

        Simple obj = new Simple(); //we can create object after acessing the variable after some version of JDK.
    	
    	
	System.out.println("Instance variable : "+obj.age2);
	// System.out.println("Instance variable : "+age2); //instance variable cannot be access without object
	//System.out.println("Instance variable : "+Simple.age2); //instance variable cannot be accessed by class name.

    
    	System.out.println("static variable : "+obj.age3);
    	System.out.println("static variable : "+age3);
	System.out.println("static variable : "+Simple.age3);
	



	}

}