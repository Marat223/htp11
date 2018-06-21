/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.particular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.mustaphin.project.constant.ShapeType;
import net.mustaphin.project.parameter.PrepareParameter;

/**
 *
 * @author marat
 */
public class TrapezeParticular extends Particular {

    public boolean clarify(PrepareParameter prepare) {
	type = ShapeType.TRAPEZE;
	int cornerType[] = cornerType(prepare.getCos());
	return checkType(cornerType);
    }

    private boolean checkType(int cornerType[]) {
	boolean result = false;
	int type[][] = {{1, -1, -1, 1}, {0, -1, 1, 0}};
	for (int i = 0; i < type.length; i++) {
	    List<Integer> current =  new ArrayList<>(Arrays.asList(type[i][0], type[i][1], type[i][2], type[i][3]));
	    Iterator<Integer> corner = current.iterator();
	    for (int angle : cornerType) {
		checkSingleCorner(angle, corner);
	    }
	    if (current.isEmpty()) {
		result = true;
		break;
	    }
	}
	return result;
    }

    private void checkSingleCorner(int angle, final Iterator<Integer> corner) {
	while (corner.hasNext()) {
	    Integer next = corner.next();
	    if (next == angle) {
		corner.remove();
		break;
	    }
	}
    }

    public int[] cornerType(double cos[]) { //косинус больше нуля -угол острый
	int type[] = new int[4];
	for (int i = 0; i < 4; i++) {
	    if (0 < cos[i]) {
		type[i] = 1;
	    } else if (0 > cos[i]) {
		type[i] = -1;
	    }
	    type[i] = 0;
	}
	return type;
    }

}
