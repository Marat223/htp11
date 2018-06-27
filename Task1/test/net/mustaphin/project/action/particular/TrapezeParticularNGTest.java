/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.particular;

import net.mustaphin.project.parameter.PrepareParameter;
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
public class TrapezeParticularNGTest {
    
    public TrapezeParticularNGTest() {
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
    public void testClarify() {
	System.out.println("clarify");
	PrepareParameter prepare = null;
	TrapezeParticular instance = new TrapezeParticular();
	boolean expResult = false;
	boolean result = instance.clarify(prepare);
	assertEquals(result, expResult);
    }

    @Test
    public void testCornerType() {
	System.out.println("cornerType");
	double[] cos = null;
	TrapezeParticular instance = new TrapezeParticular();
	int[] expResult = null;
	int[] result = instance.cornerType(cos);
	assertEquals(result, expResult);
    }
    
}
