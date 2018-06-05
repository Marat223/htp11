/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.mustaphin.project.observer.TetragonObserver;

/**
 *
 * @author marat
 */
public class Tetragon {

    private int id;
    private List<Point> points = new ArrayList<>();
    private TetragonObserver observer;

    public Tetragon(List<Point> points) {
	this.points = points;
    }

    public void addObserver(TetragonObserver observer) {
	this.observer = observer;
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

    public void setPoints(List<Point> points) {
	this.points = points;
	notifyObserver();
    }

    public Point getPoint(int index) {
	return points.get(index);
    }

    @Override
    public int hashCode() {
	int hash = 3;
	hash = 79 * hash + this.id;
	hash = 79 * hash + Objects.hashCode(this.points);
	hash = 79 * hash + Objects.hashCode(this.observer);
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
	if (!Objects.equals(this.points, other.points)) {
	    return false;
	}
	if (!Objects.equals(this.observer, other.observer)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Tetragon{" + "id=" + id + ", points=" + points + ", observer=" + observer + '}';
    }

}
