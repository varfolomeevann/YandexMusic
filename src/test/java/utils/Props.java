package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Props {
    static Logger log = Logger.getRootLogger();
    private static String USER_PROPERTY;
    private static String PATH_TO_CONFIG = "src\\main\\resources\\user.properties";
       
    public static String getUserProperties(String userProperty){
	Properties property  =  new Properties();
		
	try {
	    property.load(new FileInputStream(PATH_TO_CONFIG));
	} catch (IOException e) {
	    log.error("Файл конфигурации не найден " + PATH_TO_CONFIG);
	}

	USER_PROPERTY = property.getProperty(userProperty);
	return USER_PROPERTY;
    }
   
}
