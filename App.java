package com.logger.loggingdemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args )
    {
    	logger.debug("this is debug logger");
    	logger.info("this is info logger");
    	logger.warn("this is warn logger");
    	logger.error("this is error logger");
    	logger.fatal("this is fatal logger");
    	
       // System.out.println( "Hello World!" );
    } 
}
