/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.area.area_factory;

import net.mustaphin.project.action.area.Area;
import net.mustaphin.project.action.area.TrapezeArea;

/**
 *
 * @author marat
 */
public class TrapezeAreaFactory extends AbstractAreaFactory {

    @Override
    public Area createArea() {
	return new TrapezeArea();
    }

}
