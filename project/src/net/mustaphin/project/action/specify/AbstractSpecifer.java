/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

import java.util.List;
import net.mustaphin.project.shape.Point;

/**
 *
 * @author marat
 */
public abstract class AbstractSpecifer {

    public abstract boolean check(List<Point>points);
}
