package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readConfigdata {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\\\taps4\\\\eclipse-workspace\\Java_coding\\src\\PropertiesFile\\config.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);

		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("timeout"));
	}
}
