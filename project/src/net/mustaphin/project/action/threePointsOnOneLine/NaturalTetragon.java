/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.threePointsOnOneLine;

import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class NaturalTetragon {

    public boolean checkBetween(Point a, Point b, Point c) { //b - точка которая может лежать на отрезке между другими точками
	return (b.getX() - a.getX()) / (c.getX() - a.getX()) == (b.getY() - a.getY()) / (c.getY() - a.getY());
    }
}
