
/*Abstraction is a process of hiding the implementation details and 
		 showing only functionality to the user./*/
		 
		 



class AbstractClassDemo2{

	public static void main(String[] args){
		Circle c = new Circle();
		c.draw();	                 
																			   
		c.myShape();		
		c.draw2();
	}
}

abstract class Shape{

	void myShape(){
		System.out.println("Draw Shape");
	}

}

class Circle extends Shape{
	
	//Implementation Details
	void draw(){
				System.out.println("Draw Circle");
	}
	
	void draw2(){
				System.out.println("Draw Circle 2");
	}
}