/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.comparator_tetragon;

import java.util.Comparator;
import java.util.List;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class SortOperator {

    public List<Tetragon> sort(Comparator<Tetragon> comparator, List<Tetragon> tetragon) {
	tetragon.sort(comparator);
	return tetragon;
    }

}
