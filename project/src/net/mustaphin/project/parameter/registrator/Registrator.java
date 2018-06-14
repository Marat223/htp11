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

    public void insertParameter(int id, GeometricalParameter external) {//TODO заменить на Map
	parameter.put(id, external);
    }

    public int getId(GeometricalParameter externalParameter) {
	for(){
	    
	}
	return parameter.indexOf(externalParameter);
    }

    public GeometricalParameter getParameter(int id) {
	return parameter.get(id);
    }

    public void removeParameter(int id) {
	parameter.remove(id);
    }

}
