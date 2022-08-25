package com.realEstate.paramountProperty.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.Icon;
public class FileUtility 
{
	/**
	 * its used return the value from the property file based on key  
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key)throws Throwable
	{
		
		FileInputStream fis= new FileInputStream(IConstants.propertyFilePath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}

}
