import org.apache.log4j.PropertyConfigurator;

import mx4j.log.Logger;

public class LoggerTest {

	static configFilename="C:\\Users\\MURUGANANDHAM\\eclipse-workspace\\automation\test-output\\log4j.properties";
	
	public static final Logger logger =Logger.getLogger(LoggerTest.class.getName());
	
	public static void getlogger() {
		// TODO Auto-generated method stub

		PropertyConfigurator.configure(configFilename);
		
		
	}
        @Test 
	public void testLogger(){
		getlogger();
		logger.info("test log1");
		logger.info("test log2");
		logger.info("test log3");
		
	}
	
}
