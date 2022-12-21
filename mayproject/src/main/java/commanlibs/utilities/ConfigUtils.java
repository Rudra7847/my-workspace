package commanlibs.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	public static Properties readproperties(String filename) throws IOException
	{
		FileInputStream filereader=new FileInputStream(filename);
		Properties property=new Properties();
		property.load(filereader);
		return property;
		
	}

}
