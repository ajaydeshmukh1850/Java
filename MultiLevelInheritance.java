class GrandParentClass{
	public void walking(){
		System.out.println("in method walking");
	}
}

class ParentClass extends GrandParentClass{     // parentclass property acess grandparent class//
	public void running(){
		System.out.println("in method running");
	}
}


//MultiLevelInheritance Inheritance
class MultiLevelInheritance extends ParentClass{      // // Multilevelinheritance property acess parentclass//

	public static void main(String[] args){
		
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.running();
		obj.walking();
		
	}
	
	

}