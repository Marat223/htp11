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

    private double a;
    private double b;

    public SpecificationByAreaRange(double a, double b) {
	this.a = a;
	this.b = b;
    }

    @Override
    public List<Tetragon> specified(List<Tetragon> repository) {
	List<Tetragon> tetragons = new ArrayList<>();
	Map<Integer, GeometricalParameter> parameters = Registrator.getINSTANCE().getParameters();
	for (Map.Entry<Integer, GeometricalParameter> couple : parameters.entrySet()) {
	    double area = couple.getValue().getArea();
	    if (a < area && area < b) {
		int id = couple.getKey();
	    }
	}
	return tetragons;
    }

}
