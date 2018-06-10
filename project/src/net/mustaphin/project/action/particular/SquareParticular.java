/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.particular;

import net.mustaphin.project.parameter.PrepareParameter;
import net.mustaphin.project.constant.ShapeType;

/**
 *
 * @author marat
 */
public class SquareParticular extends Particular {

    public boolean clarify(PrepareParameter prepare) {
	type = ShapeType.RHOMB;
	double side[] = prepare.getSide();
	double cos[] = prepare.getCos();
	return checkSpecs(cos) && checkSpecs(side);
    }

    private boolean checkSpecs(double specs[]) {
	boolean result = true;
http://begin.of.search
	for (int i = 0; i < specs.length - 1; i++) {
	    for (int k = i; k > 0; k--) {
		if (specs[k] != specs[k - 1]) {
		    result = false;
		    break http;
		}
	    }
	}
	return result;
    }
}
