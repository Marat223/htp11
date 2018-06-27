/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter.registrator;

import java.util.Map;
import net.mustaphin.project.parameter.GeometricalParameter;
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
public class RegistratorNGTest {
    
    public RegistratorNGTest() {
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
    public void testGetInstance() {
	System.out.println("getInstance");
	Registrator expResult = null;
	Registrator result = Registrator.getInstance();
	assertEquals(result, expResult);
    }

    @Test
    public void testInsertParameter() {
	System.out.println("insertParameter");
	int id = 0;
	GeometricalParameter external = null;
	Registrator instance = null;
	instance.insertParameter(id, external);
    }

    @Test
    public void testGetId() {
	System.out.println("getId");
	GeometricalParameter externalParameter = null;
	Registrator instance = null;
	int expResult = 0;
	int result = instance.getId(externalParameter);
	assertEquals(result, expResult);
    }

    @Test
    public void testGetParameter() {
	System.out.println("getParameter");
	int id = 0;
	Registrator instance = null;
	GeometricalParameter expResult = null;
	GeometricalParameter result = instance.getParameter(id);
	assertEquals(result, expResult);
    }

    @Test
    public void testGetParameters() {
	System.out.println("getParameters");
	Registrator instance = null;
	Map expResult = null;
	Map result = instance.getParameters();
	assertEquals(result, expResult);
    }

    @Test
    public void testRemoveParameter() {
	System.out.println("removeParameter");
	int id = 0;
	Registrator instance = null;
	instance.removeParameter(id);
    }
    
}
