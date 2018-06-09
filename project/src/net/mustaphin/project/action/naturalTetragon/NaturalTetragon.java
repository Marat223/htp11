/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.naturalTetragon;

import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class NaturalTetragon {

    public boolean checkNatural(Point point[]) {
	boolean isNatural = true;
	int a = 0;
	int c = 0;
	for (int b = 0; b < point.length; b++) {
	    if (0 == b) {
		a = point.length - 1;
	    } else {
		a = b - 1;
	    }
	    if (point.length - 1 == b) {
		c = 0;
	    } else {
		c = b + 1;
	    }
	    if (checkThreePoints(point[a], point[b], point[c])) {
		isNatural = false;
		break;
	    }
	}
	return isNatural;
    }

    private boolean checkThreePoints(Point a, Point b, Point c) { //b - точка которая может лежать на отрезке между другими точками
	return (b.getX() - a.getX()) / (c.getX() - a.getX()) == (b.getY() - a.getY()) / (c.getY() - a.getY());
    }
}
