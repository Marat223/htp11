/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.action.specify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author marat
 */
public class TrapezeSpecifer extends AbstractSpecifer {
    
    public final List<Integer> SYMERTICAL = Arrays.asList(1, -1, -1, 1);
    public final List<Integer> RECTANGULAR = Arrays.asList(0, 0, -1, 1);
    
    public boolean specifingTrapeze(int current[], List<Integer> type) { //первое значение - типы углов данной фигуры, второе значение 1 из 2 возможных видов
	boolean result = false;
	List<Integer> corners = new ArrayList<>(type);
	Iterator<Integer> corner = corners.iterator();
http://start.of.searh
	for (int single : current) {
	    while (corner.hasNext()) {
		Integer next = corner.next();
		if (next == single) {
		    corner.remove();
		    continue http;
		}
	    }
	}
	if (corners.isEmpty()) {
	    result = true;
	}
	return result;
    }
    
    public int cornerType(double cos) { //косинус больше нуля -угол острый
	if (0 < cos) {
	    return 1;
	} else if (0 > cos) {
	    return -1;
	}
	return 0;
    }

//    public enum CornerType {
//
//	SYMERTICAL {
//	    public int[] getCorners() {
//		int corner[] = {1, -1, -1, 1};
//		return corner;
//	    }
//	},
//	RECTANGULAR {
//	    public int[] getCorners() {
//		int corner[] = {0, 0, -1, 1};
//		return corner;
//	    }
//	}
//    }
}
