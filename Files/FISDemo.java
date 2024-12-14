import java.io.FileInputStream;
class FISDemo{
public static void main(String[] args){
	
	try{

FileInputStream fin = new FileInputStream("C:\\Users\\ajayd\\Desktop\\Java\\Files\\wing.txt");
int i=0;
while((i=fin.read())!=-1){
	
System.out.print((char)i);
}

fin.close();
	}
	catch(Exception e){
	System.out.println(e);}
	
   }

}


// It is used for reading byte-oriented data (streams of raw bytes) 
// example :-  image data, audio, video etc. You can also read character-stream data. 
// reading streams of characters

/* fileinput first create textfile in folder  and mention file path and then execute../*