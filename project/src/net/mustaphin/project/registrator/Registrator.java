/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.registrator;

import java.util.HashMap;
import java.util.Map;
import net.mustaphin.project.observer.Observer;
import net.mustaphin.project.observer.TetragonObserver;
import net.mustaphin.project.parameter.GeometricalParameter;

/**
 *
 * @author marat
 */
public class Registrator {

    private Map<Integer, GeometricalParameter> parameters = new HashMap<>();
    Observer observer = new TetragonObserver();
}
