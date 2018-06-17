/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

import net.mustaphin.project.action.area.Area;
import net.mustaphin.project.action.particular.Particular;
import net.mustaphin.project.constant.ShapeType;
import net.mustaphin.project.shape.Point;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marat
 */
public class PrepareParameterNGTest {
    
    public PrepareParameterNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testFindSides() {
	System.out.println("findSides");
	Point[] point = null;
	double[] expResult = null;
	double[] result = PrepareParameter.findSides(point);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testCheckParticular() {
	System.out.println("checkParticular");
	Particular particular = null;
	PrepareParameter instance = null;
	boolean expResult = false;
	boolean result = instance.checkParticular(particular);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testFindArea() {
	System.out.println("findArea");
	Area area = null;
	PrepareParameter instance = null;
	double expResult = 0.0;
	double result = instance.findArea(area);
	assertEquals(result, expResult, 0.0);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testFindCos_3args() {
	System.out.println("findCos");
	double a = 0.0;
	double b = 0.0;
	double c = 0.0;
	PrepareParameter instance = null;
	double expResult = 0.0;
	double result = instance.findCos(a, b, c);
	assertEquals(result, expResult, 0.0);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testFindCos_doubleArr() {
	System.out.println("findCos");
	double[] side = null;
	PrepareParameter instance = null;
	double[] expResult = null;
	double[] result = instance.findCos(side);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testGetShapeType() {
	System.out.println("getShapeType");
	PrepareParameter instance = null;
	ShapeType expResult = null;
	ShapeType result = instance.getShapeType();
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testGetSide() {
	System.out.println("getSide");
	PrepareParameter instance = null;
	double[] expResult = null;
	double[] result = instance.getSide();
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testSetSide() {
	System.out.println("setSide");
	double[] side = null;
	PrepareParameter instance = null;
	instance.setSide(side);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testGetCos() {
	System.out.println("getCos");
	PrepareParameter instance = null;
	double[] expResult = null;
	double[] result = instance.getCos();
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testSetCos() {
	System.out.println("setCos");
	double[] cos = null;
	PrepareParameter instance = null;
	instance.setCos(cos);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
    
}
