/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter.registrator;

import java.util.HashMap;
import java.util.Map;
import net.mustaphin.project.custom_excepoin.IncorrectGeometricalParameterException;
import net.mustaphin.project.custom_excepoin.RegistratorException;
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

    public int getId(GeometricalParameter externalParameter) throws IncorrectGeometricalParameterException {
	for (Map.Entry<Integer, GeometricalParameter> couple : parameter.entrySet()) {
	    if (externalParameter.equals(couple.getValue())) {
		return couple.getKey();
	    }
	}
	throw new IncorrectGeometricalParameterException();
    }

    public GeometricalParameter getParameter(int id) throws RegistratorException {
	if(null==parameter.get(id)){
	    return parameter.get(id);
	}
	throw new RegistratorException("unsuccessful getting attemption - registrator does not contain a figure with this id");
    }

    public Map<Integer, GeometricalParameter> getParameters() {
	return new HashMap<>(parameter);
    }

    public void removeParameter(int id) throws RegistratorException {
	if (null == parameter.remove(id)) {
	    throw new RegistratorException("unsuccessful removing attemption - wrong figure id");
	}
    }

}
