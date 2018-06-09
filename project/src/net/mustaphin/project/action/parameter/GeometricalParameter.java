/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.parameter;

import java.util.Objects;
import net.mustaphin.project.constant.ShapeType;

/**
 *
 * @author marat
 */
public class GeometricalParameter {

    private double area;
    private double perimeter;
    private boolean isTetragon;
    private boolean isConvex;
    private ShapeType type;

    public ShapeType getType() {
	return type;
    }

    public void setType(ShapeType type) {
	this.type = type;
    }

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

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 59 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
	hash = 59 * hash + (int) (Double.doubleToLongBits(this.perimeter) ^ (Double.doubleToLongBits(this.perimeter) >>> 32));
	hash = 59 * hash + (this.isTetragon ? 1 : 0);
	hash = 59 * hash + (this.isConvex ? 1 : 0);
	hash = 59 * hash + Objects.hashCode(this.type);
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
	final GeometricalParameter other = (GeometricalParameter) obj;
	if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
	    return false;
	}
	if (Double.doubleToLongBits(this.perimeter) != Double.doubleToLongBits(other.perimeter)) {
	    return false;
	}
	if (this.isTetragon != other.isTetragon) {
	    return false;
	}
	if (this.isConvex != other.isConvex) {
	    return false;
	}
	if (this.type != other.type) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Parameter{" + "area=" + area + ", perimeter=" + perimeter + ", isTetragon=" + isTetragon + ", isConvex=" + isConvex + ", type=" + type + '}';
    }
    
    
}
