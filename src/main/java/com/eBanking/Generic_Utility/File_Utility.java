package com.eBanking.Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
	
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("src/test/resources/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
