/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.area.areaFactory;

import net.mustaphin.project.action.area.Area;
import net.mustaphin.project.action.area.RhombArea;

/**
 *
 * @author marat
 */
public class RhombAreaFactory extends AbstractAreaFactory {

    @Override
    public Area createArea() {
	return new RhombArea();
    }

}
