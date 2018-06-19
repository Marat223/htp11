/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data;

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

    private List<String> parametr;

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
	parametr = readerFile.readParameters("");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testParseLine() {
	System.out.println("parseLine");
	List<String> lines = parametr;
	String delimeter = "";
	ParserLine instance = new ParserLine();
	List expResult = null;
	List result = instance.parseLine(lines, delimeter);
	assertEquals(result, expResult);
    }

}
