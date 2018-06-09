/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.registrator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mustaphin.project.observer.Observer;
import net.mustaphin.project.observer.TetragonObserver;
import net.mustaphin.project.readData.sequence.Sequencer;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class ShapeCombiner {

    public Map<Integer, Tetragon> tetragonsCreate(String path) {
	Map<Integer, Tetragon> tetragons = new HashMap<>();
	Observer observer = new TetragonObserver();
	int id = 0;
	for (Point[] stringToPoint : stringToPoints(Sequencer.sequenceInputData(path))) {
	    Tetragon tetragon = new Tetragon();
	    tetragon.addObserver(observer);
	    tetragon.setPoints(stringToPoint);
	    tetragons.put(id++, tetragon);
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
