package com.kraftly.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InputData {
	public static String getPropertyValue(String path,String key) throws IOException
	{
		
			String value=null;
			Properties properties=null;
			try {
				FileInputStream fis=new FileInputStream(path);
				
				properties=new Properties();
				
				properties.load(fis);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			value=properties.getProperty(key);
			
			
			return value;
		}
	

}
