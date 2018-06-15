/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.mustaphin.project.custom_excepoin.IncorrectGeometricalParameterException;
import net.mustaphin.project.parameter.GeometricalParameter;
import net.mustaphin.project.parameter.registrator.Registrator;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class SpecificationByAreaRange implements ISpecification {

    private double min;
    private double max;

    public SpecificationByAreaRange(double min, double max) {
	this.min = min;
	this.max = max;
    }

    @Override
    public List<Tetragon> specified(List<Tetragon> repository) {
	List<Tetragon> tetragons = new ArrayList<>();
	Registrator registrator = Registrator.getInstance();
	Map<Integer, GeometricalParameter> parameters = registrator.getParameters();
	for (Map.Entry<Integer, GeometricalParameter> couple : parameters.entrySet()) {
	    double square = couple.getValue().getArea();
	    if (min < square && max > square) {
		try {
		    int id = registrator.getId(couple.getValue());
		    List<Tetragon> specified = new SpecificationById(id).specified(repository);
		    tetragons.addAll(specified);
		} catch (IncorrectGeometricalParameterException ex) {
		    Logger.getLogger(SpecificationByAreaRange.class.getName()).log(Level.SEVERE, null, ex);
		}
	    }
	}
	return tetragons;
    }

}
