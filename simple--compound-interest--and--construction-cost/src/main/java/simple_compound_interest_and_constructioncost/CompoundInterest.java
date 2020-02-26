package simple_compound_interest_and_constructioncost;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.lang.Math;
public class CompoundInterest {
	private static final Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
	double initial_principal_balance,interest_rate,number_of_times_interest_applied,number_of_time_periods_elapsed;
	public void compound_interest_calculation() {
		Scanner input=new Scanner(System.in);
		LOGGER.info("\nCompound Interest calculation");
		LOGGER.info("Enter the initial_principal_balance:");initial_principal_balance=input.nextDouble();
		LOGGER.info("Enter the interest_rate:");
    	interest_rate=input.nextDouble();
    	LOGGER.info("Enter the number_of_times_interest_applied:");
    	number_of_times_interest_applied=input.nextDouble();
    	LOGGER.info("Enter the number_of_time_periods_elapsed:");
    	number_of_time_periods_elapsed=input.nextDouble();
	}
	public void display_compound() {
		double compoundinterest;
		double rn=1+(interest_rate/number_of_times_interest_applied);
		double nt=number_of_times_interest_applied*number_of_time_periods_elapsed;
		compoundinterest=initial_principal_balance*Math.pow(rn,nt);
		LOGGER.info("Compound Interest: "+compoundinterest);
	}

}
