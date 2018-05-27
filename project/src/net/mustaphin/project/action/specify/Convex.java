/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

import java.util.ArrayList;
import java.util.List;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class Convex {

    private List<Double> cosine = new ArrayList<>();

    public double getAngleCos(int position) {
	return cosine.get(position);
    }

    public void setAngleCos(double cos) {
	cosine.add(cos);
    }

    public double sumCos() {
	double sum = 0;
	for (Double rad : cosine) {
	    sum += rad;
	}
	return sum;
    }

    public double findLengthSide(Point a, Point b) {
	return Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2))); //теорема Пифагора
    }

    public double calcCos(double a, double b, double c) { //ервым значением должна быть противолежащая искомому углу сторона
	double angle = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 * b * c; //теорема косинусов
	return angle;
    }

    public boolean isConvex() {
	boolean convex = false;
	if (1 == sumCos()) {
	    convex = true;
	}
	return convex;
    }
}
