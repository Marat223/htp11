/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertEquals;
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
	List expResult = Arrays.asList("0.0 0.0 1.0 0.0 1.1 1.1 0.0 1.0", "2.5 0.0 5.0 5.0 2.5 5.0 0.0 2.5", "0.0 0.0 0.0 10.0 7.0 8.0 2.0 8.0", "1.0 1.0 z.0 2.0 3.0 3.0 4.0 4.0", "1.0 1.0 2.0 2.0 3.0 3.0 4.0 -4.0");
	List result = instance.readParameters(fileDirectory);
	System.out.println(expResult);
	System.out.println(result);
	assertEquals(result, expResult);
    }

}
