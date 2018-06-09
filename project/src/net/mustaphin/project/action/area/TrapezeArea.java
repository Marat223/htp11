/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.area;

import static java.lang.Math.*;
import net.mustaphin.project.shape.Point;
import net.mustaphin.project.action.parameter.PrepareParameter;

/**
 *
 * @author marat
 */
public class TrapezeArea extends Area {
    
    @Override
    public double calc(Point[] point) {
	double side[] = PrepareParameter.findSides(point);
	double a = side[0];
	double b = side[1];
	double c = side[2];
	double d = side[3];
	return ((a + b) / 2) * sqrt(pow(c, 2) - pow((pow((b - a), 2) + pow(c, 2) - pow(d, 2)) / 2 * (b - a), 2));
    }

}
