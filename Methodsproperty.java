 class Methodsproperty{
public static void main(String[]args){

walking();
walking2("Ajay");
System.out.println(walking3());
}
// no paramater no  return type //
public static void walking(){
System.out.println("walking");


}
// parameter no return type
public static void walking2(String name){
System.out.println("walking : "+name);	

}
public static int walking3(String name){
System.out.println("walking3 : ");	
return 5;  

}

}