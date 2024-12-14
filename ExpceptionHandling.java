class ExpceptionHandling{
public static void main(String[] args){

int arr[] = new int[5];
try{
System.out.println(arr[5]/0);

}catch(ArithmeticException e)
{
System.out.println("arrimetic ex :"+e.getMessage());
}catch(ArrayIndexoutOfBoundsException e)
{
System.out.println("array indeex ex :"+e.getMessage());
}
System.out.println("Done");
}
}

