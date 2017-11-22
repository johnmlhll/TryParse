import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tryparse.ProcessNumber;

/**
 * Class Definition: Unit Testing all the TryParse methods implemented in the project
 * @author jmulhall
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({tryparse.TryparseSuite.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
