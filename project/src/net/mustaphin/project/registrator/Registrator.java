/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.registrator;

import java.util.HashMap;
import java.util.Map;
import net.mustaphin.project.parameter.GeometricalParameter;

/**
 *
 * @author marat
 */
public class Registrator {

    private final static Registrator INSTANCE = new Registrator();

    public static Registrator getInstance() {
	return INSTANCE;
    }

    private Map<Integer, GeometricalParameter> parameters = new HashMap<>();

    private Registrator() {
    }

}
