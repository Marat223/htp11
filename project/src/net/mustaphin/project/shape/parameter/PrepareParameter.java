/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape.parameter;

import net.mustaphin.project.action.specifier.Specifier;
import net.mustaphin.project.action.specifier.specifierFactory.AbstractFactorySpecifier;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class PrepareParameter {

    private double[] side;
    private double[] cos;

    public boolean checkSpecification(AbstractFactorySpecifier factorySpecifier, double specs[]) {
	Specifier specifier = factorySpecifier.createSpecifier();
	return specifier.spcify(specs);
    }

    public static double[] findSides(Point point[]) {
	double side[] = new double[point.length];
	for (int i = 0; i < side.length; i++) {
	    int k = i + 1;
	    if (side.length - 1 == i) {
		k = 0;
	    }
	    side[i] = Math.hypot(point[i].getX() - point[k].getX(), point[i].getY() - point[k].getY());
	}
	return side;
    }

    //передаваемые значения - стороны треугольника образованные от двух сторон прямоугольника и стороны противолежащей искомому углу
    public double findCos(double a, double b, double c) { //первым значением должна быть противолежащая искомому углу сторона
	double angle = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 * b * c; //теорема косинусов
	return angle;
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
