/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action;

import java.util.List;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class Measure {

    private int sideH;
    private int sideV;

    public double measureSideH(List<Point> points) {
	double sideH = points.get(0).getX() - points.get(1).getX();
	return Math.abs(sideH);
    }

    public double measureSideV(List<Point> points) {
	double sideV = points.get(0).getY() - points.get(3).getY();
	return Math.abs(sideV);
    }

    public int calcSquare(int sideH, int sideV) {
	return sideH * sideV;
    }

    public int calcPerimeter(int sideH, int sideV) {
	return 2 * sideH + 2 * sideV;
    }

    public boolean isTetragon(List<Point> points) {
	boolean isTetragon = true;
	int x = 0;
	int y = 0;
	for (Point point : points) {
//	    x = point.get()//TODO
	}
	return isTetragon;
    }

}
