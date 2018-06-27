/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.readdata;

import java.util.ArrayList;
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
public class ParserLineNGTest {

    private List<String[]> expResult = new ArrayList<>();
    private List<String[]> result;

    public ParserLineNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
	ReaderFile readerFile = new ReaderFile();
	List<String> lines = readerFile.readParameters("");
	ParserLine instance = new ParserLine();
	result = instance.parseLine(lines, " ");
	String arr0[] = {"0.0", "0.0", "1.0", "0.0"};
	String arr1[] = {"2.5", "0.0", "5.0", "5.0"};
	String arr2[] = {"0.0", "0.0", "0.0", "10.0"};
	String arr3[] = {"1.0", "1.0", "z.0", "2.0"};
	String arr4[] = {"1.0", "1.0", "2.0", "2.0"};
	expResult.add(arr0);
	expResult.add(arr1);
	expResult.add(arr2);
	expResult.add(arr3);
	expResult.add(arr4);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testParseLine() {
	System.out.println("parseLine");
	assertEquals(result, expResult);
    }

}
