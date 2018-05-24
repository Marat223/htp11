/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author marat
 */
public class ReaderFile {

    public void readParameters() {
	try (Stream<String> stream = Files.lines(Paths.get("D:/NetBeansProjects/htp11/project/src/net/mustaphin/project/files/file.txt"))) {
	    stream.forEach(System.out::println);
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
    }
}
