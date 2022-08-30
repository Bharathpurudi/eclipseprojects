package log4jDemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4Main {
	private static final Logger LOGGER = LogManager.getLogger(Log4Main.class);
	public static void main(String[] args) {
		LOGGER.info("WELCOME MESSAGE");
		

	}

}
