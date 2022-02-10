package com.janbask.folderfile;
import java.io.File;

import javax.tools.FileObject;

public class Folder_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\AUG_4\\selenium");
		f.mkdir();
		System.out.println("folder is created");

	}

}
