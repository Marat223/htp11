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

    public Tetragon(Point point[]) {
	this.point = point;
	notifyObserver();
    }

    public Tetragon() {
    }

    public void addObserver(Observer observer) {
	this.observer = observer;
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

    public void init(Point[] point) {
	this.point = point;
	notifyObserver();
    }

    public void setPoint(int position, Point point) {
	this.point[position] = point;
	notifyObserver();
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 97 * hash + Arrays.deepHashCode(this.point);
	hash = 97 * hash + Objects.hashCode(this.observer);
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
	return "Tetragon{" + ", point=" + point + ", observer=" + observer + '}';
    }

}
