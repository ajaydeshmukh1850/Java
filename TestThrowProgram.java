class TestThrowProgram{

public static void validate(int age){
	
	if(age>18){
		
		throw  new ArithmeticException("person are not eligible");
		
		
	}else{
		System.out.println("person are eligible to vote");
			
	}
	
}
public static void main(String[] args){
	
	validate(20);
	System.out.println("rest of the code");

}
}