class Abstraction2Demo extends Honda{
	
	public static void main(String[] args){
		
		Abstraction2Demo obj = new Abstraction2Demo();
		obj.bike();
	
	}
	
	void bike()                           //......... concreate method...
	{
		System.out.println("bike");
	}
	
}
abstract class Honda{                    //.......... Abstract method....
	
	
	abstract void bike();
}



//...................................................................................................//