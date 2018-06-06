/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier.specifierFactory;

import net.mustaphin.project.action.specifier.ConvexSpecifer;
import net.mustaphin.project.action.specifier.Specifier;

/**
 *
 * @author marat
 */
public class ConvexFactorySpecifier extends AbstractFactorySpecifier {

    @Override
    public Specifier getSpecifier() {
	return new ConvexSpecifer();
    }

}
