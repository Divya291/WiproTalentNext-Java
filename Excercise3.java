package talentnext;
import java.io.FileOutputStream;
public class Excercise3 {
	public static void main(String[] args) {
		try{ // to handle the errors or exceptions
			FileOutputStream fout=new FileOutputStream("C:\\Wipro.txt");
			//WIPRO.TXT WILL BE OPENED
			fout.write(65); //65 is the ASCII Value of A
			fout.close(); // CLOSING WIPRO.TXT
			System.out.println("success...");
			}catch(Exception e){System.out.println(e);}

	}

}
