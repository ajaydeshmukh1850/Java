class ExceptionHandingFinally{

public static void main (String[] args){
	
	try {
			int num=50/0;
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}finally {
			
			System.out.println("Finally block is run");
		}

    } 

}