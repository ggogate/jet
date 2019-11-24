package com.gogate.jet.commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandRunner {

	private static final Logger logger = LoggerFactory.getLogger(CommandRunner.class);
	
	public void changeDirectory(String directory){
		logger.info("changeDirectory: " + directory);		
	}
}
