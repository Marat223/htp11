/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.comparatorTetragon;

import java.util.Comparator;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class ComparatorTetragonBy1stPointY implements Comparator<Tetragon> {

    @Override
    public int compare(Tetragon o1, Tetragon o2) {
	Point point1 = o1.getPoint(0);
	Point point2 = o1.getPoint(0);
	return Double.compare(point1.getY(), point2.getY());
    }
}
