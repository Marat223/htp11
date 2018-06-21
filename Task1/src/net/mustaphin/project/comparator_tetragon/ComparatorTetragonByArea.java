/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.comparator_tetragon;

import java.util.Comparator;
import net.mustaphin.project.parameter.GeometricalParameter;
import net.mustaphin.project.parameter.registrator.Registrator;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class ComparatorTetragonByArea implements Comparator<Tetragon> {

    @Override
    public int compare(Tetragon o1, Tetragon o2) {
	GeometricalParameter parameter1 = Registrator.getInstance().getParameter(o1.getId());
	GeometricalParameter parameter2 = Registrator.getInstance().getParameter(o2.getId());
	double area1 = parameter1.getArea();
	double area2 = parameter2.getArea();
	return Double.compare(area1, area2);
    }

}
