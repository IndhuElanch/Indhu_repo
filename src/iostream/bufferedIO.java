package iostream;

import java.io.*;

public class bufferedIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os = new BufferedOutputStream(new FileOutputStream("D:\\testfile1.txt"));
		InputStream is =  new BufferedInputStream(new FileInputStream("D:\\testfile.txt"));
		//int input;
		byte[] input = is.readAllBytes();
		
		//while(( input = is.read())!=-1)
		{
			System.out.println(input);
			os.write(input);
		}
		//byte[] ip = "".getBytes();
		byte[] ip = new byte[10];
		is.read(ip);
		os.write(ip);
		os.close();
		is.close();
	}

}
