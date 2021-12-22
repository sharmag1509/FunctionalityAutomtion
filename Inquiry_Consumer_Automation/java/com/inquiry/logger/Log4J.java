package com.inquiry.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
@SuppressWarnings("rawtypes")
public class Log4J {
	public static Logger initLog4j( Class cl) {
		Logger log = Logger.getLogger(cl);
		PropertyConfigurator.configure(".\\src\\main\\resources\\log4j.properties");
		return log;
	}
}
