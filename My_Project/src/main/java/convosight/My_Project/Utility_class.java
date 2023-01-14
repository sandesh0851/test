package convosight.My_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_class extends Base_class
{
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sandesh gaikwad\\eclipse-workspace\\My_Project\\convosight.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}

}
