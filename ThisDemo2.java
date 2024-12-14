class ThisDemo2{

	public static void main(String[] args){
	
		Student obj = new Student(10,"Aj");
		System.out.println(obj.getage());
		System.out.println(obj.getName());
	}
}

class Student{
	
	int age;
	String name;
	
	public Student(int age,String name){
		System.out.println("In Student constructor");
		this.age  = age;
		this.name = name;
	}
	
	public int getage(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
}