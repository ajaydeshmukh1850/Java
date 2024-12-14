import java.io.FileOutputStream;
class FOSDemo2{
public static void main(String[] args){
	
	try{

FileOutputStream fout = new FileOutputStream("C:\\Users\\ajayd\\Desktop\\Java\\Files\\out.txt");

String s="WELCOME IT";
byte b[]= s.getBytes();

fout.write(b);
fout.close();
System.out.println("victroy"); 
  
}
catch(Exception e)
{System.out.println(e);}
    
}
}


//Java FileOutputStream is an output stream used for writing data to a file.