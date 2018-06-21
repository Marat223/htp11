/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.particular;

import net.mustaphin.project.parameter.PrepareParameter;

/**
 *
 * @author marat
 */
public class ConvexParticular extends Particular {

    public boolean clarify(PrepareParameter prepare) { //передаваемое значение - сумма всех косинусов
	double cos[] = prepare.getCos();
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
