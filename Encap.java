

class Encap{

public static void main(String[] args){

int age = 25;

//if
if(age > 20){
System.out.println(age);
}

//if-else
if(age == 20){
System.out.println(true);
}else{
System.out.println(false);
}


if(age != 20){
System.out.println("Not Equal");
}else{
System.out.println("Equal");
}


//if-else-if - boolean, String, char, float, double
if(age < 20){
System.out.println("Less than 20");
}else if(age > 30){
System.out.println("Greater than 30");
}else{
System.out.println("In else part");
}



//if -else String
String name = "John";

if(name.equals("Doe")){
System.out.println("Equal");
}else{
System.out.println("Not Equal");
}


//Not Equals
if(!name.equals("Doe")){
System.out.println("Not Equal");
}else{
System.out.println(" Equal");
}


ControlStatementsAndOperatorDemo obj = new ControlStatementsAndOperatorDemo();
System.out.println("Instance of : "+ (obj instanceof ControlStatementsAndOperatorDemo));


//SwitchPoint- long,char,String,float,double,int
switch("2"){
case "1" : System.out.println("Case 1");
break;
case "2" : System.out.println("Case 2");
break;
case "3" : System.out.println("Case 3");
break;
case "4" : System.out.println("Case 4");
break;
default :System.out.println("Case default");
break;
}



//for loop
for(int i=0;i<10;i++){
System.out.print(" "+i);
}



for(int i=0;i<10;i++){
System.out.print("\nfor loop with break "+i);

if(i == 3){
break;
}
}


for(int i=0;i<10;i++){

if(i == 3){
continue; //skip
}

System.out.println("\nfor loop with continue "+i);

}



//while loop
System.out.println("\nWhile Loop");
int i=10;
while(i<20){
System.out.println(i);
i++;
}



int j =10;
//do-while
do{
System.out.println("do while "+j);
j++;
}while(j < 20);

}


}
