/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier;

/**
 *
 * @author marat
 */
public class SquareSpecifer extends Specifer {

    public boolean areAllSpecificationsSame(double spec[]) { //можно проверять на равернство стороны или косинусы углов
	for (int i = 0; i < spec.length - 1; i++) {
	    for (int k = i; k > 0; k--) {
		if (spec[k] != spec[k - 1]) {
		    return false;
		}
	    }
	}
	return true;
    }
}
