/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.observer;

import java.util.ArrayList;
import java.util.Iterator;
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
import net.mustaphin.project.parameter.GeometricalParameter;
import net.mustaphin.project.parameter.PrepareParameter;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonObserver implements Observer {

    private ArrayList<Tetragon> list = new ArrayList<>();//TODO сделать из этого репозиторий

    public void addObservable(Tetragon tetragon) {
	list.add(tetragon);
    }

    public void removeObservable(Tetragon tetragon) {
	Iterator<Tetragon> it = list.iterator();
	while (it.hasNext()) {
	    if (it.next().equals(tetragon)) {
		it.remove();
		break;
	    }
	}
    }

    @Override
    public void handleEvent(Tetragon tetragon) {
	GeometricalParameter parameter = new GeometricalParameter();
	Point point[] = tetragon.getPoint();
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
    }

}
