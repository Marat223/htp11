/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author marat
 */
public class ReaderFile {

    public List readParameters() {
	List<String> coordinates = new ArrayList<>();
	try {
	    coordinates = Files.lines(Paths.get("D:/NetBeansProjects/htp11/project/src/net/mustaphin/project/files/file.txt")).collect(Collectors.toList());
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
	return coordinates;
    }
}
