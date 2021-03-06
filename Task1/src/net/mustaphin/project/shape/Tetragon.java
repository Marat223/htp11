/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape;

import java.util.Arrays;
import java.util.Objects;
import net.mustaphin.project.observer.Observer;

/**
 *
 * @author marat
 */
public class Tetragon {

    private Point point[] = new Point[4];

    private Observer observer;
    private String name;
    private int id;

    public Tetragon(Point point[]) {
	this.point = point;
    }

    public Tetragon() {
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public void addObserver(Observer observer) {
	this.observer = observer;
	notifyObserver();
    }

    public void removeObserver() {
	if (null != observer) {
	    observer = null;
	}
    }

    public void notifyObserver() {
	if (null != observer) {
	    observer.handleEvent(this);
	}
    }

    public Point[] getPoint() {
	return point;
    }

    public Point getPoint(int position) {
	return this.point[position];
    }

    public void setPoint(int position, Point point) {
	this.point[position] = point;
	notifyObserver();
    }

    public void setPoints(Point[] point) {
	this.point = point;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public int hashCode() {
	int hash = 3;
	hash = 29 * hash + Arrays.deepHashCode(this.point);
	hash = 29 * hash + Objects.hashCode(this.observer);
	hash = 29 * hash + Objects.hashCode(this.name);
	hash = 29 * hash + this.id;
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
	if (this.id != other.id) {
	    return false;
	}
	if (!Objects.equals(this.name, other.name)) {
	    return false;
	}
	if (!Arrays.deepEquals(this.point, other.point)) {
	    return false;
	}
	if (!Objects.equals(this.observer, other.observer)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Tetragon{" + "point[]=" + point[0] + ", " + point[1] + ", " + point[2] + ", " + point[3] + ", observer=" + observer + ", name=" + name + ", id=" + id + '}';
    }

}
