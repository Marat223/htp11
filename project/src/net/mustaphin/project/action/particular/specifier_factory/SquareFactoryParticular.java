/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.particular.specifier_factory;

import net.mustaphin.project.action.particular.Particular;
import net.mustaphin.project.action.particular.SquareParticular;

/**
 *
 * @author marat
 */
public class SquareFactoryParticular extends AbstractFactoryParticular {

    @Override
    public Particular createParticular() {
	return new SquareParticular();
    }

}
