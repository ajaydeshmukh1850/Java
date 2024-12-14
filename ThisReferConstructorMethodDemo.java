class ThisReferConstructorMethodDemo{

public static void main(String[] args){
Test t1 = new Test();

}
}

class Test{      // create constructor  // use this keyword
	
Test(){
	this("ajay");
	
System.out.println("constructor");
}

Test(String name){
	
System.out.println("parameter constructor");

}

}
}