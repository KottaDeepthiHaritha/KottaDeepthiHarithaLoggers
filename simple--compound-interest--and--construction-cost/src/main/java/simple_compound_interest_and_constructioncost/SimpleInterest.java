package simple_compound_interest_and_constructioncost;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
class SimpleInterest  {
	private static final Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
	float principle,time,rateofinterest;
	public  void simple_interest_calculation() {
		Scanner input=new Scanner(System.in);
		LOGGER.info("Simple Interest calculation");
		LOGGER.info("Enter the Principle:");principle=input.nextFloat();
		LOGGER.info("Enter the Time(in years):");
        time=input.nextFloat();
        LOGGER.info("Enter the Rate of Interest:");
    	rateofinterest=input.nextFloat();
	}
	public void display_simple(){
		float simpleinterest;
		simpleinterest=((principle*time*rateofinterest)/100);
		LOGGER.info("Simple Interest: "+simpleinterest);
		
	}

}
