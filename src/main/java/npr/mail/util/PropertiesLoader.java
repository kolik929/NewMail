package npr.mail.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {


	public static String getProperty(String value) {

		Properties prop = new Properties();
		InputStream input = null;
		String out = "";
		try {

			input = new FileInputStream("./src/main/resources/date.properties");

			// load a properties file
			prop.load(input);

			out = new String((prop.getProperty(value)).getBytes("ISO-8859-1"), "UTF-8");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return out;
	}

}
