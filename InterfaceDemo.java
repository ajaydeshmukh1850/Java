interface A{
	//here methods are by default abstract
	public void draw();
	
}
	
	interface B{
	//here methods are by default abstract
	public void draw();
	}
	
interface C{
	//here methods are by default abstract
	public void draw();
	//concrete methods cannot be created in Interface.
}

class ChildClass implements A,B,C{

	public void draw(){
		System.out.println("Child Class Draw method");
	}

}


class InterfaceDemo{

	public static void main(String[] args){
		ChildClass c = new ChildClass();
		c.draw();

	}

}