/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.perimeter;

/**
 *
 * @author marat
 */
public class CalcPerimeter {

    public static double calc(double[] side) {
	double perimeter = 0;
	for (double single : side) {
	    perimeter += single;
	}
	return perimeter;
    }
}
