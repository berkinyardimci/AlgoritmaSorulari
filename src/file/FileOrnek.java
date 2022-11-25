package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek {
	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("deneme.txt");
			FileInputStream fis = new FileInputStream("deneme.txt");
			fos.write(65);
			byte[] array = { 100, 80, 88 };
			fos.write(array);

			String string = "Hello java";
			// string i byte çevircez
			fos.write(string.getBytes());
			// System.out.println((char)fis.read());
			int deger;
			while ((deger = fis.read()) != -1) {
				System.out.print((char)deger);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		try {
			String path = "deneme5.txt";
			File file = new File(path);
			file.createNewFile();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			writer.write("satir1" + "\n");
			writer.write("satir2" + "\n");
			writer.flush();
		
			String deger2 ;
			while((deger2 = reader.readLine()) != null) {
				System.out.println(deger2);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
