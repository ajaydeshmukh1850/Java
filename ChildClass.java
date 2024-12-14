class ParentClass{


	public void running(){
		System.out.println("in method running");
	}


}


//Single Inheritance
class ChildClass extends ParentClass{   // parentclass ke properties acesss karne keliye "extends" use karte hai//

	public static void main(String[] args){
		
		ChildClass obj = new ChildClass();  
		
		
		// create object by class
		obj.walking();
		
		//ParentClass obj2 = new ParentClass();
		//obj2.running(); 	
		
		obj.running();
	}
	
	public void walking(){
		System.out.println("in method walking");

	}

}

