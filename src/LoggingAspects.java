package com.capgemini.bankapp.aspects;

import org.springframework.stereotype.*;


@Component
@Aspect 
public class LoggingAspects {
	private Logger logger = Logger.getLogger(LoggingAspects.class);
	@After("execution(* com.capgemini.bankapp.service.impl.BankAccountService")

	public void log(){
		logger.info("Account Created successfully...");
	}

}