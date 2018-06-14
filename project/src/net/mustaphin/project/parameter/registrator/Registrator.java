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
    private final List<GeometricalParameter> parameter = new ArrayList<>();

    private Registrator() {
    }

    public List<GeometricalParameter> getParameters() {
	return parameter; //TODO убрать возврат всей коллекции
    }

    public void insertParameter(int id, GeometricalParameter external) {//TODO заменить на Map
	if (null == parameter.get(id)) {
	    parameter.add(id, external);
	} else {
	    parameter.set(id, external);
	}
    }

    public int getId(GeometricalParameter externalParameter) {
	return parameter.indexOf(externalParameter);
    }

    public GeometricalParameter getParameter(int id) {
	return parameter.get(id);
    }

    public void removeParameter(int id) {
	parameter.remove(id);
    }

}
