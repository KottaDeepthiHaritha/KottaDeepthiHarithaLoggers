package simple_compound_interest_and_constructioncost;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class DemoMain 
{
	private static final Logger LOGGER=LogManager.getLogger(DemoMain.class);
    public static void main(String[] args )
    {
        SimpleInterest si=new SimpleInterest();
        si.simple_interest_calculation();
        si.display_simple();
        CompoundInterest ci=new CompoundInterest();
        ci.compound_interest_calculation();
        ci.display_compound();
        ConstructionCost cc=new ConstructionCost();
        float cost=cc.material_type();
        LOGGER.info("Construction cost="+cost);
        
        
    }
}
