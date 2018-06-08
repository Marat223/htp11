/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape;

import java.util.Arrays;
import java.util.Objects;
import net.mustaphin.project.observer.TetragonObserver;

/**
 *
 * @author marat
 */
public class Tetragon {

    private int id;
    private Point point[] = new Point[4];
    private TetragonObserver observer;

    public Tetragon(Point point[]) {
	this.point = point;
	notifyObserver();
    }

    public void addObserver(TetragonObserver observer) {
	this.observer = observer;
	observer.addObservable(this);
    }

    public void removeObserver() {
	if (null != observer) {
	    observer.removeObservable(this);
	    observer = null;
	}
    }

    public void notifyObserver() {
	if (null != observer) {
	    observer.handleEvent(this);
	}
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Point[] getPoint() {
	return point;
    }

    public Point getPoint(int position) {
	return this.point[position];
    }

    public void setPoint(Point[] point) {
	this.point = point;
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 97 * hash + this.id;
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
	return "Tetragon{" + "id=" + id + ", point=" + point + ", observer=" + observer + '}';
    }

}
