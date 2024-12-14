import java.io.BufferedOutputStream ; 
 
public class FOSDemo3{ 
   
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("C:\\Users\\ajayd\\Desktop\\Java\\Files\\out1.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to javaTpoint.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  