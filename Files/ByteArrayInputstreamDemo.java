import java.io.*; 

class ByteArrayInputstreamDemo{
public static void main(String[] args)throws Exception {

byte[] abc = { 91,92,93,65,69,70};
ByteArrayInputStream bin = new ByteArrayInputStream(abc);

int i=0;


FileOutputStream fout = new FileOutputStream("C:\\Users\\ajayd\\Desktop\\Java\\Files\\out4.txt");
ByteArrayOutputStream bout = new ByteArrayOutputStream();

while((i=bin.read())!=-1)
{
bout.write((char)i);
}
bout.writeTo(fout);
System.out.println("success");

}

}

