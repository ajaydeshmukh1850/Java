

class ParentClass{
	public void parentMethod(){
		System.out.println("in method parent method");
	}
}

class ChildClass1 extends ParentClass{
	public void running(){
		System.out.println("in method running");
	}
}

class ChildClass2 extends ParentClass{
	public void walking(){
		System.out.println("in method walking");
	}
}

//HeirachicalInheritance Inheritance
class HierarchicalInheritance{

	public static void main(String[] args){
		
		ChildClass1 obj = new ChildClass1();
			obj.running();
			obj.parentMethod();
			
		ChildClass2 obj2 = new ChildClass2();
			obj2.walking();
			obj2.parentMethod();
		
		
		
		
	}
	
	

}