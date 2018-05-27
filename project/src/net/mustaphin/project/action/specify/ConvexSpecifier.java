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
public class ConvexSpecifier {

    private List<Double> angleCos = new ArrayList<>();

    public double getAngleCos(int position) {
	return angleCos.get(position);
    }

    public void setAngleCos(double cos) {
	angleCos.add(cos);
    }

    public boolean check() {
	
	return false;
    }

    public double findLengthSide(Point a, Point b) {
	return Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2))); //теорема Пифагора
    }

    public double correlationAngle(double a, double b, double c) { //ервым значением должна быть противолежащая углу сторона
	double angle = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 * b * c; //теорема косинусов
	return Math.cos(angle);
    }

}
