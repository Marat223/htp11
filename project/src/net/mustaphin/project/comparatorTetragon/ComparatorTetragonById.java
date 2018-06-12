/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.comparatorTetragon;

import java.util.Comparator;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class ComparatorTetragonById implements Comparator<Tetragon> {

    @Override
    public int compare(Tetragon o1, Tetragon o2) {
	return o1.getId() - o2.getId();
    }

}
