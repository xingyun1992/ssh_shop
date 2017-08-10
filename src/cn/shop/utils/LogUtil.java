package cn.shop.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogUtil {
	
	private static LogUtil logUtil = new LogUtil();
	private Logger log ;
	
	public static LogUtil get() {
		return logUtil;
	}
	
	private  LogUtil() {
		log = Logger.getLogger("xingyun");
		BasicConfigurator.configure();
	}
	
	public void info(String msg) {
		log.info(msg);
	}
}
