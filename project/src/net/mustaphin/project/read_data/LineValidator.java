/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.read_data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.mustaphin.project.constant.CoordinateRegular;

/**
 *
 * @author marat
 */
public class LineValidator {

    public List<String[]> validateDetached(List<String[]> detached, int amount) {//amount 8 если четырёхугольник
	List<String[]> validated = new ArrayList<>();
	Pattern pattern = Pattern.compile(CoordinateRegular.COORDINATE);// [\\d]+\\.[\\d]+
	for (String[] pack : detached) {
	    if (pack.length != amount) {
		continue;//TODO добавить запись события в лог
	    }
	    List<String> valid = new ArrayList<>();
	    for (String single : pack) {
		Matcher matcher = pattern.matcher(single);
		if (!matcher.find()) {
		    break;
		}
		valid.add(single);
	    }
	    if (valid.size() == amount) {
		validated.add(valid.toArray(new String[8]));
	    }
	}
	return validated;
    }

}
