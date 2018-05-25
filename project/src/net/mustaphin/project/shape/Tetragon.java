/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author marat
 */
public class Tetragon {

    private double square;
    private double perimeter;
    private List<Point> points = new ArrayList<>();

    private Tetragon() {
    }

    public double getSquare() {
	return square;
    }

    public void setSquare(double square) {
	this.square = square;
    }

    public double getPerimeter() {
	return perimeter;
    }

    public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
    }

    public void addPoint(Point podouble) {
	points.add(podouble);
    }

    public Point getPoint(int index) {
	return points.get(index);
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 79 * hash + (int) (Double.doubleToLongBits(this.square) ^ (Double.doubleToLongBits(this.square) >>> 32));
	hash = 79 * hash + (int) (Double.doubleToLongBits(this.perimeter) ^ (Double.doubleToLongBits(this.perimeter) >>> 32));
	hash = 79 * hash + Objects.hashCode(this.points);
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
	final Tetragon other = (Tetragon) obj;
	if (Double.doubleToLongBits(this.square) != Double.doubleToLongBits(other.square)) {
	    return false;
	}
	if (Double.doubleToLongBits(this.perimeter) != Double.doubleToLongBits(other.perimeter)) {
	    return false;
	}
	if (!Objects.equals(this.points, other.points)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Tetragon{" + "square=" + square + ", perimeter=" + perimeter + ", points=" + points + '}';
    }

}
