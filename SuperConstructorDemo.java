public class SuperConstructorDemo{

public static void main(String[] args){
	
	Child obj = new Child();
	


}

}

class ParentClass{

public  ParentClass(){

System.out.println("VIJAY");

 }

public ParentClass(String name){

System.out.println("Parameterised'Class:"+name);

   }
   
   
}


class Child extends ParentClass{
	
	public Child(){
		//super("ajay");

System.out.println("Don");


}

}