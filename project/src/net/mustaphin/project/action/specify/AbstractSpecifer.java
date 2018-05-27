/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public abstract class AbstractSpecifer {

    public double findLengthSide(Point a, Point b) {
	return Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2))); //теорема Пифагора
    }
    
    //передаваемые значения - стороны треугольника образованные от двух сторон прямоугольника и стороны противолежащей искомому углу
    public double calcCos(double a, double b, double c) { //первым значением должна быть противолежащая искомому углу сторона
	double angle = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 * b * c; //теорема косинусов
	return angle;
    }
}
