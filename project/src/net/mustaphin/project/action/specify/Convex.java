/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marat
 */
public class Convex extends AbstractSpecifer {

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

    public boolean isConvex() {
	boolean convex = false;
	if (1 == sumCos()) {
	    convex = true;
	}
	return convex;
    }
}
