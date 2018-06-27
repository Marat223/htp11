/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape.creator_shape;

import net.mustaphin.project.shape.creatorshape.TetragonCreate;
import java.util.List;
import net.mustaphin.project.observer.Observer;
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
public class TetragonCreateNGTest {

    public TetragonCreateNGTest() {
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
    public void testCreate() throws Exception {
	System.out.println("create");
	String path = "";
	Observer observer = null;
	TetragonCreate instance = new TetragonCreate();
	List expResult = null;
	List result = instance.create(path, observer);
	assertEquals(result, expResult);
    }

    @Test
    public void testStringToPoints() {
	System.out.println("stringToPoints");
	List<String[]> stringCoordinate = null;
	TetragonCreate instance = new TetragonCreate();
	List expResult = null;
	List result = instance.stringToPoints(stringCoordinate);
	assertEquals(result, expResult);
    }

}
