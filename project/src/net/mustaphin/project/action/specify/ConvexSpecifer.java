/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

/**
 *
 * @author marat
 */
public class ConvexSpecifer extends AbstractSpecifer {

    public boolean isConvex(double sumCos) { //передаваемое значение - сумма всех косинусов
	boolean convex = false;
	if (1 == sumCos) {
	    convex = true;
	}
	return convex;
    }
}
