/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

import java.util.ArrayList;
import java.util.List;
import net.mustaphin.project.action.area.areaFactory.AbstractAreaFactory;
import net.mustaphin.project.action.area.areaFactory.RhombAreaFactory;
import net.mustaphin.project.action.area.areaFactory.SquareAreaFactory;
import net.mustaphin.project.action.area.areaFactory.TrapezeAreaFactory;
import net.mustaphin.project.action.naturalTetragon.NaturalTetragon;
import net.mustaphin.project.action.perimeter.CalcPerimeter;
import net.mustaphin.project.action.specifier.ConvexSpecifer;
import net.mustaphin.project.action.specifier.specifierFactory.AbstractFactorySpecifier;
import net.mustaphin.project.action.specifier.specifierFactory.RhombFactrorySpecifier;
import net.mustaphin.project.action.specifier.specifierFactory.SquareFactorySpecifier;
import net.mustaphin.project.action.specifier.specifierFactory.TrapezeFactrorySpecifier;
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
	boolean result = new ConvexSpecifer().specify(prepare);
	parameter.setIsConvex(result);
    }

    private void checkType(GeometricalParameter parameter, PrepareParameter prepare) {
	List<AbstractFactorySpecifier> factorySpecifier = new ArrayList<>();
	factorySpecifier.add(new RhombFactrorySpecifier());
	factorySpecifier.add(new SquareFactorySpecifier());
	factorySpecifier.add(new TrapezeFactrorySpecifier());
	for (AbstractFactorySpecifier specifier : factorySpecifier) {
	    if (prepare.checkSpecification(specifier)) {
		parameter.setType(prepare.getShapeType());
		break;
	    }
	}
    }

    private void findSquare(GeometricalParameter parameter, PrepareParameter prepare) {
	AbstractAreaFactory areaFactory = null;
	switch (parameter.getType()) {
	    case RHOMB:
		areaFactory = new RhombAreaFactory();
		break;
	    case SQUARE:
		areaFactory = new SquareAreaFactory();
		break;
	    case TRAPEZE:
		areaFactory = new TrapezeAreaFactory();
		break;
	    default:
		// TODO бросить исключение
		break;
	}
	parameter.setArea(prepare.findArea(areaFactory));
    }
    
    private void findPerimeter(GeometricalParameter parameter, PrepareParameter prepare){
	parameter.setPerimeter(CalcPerimeter.calc(prepare.getSide()));
    }
}
