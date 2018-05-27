/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action;

import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class CalcSide {

    public double findLengthSide(Point a, Point b) {
	return Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2))); //теорема Пифагора
    }

}
