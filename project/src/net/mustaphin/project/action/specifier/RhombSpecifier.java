/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier;

import net.mustaphin.project.action.parameter.PrepareParameter;
import net.mustaphin.project.constant.ShapeType;

/**
 *
 * @author marat
 */
public class RhombSpecifier extends Specifier {

    @Override
    public boolean specify(PrepareParameter prepare) {
	type = ShapeType.RHOMB;
	double side[] = prepare.getSide();
	double cos[] = prepare.getCos();
	boolean cosCrossSame = cos[0] == cos[2] && cos[1] == cos[3];
	boolean sidesSame = side[0] == side[1] && side[2] == side[3];
	return cosCrossSame && sidesSame;
    }

}
