class SuperKeyworldDemo{
	
	public static void main(String[] args){
		
	Tiger obj = new Tiger();
    System.out.println(obj.getNature());


    }
}
class Animal{
	
	
	public String getNature(){
		 return "DW";
	}
}
class Tiger extends Animal{
	
	public String getNature(){
	System.out.println(getNature());
	return "Wild";
	
    }

}




		
	