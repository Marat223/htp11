/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter.registrator;

import java.util.HashMap;
import java.util.Map;
import net.mustaphin.project.parameter.GeometricalParameter;

/**
 *
 * @author marat
 */
public class Registrator {

    private final static Registrator instance = new Registrator();

    public static Registrator getInstance() {
	return instance;
    }
    private final Map<Integer, GeometricalParameter> parameter = new HashMap<>();

    private Registrator() {
    }

    public void insertParameter(int id, GeometricalParameter external) {
	parameter.put(id, external);
    }

    public int getId(GeometricalParameter externalParameter) {
	int id = -1;
	for (Map.Entry<Integer, GeometricalParameter> couple : parameter.entrySet()) {
	    if (externalParameter.equals(couple.getValue())) {
		id = couple.getKey();
	    }
	}
	return id;
    }

    public GeometricalParameter getParameter(int id) {
	return parameter.get(id);
    }

    public Map<Integer, GeometricalParameter> getParameters() {
	return new HashMap<>(parameter);
    }

    public void removeParameter(int id) {
	parameter.remove(id);
    }

}
