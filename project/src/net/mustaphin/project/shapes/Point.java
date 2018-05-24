/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shapes;

/**
 *
 * @author marat
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
	this.x = x;
	this.y = y;
    }
    
    public double getX() {
	return x;
    }

    public void setX(double x) {
	this.x = x;
    }

    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 89 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
	hash = 89 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final Point other = (Point) obj;
	if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
	    return false;
	}
	if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Podouble{" + "x=" + x + ", y=" + y + '}';
    }

}
