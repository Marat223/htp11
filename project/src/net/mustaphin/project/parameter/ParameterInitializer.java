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
import net.mustaphin.project.action.particular.ConvexParticular;
import net.mustaphin.project.action.particular.specifierFactory.AbstractFactoryParticular;
import net.mustaphin.project.action.particular.specifierFactory.RhombFactroryParticular;
import net.mustaphin.project.action.particular.specifierFactory.SquareFactoryParticular;
import net.mustaphin.project.action.particular.specifierFactory.TrapezeFactroryParticular;
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
	List<AbstractFactoryParticular> factorySpecifier = new ArrayList<>();
	factorySpecifier.add(new RhombFactroryParticular());
	factorySpecifier.add(new SquareFactoryParticular());
	factorySpecifier.add(new TrapezeFactroryParticular());
	for (AbstractFactoryParticular specifier : factorySpecifier) {
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
