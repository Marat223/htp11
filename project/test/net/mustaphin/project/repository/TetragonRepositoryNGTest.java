/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.Comparator;
import java.util.List;
import net.mustaphin.project.shape.Tetragon;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marat
 */
public class TetragonRepositoryNGTest {
    
    public TetragonRepositoryNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testGetINSTANSE() {
	System.out.println("getINSTANSE");
	TetragonRepository expResult = null;
	TetragonRepository result = TetragonRepository.getINSTANSE();
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testAddShape() throws Exception {
	System.out.println("addShape");
	Tetragon tetragon = null;
	TetragonRepository instance = null;
	int expResult = 0;
	int result = instance.addShape(tetragon);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testRemoveShape() throws Exception {
	System.out.println("removeShape");
	Tetragon tetragon = null;
	TetragonRepository instance = null;
	instance.removeShape(tetragon);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testUpdateShape() throws Exception {
	System.out.println("updateShape");
	Tetragon tetragon = null;
	TetragonRepository instance = null;
	instance.updateShape(tetragon);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testQuery() {
	System.out.println("query");
	ISpecification specification = null;
	TetragonRepository instance = null;
	List expResult = null;
	List result = instance.query(specification);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    @Test
    public void testSort() {
	System.out.println("sort");
	Comparator<Tetragon> comparator = null;
	TetragonRepository instance = null;
	instance.sort(comparator);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
    
}
