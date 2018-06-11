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

    private final static Registrator INSTANCE = new Registrator();

    public static Registrator getINSTANCE() {
	return INSTANCE;
    }

    private Map<Integer, GeometricalParameter> parameters = new HashMap<>();

    private Registrator() {
    }

    public Map<Integer, GeometricalParameter> getParameters() {
	return parameters;
    }

    public void insertParameter(int id, GeometricalParameter external) { //2 ретурна
	parameters.put(id, external);
    }

    public GeometricalParameter getParameter(int index) {
	return parameters.get(index);
    }

    public void removeParameter(int index) {
	parameters.remove(index);
    }

}
