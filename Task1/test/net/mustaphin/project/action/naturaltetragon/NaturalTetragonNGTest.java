/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.naturaltetragon;

import net.mustaphin.project.action.naturaltetragon.NaturalTetragon;
import net.mustaphin.project.shape.Point;
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
public class NaturalTetragonNGTest {
    
    public NaturalTetragonNGTest() {
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
    public void testCheckNatural() {
	System.out.println("checkNatural");
	Point[] point = null;
	NaturalTetragon instance = new NaturalTetragon();
	boolean expResult = false;
	boolean result = instance.checkNatural(point);
	assertEquals(result, expResult);
    }
    
}
