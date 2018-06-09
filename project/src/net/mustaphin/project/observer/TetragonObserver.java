/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.mustaphin.project.action.parameter.GeometricalParameter;
import net.mustaphin.project.action.parameter.PrepareParameter;
import net.mustaphin.project.action.specifier.ConvexSpecifer;
import net.mustaphin.project.action.specifier.specifierFactory.AbstractFactorySpecifier;
import net.mustaphin.project.action.specifier.specifierFactory.RhombFactrorySpecifier;
import net.mustaphin.project.action.specifier.specifierFactory.SquareFactorySpecifier;
import net.mustaphin.project.action.specifier.specifierFactory.TrapezeFactrorySpecifier;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonObserver implements Observer {

    private ArrayList<Tetragon> list = new ArrayList<>();

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
	PrepareParameter prepare = new PrepareParameter(point);
	boolean result = new ConvexSpecifer().specify(prepare);
	parameter.setIsConvex(result);
	List<AbstractFactorySpecifier> factorySpecifier = new ArrayList<>();
	factorySpecifier.add(new RhombFactrorySpecifier());
	factorySpecifier.add(new SquareFactorySpecifier());
	factorySpecifier.add(new TrapezeFactrorySpecifier());
	for (AbstractFactorySpecifier specifier : factorySpecifier) {
	    if (prepare.checkSpecification(specifier)) {
		
	    }
	}

    }

}
