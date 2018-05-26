/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action;

/**
 *
 * @author marat
 */
public class CalcSide {

    public static double[] calc(double[] coordinate, int sideCount) {
	double side[] = new double[sideCount];
	for (int i = 0; i < sideCount; i++) {
	    for (int k = 0; k < coordinate.length; k++) {
		side[i] = Math.abs(coordinate[k] - coordinate[k += 2]);
	    }
	}
	return side;
    }
}
