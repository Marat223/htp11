/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifyType;

import net.mustaphin.project.action.specifier.Specifer;
import net.mustaphin.project.action.specifier.SquareSpecifer;

/**
 *
 * @author marat
 */
public class RhombFactrorySpecifer extends AbstractFactorySpecifier {

    @Override
    public Specifer specify() {
	return new SquareSpecifer();
    }

}
