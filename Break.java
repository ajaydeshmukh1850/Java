public class Break {
    public static void main(String[]args){

int i,j; // input(i,j)

/*for(i=0;i<10;i++)  // using for loop (outer loop)

{
    if(i==5){

        break; // condition break
    }
        System.out.println(i);
        
    } 

    for(j=0; j<10; j++) // using loop

    {
        if(j==7){
            break;
        }
      System.out.println(j);  
    } /* */


// (ineer loop and outerloop)
    for(i=0;i<3;i++) 
    {
        for(j=0; j<3; j++)
        
        {
            if(i==2 && j==2) //(&& - and )
            break;
        }

        System.out.println(i+" "+j);
    }

    
}

}
