
class Animalman{

	public void running(){
		System.out.println("in method running");
	}


}


//Single Inheritance
class Man45 extends Animalman{

	public static void main(String[] args){
		
		Man obj = new Man();
		obj.walking();
		
		//ParentClass obj2 = new ParentClass();
		//obj2.running(); 	
		
		obj.running();
	}
	
	public void walking(){
		System.out.println("in method walking");

	}
}