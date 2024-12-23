package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private Properties prop;


// Below method use to get data from proprty file 
//it @return Properties pro object

public Properties init_prop() {
	prop=new Properties();
	try {
		FileInputStream ip =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TestFacebookCucumber\\src\\test\\resorces\\config\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return prop;
	
}




}
