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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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
    public void testGetINSTANSE() {
	System.out.println("getINSTANSE");
	TetragonRepository expResult = null;
	TetragonRepository result = TetragonRepository.getINSTANSE();
	assertEquals(result, expResult);
    }

    @Test
    public void testAddShape_Tetragon() throws Exception {
	System.out.println("addShape");
	Tetragon tetragon = null;
	TetragonRepository instance = null;
	int expResult = 0;
	int result = instance.addShape(tetragon);
	assertEquals(result, expResult);
    }

    @Test
    public void testAddShape_List() throws Exception {
	System.out.println("addShape");
	List<Tetragon> tetragons = null;
	TetragonRepository instance = null;
	instance.addShape(tetragons);
    }

    @Test
    public void testRemoveShape() throws Exception {
	System.out.println("removeShape");
	Tetragon tetragon = null;
	TetragonRepository instance = null;
	instance.removeShape(tetragon);
    }

    @Test
    public void testUpdateShape() throws Exception {
	System.out.println("updateShape");
	Tetragon tetragon = null;
	TetragonRepository instance = null;
	instance.updateShape(tetragon);
    }

    @Test
    public void testQuery() {
	System.out.println("query");
	ISpecification specification = null;
	TetragonRepository instance = null;
	List expResult = null;
	List result = instance.query(specification);
	assertEquals(result, expResult);
    }

    @Test
    public void testSort() {
	System.out.println("sort");
	Comparator<Tetragon> comparator = null;
	TetragonRepository instance = null;
	instance.sort(comparator);
    }

}
