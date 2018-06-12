/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.comparator_tetragon;

import java.util.Comparator;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class ComparatorTetragonByName implements Comparator<Tetragon> {

    @Override
    public int compare(Tetragon o1, Tetragon o2) {
	return o1.getName().compareTo(o2.getName());
    }

}
