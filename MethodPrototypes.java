class MethodPrototypes{
	
	public static void main(String args[]){
		MethodPrototypes obj = new MethodPrototypes();
		obj.running();
		
		obj.running2("Rakesh");
		
		//System.out.println(obj.running3());
		
		int age =  obj.running3();
		System.out.println(age);
		
		int age2 = obj.running4("Rakesh");
		System.out.println(age2);

	}
	
	//no parameter no return type
	//default method
	public void running(){
		System.out.println("Running");
	}
	
	//parameter but no return type
	//parameterised method
	public void running2(String name){
		System.out.println("Running : "+ name);
	}
	
	//no paramter but return type
	//default method
	public int running3(){
		return 10;
	}
	
	// paramter but return type
	//parameterised method
	public int running4(String name){
		return 10;
	}
}
