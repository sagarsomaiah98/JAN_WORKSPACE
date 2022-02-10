package com.janbask.folderfile;
import java.io.File;
import java.io.IOException;

public class Delete_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\somai\\Desktop\\Test\\test.txt");
		f.delete();		
		System.out.println("text file deleted");
		
	}

}
