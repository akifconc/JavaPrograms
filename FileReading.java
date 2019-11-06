import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("newfile.txt"));
			String line;
			
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}finally
		{
			try
			{
				br.close();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
