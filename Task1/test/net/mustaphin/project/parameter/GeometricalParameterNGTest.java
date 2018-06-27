/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

import net.mustaphin.project.constant.ShapeType;
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
public class GeometricalParameterNGTest {

    public GeometricalParameterNGTest() {
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
    public void testGetType() {
	System.out.println("getType");
	GeometricalParameter instance = new GeometricalParameter();
	ShapeType expResult = null;
	ShapeType result = instance.getType();
	assertEquals(result, expResult);
    }

    @Test
    public void testSetType() {
	System.out.println("setType");
	ShapeType type = null;
	GeometricalParameter instance = new GeometricalParameter();
	instance.setType(type);
    }

    @Test
    public void testGetArea() {
	System.out.println("getArea");
	GeometricalParameter instance = new GeometricalParameter();
	double expResult = 0.0;
	double result = instance.getArea();
	assertEquals(result, expResult);
    }

    @Test
    public void testSetArea() {
	System.out.println("setArea");
	double area = 0.0;
	GeometricalParameter instance = new GeometricalParameter();
	instance.setArea(area);
    }

    @Test
    public void testGetPerimeter() {
	System.out.println("getPerimeter");
	GeometricalParameter instance = new GeometricalParameter();
	double expResult = 0.0;
	double result = instance.getPerimeter();
	assertEquals(result, expResult);
    }

    @Test
    public void testSetPerimeter() {
	System.out.println("setPerimeter");
	double perimeter = 0.0;
	GeometricalParameter instance = new GeometricalParameter();
	instance.setPerimeter(perimeter);
    }

    @Test
    public void testIsIsTetragon() {
	System.out.println("isIsTetragon");
	GeometricalParameter instance = new GeometricalParameter();
	boolean expResult = false;
	boolean result = instance.isIsTetragon();
	assertEquals(result, expResult);
    }

    @Test
    public void testSetIsTetragon() {
	System.out.println("setIsTetragon");
	boolean isTetragon = false;
	GeometricalParameter instance = new GeometricalParameter();
	instance.setIsTetragon(isTetragon);
    }

    @Test
    public void testIsIsConvex() {
	System.out.println("isIsConvex");
	GeometricalParameter instance = new GeometricalParameter();
	boolean expResult = false;
	boolean result = instance.isIsConvex();
	assertEquals(result, expResult);
    }

    @Test
    public void testSetIsConvex() {
	System.out.println("setIsConvex");
	boolean isConvex = false;
	GeometricalParameter instance = new GeometricalParameter();
	instance.setIsConvex(isConvex);
    }

    @Test
    public void testHashCode() {
	System.out.println("hashCode");
	GeometricalParameter instance = new GeometricalParameter();
	int expResult = 0;
	int result = instance.hashCode();
	assertEquals(result, expResult);
    }

    @Test
    public void testEquals() {
	System.out.println("equals");
	Object obj = null;
	GeometricalParameter instance = new GeometricalParameter();
	boolean expResult = false;
	boolean result = instance.equals(obj);
	assertEquals(result, expResult);
    }

    @Test
    public void testToString() {
	System.out.println("toString");
	GeometricalParameter instance = new GeometricalParameter();
	String expResult = "";
	String result = instance.toString();
	assertEquals(result, expResult);
    }

}
