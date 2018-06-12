/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.particular.specifier_factory;

import net.mustaphin.project.action.particular.RhombParticular;
import net.mustaphin.project.action.particular.Particular;

/**
 *
 * @author marat
 */
public class RhombFactroryParticular extends AbstractFactoryParticular {

    @Override
    public Particular createParticular() {
	return new RhombParticular();
    }

}
