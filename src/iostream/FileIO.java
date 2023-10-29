package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

class operation{
	
}

public class FileIO {
	
	
	public void writeToFile() throws IOException
	{
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testfile.txt");
			String sample = "Welcome";
			byte[] value = sample.getBytes();
			fout.write(value);
			fout.close();
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFromFile() throws IOException
	{
		try (FileInputStream fin = new FileInputStream("D:\\testfile.txt")) {
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.println(i);
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception caught");
		}
	}
	
	public static void main(String[] a) throws IOException
	{
		FileIO obj = new FileIO();
		obj.writeToFile();
		obj.readFromFile();
	}

}
