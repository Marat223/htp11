/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.observer;

import net.mustaphin.project.parameter.registrator.Registrator;
import net.mustaphin.project.parameter.ParameterInitializer;
import net.mustaphin.project.parameter.GeometricalParameter;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonObserver implements Observer {
    
    @Override
    public void handleEvent(Tetragon tetragon) {
	GeometricalParameter parameter = ParameterInitializer.initialize(tetragon.getPoint());
	Registrator.getInstance().insertParameter(tetragon.getId(), parameter);
    }
    
}
