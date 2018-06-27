/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.readdata;

import net.mustaphin.project.readdata.LineValidator;
import java.util.List;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marat
 */
public class LineValidatorNGTest {
    
    public LineValidatorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testValidateDetached() {
	System.out.println("validateDetached");
	List<String[]> detached = null;
	int amount = 0;
	LineValidator instance = new LineValidator();
	List expResult = null;
	List result = instance.validateDetached(detached, amount);
	assertEquals(result, expResult);
    }
    
}
