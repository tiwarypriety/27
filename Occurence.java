import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Occurence {

	public static void main(String[] args) throws IOException {
	
		int n;
		int occurence = 0;
		String line = null;
FileReader fr = new FileReader("d:/file.txt");

while((n=fr.read())!=-1)
{
BufferedReader br = new BufferedReader(fr);
	 line = br.readLine();
}
	String word[] = line.split(" ");
	
	
		String str = "nucleus";
		
		for(int i=0;i<word.length;i++)
		{
				if(word[i].equals(str))
			{
				occurence++;

			}
		}
			System.out.println("occurence = "+occurence);
	}
}
