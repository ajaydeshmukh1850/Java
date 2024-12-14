//parent class = Animal2
class Animal2{  
	 void eat(){
		System.out.println("eating...");
	}  
}  
//child class = Tiger
class Tiger extends Animal2{  
	 void kill(){
		System.out.println("killing...");
	}  
} 

//child class = Dog2
class Dog2 extends Animal2{  
	 void bark(){
		System.out.println("barking...");
	}  
}  

class TestInheritance{  
	public static void main(String args[]){  
		Dog2 d1=new Dog2();  
		d1.bark();  
		d1.eat();  
	
		Tiger t1=new Tiger();
		t1.kill();
		//t1.bark();  
		t1.eat();  
	}
}  



