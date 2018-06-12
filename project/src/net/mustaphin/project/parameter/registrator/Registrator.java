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

    private final static Registrator INSTANCE = new Registrator();
  private List<GeometricalParameter> parameters = new ArrayList<>();
    public static Registrator getINSTANCE() {
	return INSTANCE;
    }

  

    private Registrator() {
    }

    public List<GeometricalParameter> getParameters() {
	return parameters; //FIX
    }

    public void insertParameter(int id, GeometricalParameter external) {
	if (null == parameters.get(id)) {
	    parameters.add(id, external);
	} else {
	    parameters.set(id, external);
	}
    }

    public int getId(GeometricalParameter parameter) {
	return parameters.indexOf(parameter);
    }

    public GeometricalParameter getParameter(int id) {
	return parameters.get(id);
    }

    public void removeParameter(int id) {
	parameters.remove(id);
    }

}
