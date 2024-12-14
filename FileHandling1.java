import java.io.FileOutputStream;

class FileHandling1{

	public static void main(String[] args){
	
		   try{    
				 FileOutputStream fout=new FileOutputStream("C:/Users/ajayd/Desktop/Java/Files/AJ/testout.txt");    
				 //fout.write(65);    //wrtie the ASCII value
				 
				 String name = "Nagpur IT Training institute";
				 
				 byte[] byteStringArr = name.getBytes();
				 
				 fout.write(byteStringArr);
				 
				 fout.close();    
				 System.out.println("success...");    
            }catch(Exception e){
				System.out.println(e);
			}        
	}

}