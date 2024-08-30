package com.nist.exception.custom;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args)throws Exception {
		File file = new File("C://Users//7//Desktop//hwllo.txt");
		if(file.createNewFile()==true) {
			System.out.println("create success");
		} else {
			System.out.println("file already exist");
		}
		FileWriter fw = new FileWriter(file,true);
		fw.write("\n hello world");
		fw.close();
		
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String value = sc.nextLine();
			System.out.println(value);
		}
		sc.close();
	}
}
