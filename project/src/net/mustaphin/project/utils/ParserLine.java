/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.utils;

import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author marat
 */
public class ParserLine {

    public List<String[]> parseLine(List<String> lines) {
	Pattern pattern = Pattern.compile("");
	for (String string : lines) {
	    String line[] = string.split(" ");
	}
	return null;
    }
}
