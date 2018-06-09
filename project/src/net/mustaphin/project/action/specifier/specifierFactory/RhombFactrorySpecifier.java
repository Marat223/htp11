/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier.specifierFactory;

import net.mustaphin.project.action.specifier.RhombSpecifier;
import net.mustaphin.project.action.specifier.Specifier;

/**
 *
 * @author marat
 */
public class RhombFactrorySpecifier extends AbstractFactorySpecifier {

    @Override
    public Specifier createSpecifier() {
	return new RhombSpecifier();
    }

}