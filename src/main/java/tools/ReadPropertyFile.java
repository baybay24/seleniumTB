package tools;

import java.io.*;
import java.util.Properties;


public class ReadPropertyFile {

	public static Properties read(String fileName) {

		String rootPath = new ReadPropertyFile().getClass().getResource("../").getPath();

		if(!rootPath.equals("")) {

			String filePath = rootPath+fileName;
			System.out.println(filePath);
			try {
				InputStreamReader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(filePath)),"UTF-8");
				Properties properties = new Properties();
			    properties.load(reader);
			    properties.getProperty(filePath);
			    return properties;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
			}
					
		}
		return null;
	}
	
}
