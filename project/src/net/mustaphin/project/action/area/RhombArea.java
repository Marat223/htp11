/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.area;

import net.mustaphin.project.action.CalcSide;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public class RhombArea {

    public double calc(Point[] point) {
	return CalcSide.findLength(point[0], point[2]) * CalcSide.findLength(point[1], point[3]) / 2;
    }

}
