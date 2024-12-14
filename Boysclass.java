class Grandparentclass{
	public void Morning();
	System.out.println(" hellow Morning");
}
class Parentclass extends Grandparentclass{
	public void Afternoon();
	System.out.println("hellow Afternoom");
}
class Boysclass extends Parentclass{
	public static void main(String[] args){
		
	 Boysclass obj =  new Boysclass();
	obj.Morning();
	 obj.Afternoon();
	}
	 
	