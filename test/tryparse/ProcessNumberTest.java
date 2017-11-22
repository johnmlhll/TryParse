/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryparse;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tryparse.ProcessNumber;

/**
 *
 * @author jmulhall
 */
public class ProcessNumberTest {
    
    public ProcessNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    /**
     * Test of tryParseInt method, of class ProcessNumber.
     */
    @Test
    public void testTryParseInt() {
        System.out.println("tryParseInt");
        String goodInt = "42";
        String badInt = "badIntEntry";
        ProcessNumber parse = new ProcessNumber();
        int actualGoodResult = 0;
        int actualBadResult = 0;
        
        actualGoodResult = parse.tryParseInt(goodInt);
        actualBadResult = parse.tryParseInt(badInt);
        
        Assert.assertEquals(42, actualGoodResult);
        Assert.assertEquals(0, actualBadResult);   
        System.out.println("*End of Test = testTryParseInt()");
    }
    /**
     * Test of tryParseLong method, of class ProcessNumber.
     */
    @Test
    public void testTryParseLong() {
        System.out.println("tryParseLong");
        String goodLong = "42";
        String badLong = "BadLongEntry";
        ProcessNumber parse = new ProcessNumber();
        long actualGoodResult = 0L;
        long actualBadResult = 0L;
        
        actualGoodResult = parse.tryParseLong(goodLong);
        actualBadResult = parse.tryParseLong(badLong);
        
        Assert.assertEquals(42, actualGoodResult);
        Assert.assertEquals(0, actualBadResult);
        System.out.println("*End of Test = testTryParseLong()");
    }
    /**
     * Test of tryParseDouble method, of class ProcessNumber.
     */
    @Test
    public void testTryParseDouble() {
        System.out.println("tryParseDouble");
        String goodDouble = "42.457";
        String badDouble = "BadDoubleEntry";
        ProcessNumber parse = new ProcessNumber();
        double actualGoodResult = 0.000;
        double actualBadResult = 0.000;
        
        actualGoodResult = parse.tryParseDouble(goodDouble);
        actualBadResult = parse.tryParseDouble(badDouble);
        
        Assert.assertEquals(42.457, actualGoodResult, 42.457);
        Assert.assertEquals(0.000, actualBadResult, 0.000);
        System.out.println("*End of Test = testTryParseDouble()");        
    }
    /**
     * Test of tryParseFloat method, of class ProcessNumber.
     */
    @Test
    public void testTryParseFloat() {
        System.out.println("tryParseFloat");
        String goodFloat = "42.457F";
        String badFloat = "BadFloatEntry";
        ProcessNumber parse = new ProcessNumber();
        float actualGoodResult = 42.457F;
        float actualBadResult = 0.000F;
        
        actualGoodResult = parse.tryParseFloat(goodFloat);
        actualBadResult = parse.tryParseFloat(badFloat);
        
        Assert.assertEquals(42.457F, actualGoodResult, 42.457F);
        Assert.assertEquals(0.000F, actualBadResult, 0.000F);
        System.out.println("*End of Test = testTryParseFloat()");
    }
    @AfterClass
    public static void tearDownClass() {
    }
}
