import java.io.*;
public class FileCreation {

	public static void main(String[] args) {
		
		try{
		File obj = new File("newfile.txt");
		
		PrintWriter pw = new PrintWriter(obj);
		
		if(!obj.exists()){
			obj.createNewFile();
		}
		pw.println("Write this into the file");
		pw.println("Many new lines are going to add 10000");
		pw.close();
		System.out.println("Done");
		}catch(Exception e){
			System.out.println(e);
		}
			

	}

}
