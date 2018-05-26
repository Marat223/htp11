/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

import java.util.List;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class ConvexSpecifier extends AbstractSpecifer {

    @Override
    public boolean check(List<Point> points) {

	return false;
    }

    private double findLengthSide(Point a, Point b) {
	return Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2))); //теорема Пифагора
    }

    private double findCorner(double side1, double side2) {
	
	return 0;
    }

}
