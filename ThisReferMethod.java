class ThisReferMethod{

public static void main(String[] args){
	Test t1 = new Test();
	t1.m();
	
}
class Test{
	
	void m();
	{
		System.out.println("M");
	}
	
}	
	
}
		