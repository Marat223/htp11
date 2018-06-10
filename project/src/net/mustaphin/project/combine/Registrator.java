/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.combine;

import java.util.HashMap;
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

    public void insertParameter(int id, GeometricalParameter parameter) {
	parameters.put(id, parameter);
    }

    public GeometricalParameter getParameter(int id) {
	return parameters.get(id);
    }

}
