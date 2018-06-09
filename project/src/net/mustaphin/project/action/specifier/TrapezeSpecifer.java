/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specifier;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.mustaphin.project.parameter.PrepareParameter;
import net.mustaphin.project.constant.ShapeType;

/**
 *
 * @author marat
 */
public class TrapezeSpecifer extends Specifier {

    public boolean specify(PrepareParameter prepare) {
	type = ShapeType.TRAPEZE;
	int cornerType[] = cornerType(prepare.getCos());
	return checkType(cornerType);
    }

    private boolean checkType(int cornerType[]) {
	boolean result = false;
	int type[][] = {{1, -1, -1, 1}, {0, -1, 1, 0}};
	for (int i = 0; i < type.length; i++) {
	    List<Integer> current = Arrays.asList(type[i][0], type[i][1], type[i][2], type[i][3]);
	    Iterator<Integer> corner = current.iterator();
http://start.of.searh
	    for (int angle : cornerType) {
		while (corner.hasNext()) {
		    Integer next = corner.next();
		    if (next == angle) {
			corner.remove();
			continue http;
		    }
		}
	    }
	    if (current.isEmpty()) {
		result = true;
		break;
	    }
	}
	return result;
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
