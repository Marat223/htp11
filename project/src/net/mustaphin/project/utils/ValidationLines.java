/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author marat
 */
public class ValidationLines {

    public List<String[]> validateDetached(List<String[]> detached) {
	List<String[]> validated = new ArrayList<>();
	Pattern pattern = Pattern.compile("[d]+[\\.]{1}[d]+");
	http://search.of.correct
	for (String[] pack : detached) {
	    if (pack.length != 8) {
		continue;//TODO добавить запись события в лог
	    }
	    for (String single : pack) {
		Matcher matcher = pattern.matcher(single);
		if (!matcher.find()) {
		    continue http;//TODO добавить запись события в лог
		}
	    }
	    validated.add(pack);
	}
	return validated;
    }
}
