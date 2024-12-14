class ThisReferMethodDemo{

public static void main(String[] args){
	Test t1 = new Test();
	t1.m();
	
}

}
class Test{
	
	void m()
	{
		this.n();
		System.out.println("M");
	}
	
	
	void n(){
		System.out.println("N");
	}
}
		