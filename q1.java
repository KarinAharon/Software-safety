import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q1{

	//This function divides the row in a file by @
	//The program continues to run even if the file is null

	public void splitLine(File f) throws IOException {
		
	try {
		FileReader fr=new FileReader(f);    
		BufferedReader br=new BufferedReader(fr);
		
			String Line = br.readLine();
			String s[] = Line.split("@");
			for (String a : s) 
	            System.out.println(a); 
			br.close();    
			fr.close(); 
	 }
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("The file is empty");}

	}
	
	public static void main(String[] args) throws IOException{
		q1 q = new q1();
		File file = new File("test1.txt"); //full
		File file2 = new File("test.txt"); //empty

		q.splitLine(file2); // error - null pointer exception
		q.splitLine(file); // OK
	
	}}
