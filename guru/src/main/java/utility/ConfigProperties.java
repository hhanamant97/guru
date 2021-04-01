package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties {
	 Properties pro;

	public String readConfigProperties(String properties) {

		pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"F:\\velocity-pune\\2021\\guru\\src\\main\\java\\config\\config.properties");
			pro.load(fis);
			return pro.getProperty(properties);
		} catch (Exception e) {
          System.out.println("Not get properties "+e.getMessage());
		}
		return null;
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getStringUrl() {
		return pro.getProperty("qaUrl");
	}
}
