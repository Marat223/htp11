/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project;

import java.util.List;
import net.mustaphin.project.custom_excepoin.WrongInputFileException;
import net.mustaphin.project.read_data.sequence.Sequencer;

/**
 *
 * @author marat
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws WrongInputFileException {
	Sequencer sequenser = new Sequencer();
	List<String[]> data = sequenser.sequenceConvertData("");
    }

}
