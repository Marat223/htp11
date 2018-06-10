/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

import net.mustaphin.project.action.area.Area;
import net.mustaphin.project.action.area.areaFactory.AbstractAreaFactory;
import net.mustaphin.project.action.particular.Particular;
import net.mustaphin.project.action.particular.specifierFactory.AbstractFactoryParticular;
import net.mustaphin.project.constant.ShapeType;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class PrepareParameter {

    private double[] side = new double[4];
    private double[] cos = new double[4];
    private Point[] point = new Point[4];
    private ShapeType shapeType;

    public PrepareParameter(Point point[]) {
	this.side = findSides(point);
	this.cos = findCos(side);
	this.point = point;
    }

    public boolean checkSpecification(AbstractFactoryParticular factorySpecifier) {
	Particular specifier = factorySpecifier.createParticular();
	shapeType = specifier.getType();
	return specifier.clarify(this);
    }

    public double findArea(AbstractAreaFactory areaFactory) {
	Area area = areaFactory.createArea();
	return area.calc(point);
    }

    public static double[] findSides(Point point[]) {
	double side[] = new double[point.length];
	for (int i = 0; i < side.length; i++) {
	    int k = (i + 1 == side.length) ? 0 : i + 1;
	    side[i] = Math.hypot(point[i].getX() - point[k].getX(), point[i].getY() - point[k].getY());
	}
	return side;
    }

    //передаваемые значения - стороны треугольника образованные от двух сторон прямоугольника и стороны противолежащей искомому углу
    public double findCos(double a, double b, double c) { //первым значением должна быть противолежащая искомому углу сторона
	return (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 * b * c; //теорема косинусов;
    }

    public double[] findCos(double side[]) {
	double cos[] = new double[4];
	for (int i = 0; i < side.length; i++) {
	    int k = 0;
	    if (side.length - 3 > i) {
		k = i + 2;
	    } else {
		k = i - (side.length - 3);
	    }
	    double side3 = Math.hypot(side[i] - side[k], side[i] - side[k]);
	    cos[i] = findCos(side3, side[i], side[k]);
	}
	return cos;
    }

    public ShapeType getShapeType() {
	return shapeType;
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
