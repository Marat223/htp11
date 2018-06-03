/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.parameter;

/**
 *
 * @author marat
 */
public class Parameter {

    private double area;
    private double perimeter;
    private boolean isTetragon;
    private boolean isConvex;

    public double getArea() {
	return area;
    }

    public void setArea(double area) {
	this.area = area;
    }

    public double getPerimeter() {
	return perimeter;
    }

    public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
    }

    public boolean isIsTetragon() {
	return isTetragon;
    }

    public void setIsTetragon(boolean isTetragon) {
	this.isTetragon = isTetragon;
    }

    public boolean isIsConvex() {
	return isConvex;
    }

    public void setIsConvex(boolean isConvex) {
	this.isConvex = isConvex;
    }

}
