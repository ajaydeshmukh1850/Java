import java.io.*;  
class BufferedInputStreamProblem{  
  
 public static void main(String args[]){  

 
  try{    
    FileInputStream fin = new FileInputStream("C:\\Users\\ajayd\\Desktop\\Java\\Files\\out1.txt");    
    BufferedInputStream bin = new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  

// agAR BUFFER AND FILEINPUT KRNA HAI to import me import java.io.* menstion krna 