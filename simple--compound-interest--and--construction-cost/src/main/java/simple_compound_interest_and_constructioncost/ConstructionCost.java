package simple_compound_interest_and_constructioncost;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class ConstructionCost {
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCost.class);
	int cost,area;
	String type;
	public float material_type() {
		int area;
		Scanner input=new Scanner(System.in);
		LOGGER.info("\nTo Estimate House Construction Cost");
		LOGGER.info("Enter Area:");
		area=input.nextInt();
		LOGGER.info("If they want fully automated ,type should be:fully_automated");
		LOGGER.info("Enter valid material type");
		type=input.next();
		if(type.equals("standard_material")) {
			cost=area*1200;
		}
		else if(type.equals("Above_standard_material")) {
		    cost=area*1500;
	    }
		else if(type.equals("high_standard_material")) {
			    cost=area*1800;
		}	
		else{
			if(type.equals("fully_automated")){
			   cost=area*2500;
			}
			else {
				LOGGER.info("Please enter a valid material type....");
			}
		}
		return(cost);
	}
}
