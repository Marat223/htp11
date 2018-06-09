/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.readData.sequence;

import java.util.List;
import net.mustaphin.project.readData.parser.ParserLine;
import net.mustaphin.project.readData.readerFile.ReaderFile;
import net.mustaphin.project.readData.validator.LinesValidator;

/**
 *
 * @author marat
 */
public class Sequencer {

    public static List<String[]> sequenceInputData(String path) {
	ReaderFile reader = new ReaderFile();
	List<String> raw = reader.readParameters(path); //будет использован файл по-умолчанию
	ParserLine parser = new ParserLine();
	List<String[]> parsed = parser.parseLine(raw, " ");
	LinesValidator validator = new LinesValidator();
	List<String[]> valid = validator.validateDetached(parsed, 8);
	return valid;
    }

}
