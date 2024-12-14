class AbstractClassDemo{

	public static void main(String[] args){
		Circle c = new Circle();
		c.draw();	
		c.myShape();		
		c.draw2();
	}
}

abstract class Shape{
	//abstract method
	//funcationality
	abstract void draw();
	
	abstract void draw2();

	//concrete meth od
	
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