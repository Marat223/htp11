/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data;

import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.Test;

/**
 *
 * @author marat
 */
public class ReaderFileNGTest {

    @Test
    public void testReadParameters() throws Exception {
	System.out.println("readParameters");
	String fileDirectory = "";
	ReaderFile instance = new ReaderFile();
	List expResult = null;
	List result = instance.readParameters(fileDirectory);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

}
