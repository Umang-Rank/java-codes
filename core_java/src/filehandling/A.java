package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	
	public static void main(String[] args) {
		try(FileReader fr=new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\core_java\\src\\filehandling\\a.txt");
				FileWriter fw=new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\core_java\\src\\filehandling\\b.txt");){
			int i=0;
			while((i=fr.read()) != -1) {
				//System.out.println((char)i);
				fw.write(i);
				fw.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
