/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.readdata.sequence;

import java.util.List;
import net.mustaphin.project.customexceptoin.WrongInputFileException;
import net.mustaphin.project.readdata.LineValidator;
import net.mustaphin.project.readdata.ParserLine;
import net.mustaphin.project.readdata.ReaderFile;

/**
 *
 * @author marat
 */
public class Sequencer {

    public static List<String[]> sequenceConvertData(String fileDirectory) throws WrongInputFileException {
	ReaderFile reader = new ReaderFile();
	List<String> raw = reader.readParameters(fileDirectory); //будет использован файл по-умолчанию
	ParserLine parser = new ParserLine();
	List<String[]> parsed = parser.parseLine(raw, " ");
	LineValidator validator = new LineValidator();
	List<String[]> valid = validator.validateDetached(parsed, 8);
	return valid;
    }

}
