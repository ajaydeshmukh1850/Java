class MyFirstProgram{
	public static void main(String[] args){
			System.out.println("Hello World");
	
		Student obj = new Student();
		obj.myName();
	}
}

class Student{
	void myName(){
		System.out.println("In class Student myName");
	}
}