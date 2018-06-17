/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import net.mustaphin.project.custom_excepoin.WrongInputFileException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author marat
 */
public class ReaderFile {

    public List<String> readParameters(String fileDirectory) throws WrongInputFileException {
	final Logger LOGGER = Logger.getLogger(ReaderFile.class);
	List<String> coordinates = new ArrayList<>();
	try {
	    if (new File(fileDirectory).exists()) {
		coordinates = Files.lines(Paths.get(fileDirectory)).collect(Collectors.toList());
	    } else {
		coordinates = Files.lines(Paths.get("resources/coordinate.txt")).collect(Collectors.toList());
	    }
	} catch (IOException ex) {
	    WrongInputFileException exception = new WrongInputFileException("Input file is not exists", ex);
	    LOGGER.log(Level.ERROR, fileDirectory, ex);
	    throw exception;
	}
	return coordinates;
    }
}
