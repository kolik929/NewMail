package npr.mail.util;


public class Logger {

	private String stepName = "";
	
	final static org.testng.log4testng.Logger logger = org.testng.log4testng.Logger.getLogger(Object.class); 
	
	public void logStartStep(String stepName){
		this.stepName = stepName;
		logger.info("STARTING STEP: "+this.stepName);
	}
	
	public void logEndStep(String stepName){
		logger.info("DONE STEP: "+stepName);
	}
	
	public void logEndStep(){
		logger.info("DONE STEP: "+this.stepName);
	}
}
