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
    private int id;

    public Tetragon(Point point[]) {
	this.point = point;
	notifyObserver();
    }

    public Tetragon() {
    }

    public Observer getObserver() {
	return observer;
    }

    public void setObserver(Observer observer) {
	this.observer = observer;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
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

    public void setPoints(Point[] point) {
	this.point = point;
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 17 * hash + Arrays.deepHashCode(this.point);
	hash = 17 * hash + Objects.hashCode(this.observer);
	hash = 17 * hash + this.id;
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
	return "Tetragon{" + "point=" + point + ", observer=" + observer + ", id=" + id + '}';
    }

}
