/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier;

/**
 *
 * @author marat
 */
public class ConvexSpecifer extends Specifier {

    public boolean spcify(double cos[]) { //передаваемое значение - сумма всех косинусов
	double sumCos = 0;
	for (double co : cos) {
	    sumCos += co;
	}
	boolean convex = false;
	if (1 == sumCos) {
	    convex = true;
	}
	return convex;
    }
}
