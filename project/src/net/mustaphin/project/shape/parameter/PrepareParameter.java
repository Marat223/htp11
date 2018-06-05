/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape.parameter;

/**
 *
 * @author marat
 */
public class PrepareParameter {

    private double[] side;

    private double[] cosA;

    public PrepareParameter(double[] side, double[] cosA) {
	this.side = side;
	this.cosA = cosA;
    }

    public double[] getSide() {
	return side;
    }

    public void setSide(double[] side) {
	this.side = side;
    }

    public double[] getCosA() {
	return cosA;
    }

    public void setCosA(double[] cosA) {
	this.cosA = cosA;
    }

}
