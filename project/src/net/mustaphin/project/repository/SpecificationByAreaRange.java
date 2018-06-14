/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
	
	for (GeometricalParameter parameter : parameters) {
	    double square = parameter.getArea();
	    if (min < square && max > square) {
		int id = registrator.getId(parameter);
		tetragons.add(repository.get(id));
	    }
	}
	return tetragons;
    }

}
