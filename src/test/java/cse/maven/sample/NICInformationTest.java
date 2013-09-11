/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;

import junit.framework.TestCase;
import org.joda.time.DateTime;

/**
 *
 * @author Dumindu
 */
public class NICInformationTest extends TestCase {
    
    public NICInformationTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of isMale method, of class NICInformation.
     */
    public void testIsMale() throws Exception {
        System.out.println("isMale");
        NICInformation instance = new NICInformation("920113320V");
        boolean expResult = true;
        boolean result = instance.isMale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of birthday method, of class NICInformation.
     */
    public void testBirthday() throws Exception {
        System.out.println("birthday");
        NICInformation instance = new NICInformation("920113320V");
        DateTime expResult = new DateTime(1992,1,11,0,1);
        DateTime result = instance.birthday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isVoter method, of class NICInformation.
     */
    public void testIsVoter() throws Exception {
        System.out.println("isVoter");
        NICInformation instance = new NICInformation("920113320V");
        boolean expResult = true;
        boolean result = instance.isVoter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
