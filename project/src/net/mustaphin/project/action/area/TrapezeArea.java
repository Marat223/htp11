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
public class TrapezeArea {

    public double calc(double side[], Point point[]) {
	return (side[0] + side[2]);
    }
}
