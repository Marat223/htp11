/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.area;

import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public abstract class Area {

    public static double[] calcSides(Point point[]) {
	double side[] = new double[point.length];
	for (int i = 0; i < side.length; i++) {
	    int k = i + 1;
	    if (side.length - 1 == i) {
		k = 0;
	    }
	    side[i] = Math.hypot(point[i].getX() - point[k].getX(), point[i].getY() - point[k].getY());
	}
	return side;
    }
}
