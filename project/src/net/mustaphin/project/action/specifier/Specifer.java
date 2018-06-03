/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier;

/**
 *
 * @author marat
 */
public abstract class Specifer {

    //передаваемые значения - стороны треугольника образованные от двух сторон прямоугольника и стороны противолежащей искомому углу
    public double findCos(double a, double b, double c) { //первым значением должна быть противолежащая искомому углу сторона
	double angle = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 * b * c; //теорема косинусов
	return angle;
    }
}
