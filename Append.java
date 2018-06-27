import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Append 
{
	public static void main(String a[]) throws IOException
	{
		FileWriter f = new FileWriter("d:/file.txt",true);
		String  str = " nucleus Software!!";
		f.write(str);
		f.flush();
		FileReader f1 = new FileReader("d:/file.txt");
		int n;
			while((n =f1.read())!=-1)
			{
			System.out.print((char)n);
			}
	}
}
