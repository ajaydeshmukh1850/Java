class FinalDemo2 extends Parent{
	
	public static void main(String[] args){
		

		FinalDemo2 obj = new FinalDemo2();
		obj.walking();
		obj.Running();
		
	}
	void Running(){
		System.out.println("child: Walking");
			

	}
}



 class Parent{
 void walking(){
			
			System.out.println("Parent: Walking");

			
		}
		
		
	}
