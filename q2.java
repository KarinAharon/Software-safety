import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q2 {

//This function check if a file contains 2 words, while for each word the first letter is upper letter
//we use a null in case where an object is required. The program flies.
public boolean isValidName(File f) throws IOException {

	FileReader fr = new FileReader(f);    
	BufferedReader br = new BufferedReader(fr);
	String Line = br.readLine();
    String names[] = Line.split(" ");
     if (names.length != 2) {
       return false;
  }

  return (isUpper(names[0]) && isUpper(names[1]));

}

//This function checks whether the first letter of the word is a large letter
private boolean isUpper(String string) {
	if(string.charAt(0) >= 65 && string.charAt(0) <= 90) return true;
	return false;
}

public static void main(String[] args) throws IOException{
	q2 q = new q2();
	File file = new File("test.txt"); //empty
	File file2 = new File("test2.txt"); //full

	System.out.println(q.isValidName(file2)); //ok
	System.out.println(q.isValidName(file)); //error - null pointer exception

}	
}

