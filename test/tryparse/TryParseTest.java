/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryparse;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jmulhall
 */
public class TryParseTest {
    
    public TryParseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    /**
     * Test of main method, of class TryParse.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TryParse.main(args);
        TryParse parseMain = new TryParse();
        
        Assert.assertNotNull("Main Method Class Object Call", parseMain);
    }   
    @AfterClass
    public static void tearDownClass() {
    }
}
