/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;
import net.mustaphin.project.shape.parameter.GeometricalParameter;
import net.mustaphin.project.shape.parameter.PrepareParameter;

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
	PrepareParameter prepare ;
	List<Point> points = tetragon.getPoints();
    }

}
