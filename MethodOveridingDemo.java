class MethodOveridin    gDemo extends Animal{
	
public static void main(String[] args){    //........... cong.METHOD

MethodOveridingDemo obj = new MethodOveridingDemo();  //...... CREATE OBJECT MAIN METHOD CLASS
obj.running("ajay");        // ............................... CALL DIRECTLY RUNG 1, RUNG 2 METHOD CREATE OBJECT THEN CALL

      }
public void running(){
System.out.println("RUNNING");                          // MethodOveriding problem //

   }

}

class Animal{
public void running(String name){             //........... USING STRING METHOD 
System.out.println("RUNNING2 :"+ name);

     }

}

