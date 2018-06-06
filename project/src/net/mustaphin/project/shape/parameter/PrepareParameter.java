/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape.parameter;

import net.mustaphin.project.action.specifier.Specifier;
import net.mustaphin.project.action.specifier.specifierFactory.AbstractFactorySpecifier;

/**
 *
 * @author marat
 */
public class PrepareParameter {

    private double[] side;
    private double[] cos;

    public boolean checkSpecification(AbstractFactorySpecifier factorySpecifier) {
	Specifier specifier = factorySpecifier.createSpecifier();
	
	return false;
    }

    public double[] getSide() {
	return side;
    }

    public void setSide(double[] side) {
	this.side = side;
    }

    public double[] getCos() {
	return cos;
    }

    public void setCos(double[] cos) {
	this.cos = cos;
    }

}
