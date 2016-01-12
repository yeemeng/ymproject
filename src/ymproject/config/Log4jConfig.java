package ymproject.config;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.event.LoggerListener;
import org.springframework.web.util.Log4jConfigListener;

@Configuration
public class Log4jConfig {
	private Appender getAppender() {
		Appender appender = new ConsoleAppender();
		appender.setLayout(layout());
		return appender;
	}
	
	private PatternLayout layout() {
		PatternLayout layout = new PatternLayout();
		layout.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
		return layout;
	}
	
	@Bean
	public Logger setAppender() {
		Logger logger = Logger.getRootLogger();
		logger.addAppender(getAppender());
		return logger;
	}
	
}
