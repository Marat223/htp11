/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data.sequence;

import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marat
 */
public class SequencerNGTest {
    
    public SequencerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testSequenceInputData() throws Exception {
	System.out.println("sequenceInputData");
	String fileDirectory = "";
	List expResult = null;
	List result = Sequencer.sequenceConvertData(fileDirectory);
	assertEquals(result, expResult);
	fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
    
}
