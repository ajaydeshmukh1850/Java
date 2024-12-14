import java.io.FileOutputStream;

class FileHandling3{

	public static void main(String[] args){
	
		   try{    
				 FileOutputStream fout=new FileOutputStream("C:/Users/ajayd/Desktop/Java/don.txt");    
				 //fout.write(65);    //wrtie the ASCII value
				 
				 String name = "DON NO. 1";
				 
				 byte[] byteStringArr = name.getBytes();
				 
				 fout.write(byteStringArr);
				 
				 fout.close();    
				 System.out.println("DON");    
            }catch(Exception e){
				System.out.println(e);
			}        
	}

}