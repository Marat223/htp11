/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

import java.util.ArrayList;
import java.util.List;
import net.mustaphin.project.action.area.Area;
import net.mustaphin.project.action.area.RhombArea;
import net.mustaphin.project.action.area.SquareArea;
import net.mustaphin.project.action.area.TrapezeArea;
import net.mustaphin.project.action.natural_tetragon.NaturalTetragon;
import net.mustaphin.project.action.particular.ConvexParticular;
import net.mustaphin.project.action.particular.Particular;
import net.mustaphin.project.action.particular.RhombParticular;
import net.mustaphin.project.action.particular.SquareParticular;
import net.mustaphin.project.action.particular.TrapezeParticular;
import net.mustaphin.project.action.perimeter.CalcPerimeter;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class ParameterInitializer {

    public GeometricalParameter initialize(Point point[]) {
	GeometricalParameter parameter = new GeometricalParameter();
	PrepareParameter prepare = new PrepareParameter(point);
	checkNatural(point, parameter);
	findPerimeter(parameter, prepare);
	checkConvex(parameter, prepare);
	checkType(parameter, prepare);
	findSquare(parameter, prepare);
	return parameter;
    }

    private void checkNatural(Point point[], GeometricalParameter parameter) {
	NaturalTetragon natural = new NaturalTetragon();
	parameter.setIsTetragon(natural.checkNatural(point));
    }

    private void checkConvex(GeometricalParameter parameter, PrepareParameter prepare) {
	boolean result = new ConvexParticular().clarify(prepare);
	parameter.setIsConvex(result);
    }

    private void checkType(GeometricalParameter parameter, PrepareParameter prepare) {
	List<Particular> particulars = new ArrayList<>();
	particulars.add(new RhombParticular());
	particulars.add(new SquareParticular());
	particulars.add(new TrapezeParticular());
	for (Particular particular : particulars) {
	    if (prepare.checkSpecification(particular)) {
		parameter.setType(prepare.getShapeType());
		break;
	    }
	}
    }

    private void findSquare(GeometricalParameter parameter, PrepareParameter prepare) {
	Area area = null;
	switch (parameter.getType()) {
	    case RHOMB:
		area = new RhombArea();
		break;
	    case SQUARE:
		area = new SquareArea();
		break;
	    case TRAPEZE:
		area = new TrapezeArea();
		break;
	    default:
		// TODO бросить исключение
		break;
	}
	parameter.setArea(prepare.findArea(area));
    }

    private void findPerimeter(GeometricalParameter parameter, PrepareParameter prepare) {
	parameter.setPerimeter(CalcPerimeter.calc(prepare.getSide()));
    }
}
