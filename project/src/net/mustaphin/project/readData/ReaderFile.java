/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.readData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import net.mustaphin.project.customExcepoin.WrongInputFileException;

/**
 *
 * @author marat
 */
public class ReaderFile {

    public List<String> readParameters(String location) throws WrongInputFileException {
	Path path = Paths.get(location);
	List<String> coordinates = new ArrayList<>();
	try {
	    if (Files.exists(path)) {
		coordinates = Files.lines(Paths.get(location)).collect(Collectors.toList());
	    } else {
		coordinates = Files.lines(Paths.get("D:/NetBeansProjects/htp11/project/src/net/mustaphin/project/files/coordinate.txt")).collect(Collectors.toList());//TODO redo to relative path
	    }
	} catch (IOException ex) {
	    throw new WrongInputFileException("there is not exists default file", ex);
	}
	return coordinates;
    }
}
