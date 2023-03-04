package com.tech.blog.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Helper {

	public static boolean deleteFile(String path) {

		boolean f = true;
		try {

			File file = new File(path);
			f = file.delete();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	
	public static boolean saveFile(InputStream is , String path) {
		boolean f = false;
		
		try {
//			int read =0;
//			byte b[] = new byte[1024];
			byte b[] = new byte[is.available()];
			is.read(b);
			
			FileOutputStream fos = new FileOutputStream(path);
//			while ((read = is.read(b)) != -1) {  
//				fos.write(b, 0, read);  
//            } 
			fos.write(b);
			
			fos.flush();
			fos.close();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
