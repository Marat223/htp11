/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter.registrator;

import java.util.ArrayList;
import java.util.List;
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
    private List<GeometricalParameter> PARAMETER = new ArrayList<>();//TOKNOW

    private Registrator() {
    }

    public List<GeometricalParameter> getParameters() {
	return PARAMETER; //FIX
    }

    public void insertParameter(int id, GeometricalParameter external) {
	if (null == PARAMETER.get(id)) {
	    PARAMETER.add(id, external);
	} else {
	    PARAMETER.set(id, external);
	}
    }

    public int getId(GeometricalParameter parameter) {
	return PARAMETER.indexOf(parameter);
    }

    public GeometricalParameter getParameter(int id) {
	return PARAMETER.get(id);
    }

    public void removeParameter(int id) {
	PARAMETER.remove(id);
    }

}
