package com.janbask.folderfile;
import java.io.File;
import java.io.IOException;

public class Create_Text_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\somai\\Desktop\\Test\\test.txt");
		f.createNewFile();
		
		System.out.println("text file created");
	}

}
