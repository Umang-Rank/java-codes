package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\Adhyayan");
		f.mkdir();
		File trainer=new File(f,"Trainer");
		trainer.mkdir();
		
		File course = new File(f,"Course");
		course.mkdir();
		
		File teacher=new File(f,"Teacher");
		teacher.mkdir();
		
		File java=new File(trainer,"Java");
		java.mkdir();
		
		File python=new File(trainer,"Python");
		python.mkdir();
		
		File f1=new File(java,"java.txt");
		try{
			f1.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		File f2=new File(python,"python.txt");
		try {
			f2.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			FileWriter fr= new FileWriter(f1);
			fr.write("Umang rank\nRushab yadav\nAnsh udawant");
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fr= new FileWriter(f2);
			fr.write("Nikita maam\nGirish sir\nAparna maam");
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
