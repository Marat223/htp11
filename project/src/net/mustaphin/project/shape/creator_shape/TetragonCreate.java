/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape.creator_shape;

import java.util.ArrayList;
import java.util.List;
import net.mustaphin.project.custom_excepoin.WrongInputFileException;
import net.mustaphin.project.observer.Observer;
import net.mustaphin.project.read_data.sequence.Sequencer;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonCreate {

    public List<Tetragon> create(String path, Observer observer) throws WrongInputFileException {
	List<Tetragon> allCreatedTetragons = new ArrayList<>();
	for (Point[] realPoints : stringToPoints(Sequencer.sequenceInputData(path))) {
	    Tetragon tetragon = new Tetragon(realPoints);
	    tetragon.setId(tetragon.hashCode());
	    allCreatedTetragons.add(tetragon);
	    tetragon.addObserver(observer);
	    tetragon.notifyObserver();
	}
	return allCreatedTetragons;
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
