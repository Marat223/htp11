/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter.registrator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mustaphin.project.parameter.GeometricalParameter;

/**
 *
 * @author marat
 */
public class Registrator {

    private final static Registrator INSTANCE = new Registrator();

    public static Registrator getInstance() {
	return INSTANCE;
    }

    private Map<Integer, GeometricalParameter> parameters = new HashMap<>();

    private Registrator() {
    }

    public int insertParameter(int id, GeometricalParameter external) { //2 ретурна
	for (Map.Entry<Integer, GeometricalParameter> couple : parameters.entrySet()) {
	    if (external.equals(couple.getValue())) {
		return couple.getKey(); //добавить событие в логгер
	    }
	}
	parameters.put(generateId(), external);
	return parameters.size() - 1; //добавить событие в логгер
    }

    private int generateId() { //2 ретурна
	List<Integer> keys = new ArrayList<>(parameters.keySet());
	Collections.sort(keys);
	for (int i = 0; i < keys.size() - 1; i++) {
	    if (keys.size() - 1 != i) {
		if (keys.get(i) != keys.get(i + 1)) {
		    return keys.get(i + 1);
		}
	    }
	}
	return keys.get(keys.size() - 1) + 1;
    }

    public GeometricalParameter getParameter(int index) {
	return parameters.get(index);
    }

}
