/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import net.mustaphin.project.observer.Observer;
import net.mustaphin.project.readData.sequence.Sequencer;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class ParameterInitializer {

    public static GeometricalParameter initialize(Point point[]) {
	GeometricalParameter parameter = new GeometricalParameter();
	NaturalTetragon natural = new NaturalTetragon();
	parameter.setIsTetragon(natural.checkNatural(point));
	PrepareParameter prepare = new PrepareParameter(point);
	parameter.setPerimeter(CalcPerimeter.calc(prepare.getSide()));
	boolean result = new ConvexSpecifer().specify(prepare);
	parameter.setIsConvex(result);
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
	return parameter;
    }

    public Map<Integer, Tetragon> tetragonsCreate(String path, Observer observer) {
	Map<Integer, Tetragon> tetragons = new HashMap<>();
	int id = 0;
	for (Point[] realPoints : stringToPoints(Sequencer.sequenceInputData(path))) {
	    Tetragon tetragon = new Tetragon();
	    tetragon.setId(++id);
	    tetragon.addObserver(observer);
	    tetragon.init(realPoints);
	    tetragons.put(id, tetragon);
	}
	return tetragons;
    }

    public List<Point[]> stringToPoints(List<String[]> stringCoordinate) {
	List<Point[]> points = new ArrayList<>();
	for (String[] pointCoordinate : stringCoordinate) {
	    Point point[] = new Point[4];
	    int k = 0;
	    for (int i = 0; i < pointCoordinate.length; i++) {
		point[k++] = new Point(pointCoordinate[i], pointCoordinate[++i]);
	    }
	    points.add(point);
	}
	return points;
    }

}
