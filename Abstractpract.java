class Abstractpract{

public static void main( String[] args){
System.out.println("hellow");
Honda4 obj = new Honda4();
obj.run();


}
abstract class Bike{ 

  abstract void run();
System.out.println("runinimg");
}

class Honda4 extends bike {
void run();

}
}