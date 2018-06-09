/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier;

import net.mustaphin.project.parameter.PrepareParameter;
import net.mustaphin.project.constant.ShapeType;

/**
 *
 * @author marat
 */
public abstract class Specifier {

    protected ShapeType type;

    public ShapeType getType() {
	return type;
    }

    public abstract boolean specify(PrepareParameter prapare);

}
