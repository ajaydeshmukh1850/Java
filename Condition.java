import java.util.*;    // scanner import keliye use krna pdta hai

public class Condition {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);     // object ko call krne keliye
   // int age= sc.nextInt(); // age ko inpute liya
   // int x = sc.nextInt(); // x ko inpute liya
  // int a = sc.nextInt(); 
  // int b = sc.nextInt(); 
  int button = sc.nextInt(); 

    /*if(age>18){
        System.out.println("adult");
    }
    else{
        System.out.println("not adult");
    } 
  
  if( x % 2 == 0){                       // % (modules) x input liya 7 line me 
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    } /* 

    if (a == b){                         // a and b input liya 8,9 line me ( a equal to b)
        System.out.println("equal");
    }
    else if(a > b)               // a gretter than b (else if condition used)
        {
            System.out.println("a is gretter than b");
        }
        else{
            System.out.println("a is lesser");
        } 
    }
    if (button == 1){
        System.out.println("hello");
    }
    else if (button == 2){
        System.out.println("namste");
    }
    else if (button == 3){
        System.out.println("ram ram");
    }
    else {
        System.out.println("invalid");
    } /* */

switch(button) {                                   // switch part (button example )
    case 1 : System.out.println("hii");
    break;
    case 2 : System.out.println("hello");
    break;
    case 3 : System.out.println("raam");
    break;
    default : System.out.println("invallid button");
   }

  }

}