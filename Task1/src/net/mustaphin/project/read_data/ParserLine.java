/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marat
 */
public class ParserLine {

    public List<String[]> parseLine(List<String> lines, String delimeter) {
	List<String[]> parsed = new ArrayList<>();
	for (String line : lines) {
	    String[] detached = line.trim().split(delimeter);
	    parsed.add(detached);
	    System.out.print(detached[0] + "  " + detached[1] + "  " + detached[2] + "  " + detached[3] + "\n");
	}
	return parsed;
    }
}
