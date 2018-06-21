/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.area;

import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class SquareArea extends Area {
    
    @Override
    public double calc(Point[] point) {
	return Math.hypot(point[0].getX() - point[1].getX(), point[0].getY() - point[1].getY()) * Math.hypot(point[1].getX() - point[2].getX(), point[1].getY() - point[2].getY());
    }

}
